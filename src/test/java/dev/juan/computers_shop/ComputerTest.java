package dev.juan.computers_shop;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ComputerTest {

    @Test
    void testcreatecomputer(){
        Computer pc = new Computer("Dell", 16, "Intel i7", "Windows", 1500);
        assertThat(pc, is(notNullValue()));

    }
}
