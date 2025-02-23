package dev.juan.computers_shop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ComputersInventoryTest {

    @Test
    void testAddComputerToInventory() {
        ComputersInventory inventory = new ComputersInventoryImpl(); // Implementación concreta
        Computer pc = new Computer("HP", 8, "AMD", "Linux", 1000);

        inventory.addComputer(pc);
        List<Computer> list = inventory.listed();

        
        assertThat(list, hasSize(1));
        assertThat(list, hasItem(pc));
    }

    @Test
    void testDeleteComputerFromInventory(){
        ComputersInventory inventory = new ComputersInventoryImpl();
        Computer pc = new Computer("HP", 8, "AMD", "Linux", 1000);

        inventory.addComputer(pc);
        inventory.deleteComputer(pc);
        List<Computer> list = inventory.listed();

        assertThat(list, hasSize(0));
        assertThat(list, not(hasItem(pc)));
    }

    @Test
    void testFindComputerByBrand(){
        ComputersInventory inventory = new ComputersInventoryImpl();
        Computer hp = new Computer("HP", 8, "AMD", "Linux", 1000);
        Computer dell = new Computer("Dell", 16, "Intel", "Windows", 1500);

        inventory.addComputer(dell);
        inventory.addComputer(hp);
        List<Computer> found = inventory.testFindComputerByBrand("HP");

        assertThat(found, hasSize(1));
        assertThat(found, hasItem(hp));
        assertThat(found, not(hasItem(dell)));

    }

}
