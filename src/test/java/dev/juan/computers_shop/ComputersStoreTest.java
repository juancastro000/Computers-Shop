package dev.juan.computers_shop;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;
import java.util.List;

public class ComputersStoreTest {

    @Test
    void testComputerStoreInitialization() {
      
        ComputersInventory inventory = new ComputersInventoryImpl();
        ComputerStore store = new ComputerStore("Tech Store", "John", "1234", inventory);

        Computer pc = new Computer("Asus", 16, "Intel i9", "Windows", 2000);
        store.addComputer(pc);

        List<Computer> computers = store.listComputers();
        assertThat(computers, hasSize(1)); 
        assertThat(computers, hasItem(pc));
        
    }
}


