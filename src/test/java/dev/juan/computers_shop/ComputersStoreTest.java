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

        assertThat(store, is(notNullValue()));
        
    }
}


