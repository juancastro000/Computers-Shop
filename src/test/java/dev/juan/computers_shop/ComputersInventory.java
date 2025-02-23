package dev.juan.computers_shop;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import org.junit.jupiter.api.Test;

public class ComputersInventory {

    @Test
    void testAddComputerToInventory(){

        ComputersInventory inventory = new ComputersInventory();
        Computer pc = new Computer("HP", 8, "AMD", "Linux", 1000);

        inventory.addComputer(pc);
        List<Computer> list = inventory.listed();

        assertThat(list, hasSize(1));
        assertThat(list, hasItem(pc));
    }

}
