import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class RaphaelTest {
    Raphael raphael;

    @BeforeEach
    void setUp() {
        raphael = new Raphael();
    }

    @Test
    void getName() {
        assertEquals("Ajaero", raphael.getName(), "What!");
    }
    @Test
    void getAge() {
        assertEquals(24, raphael.getAge(), "Raphael is Old." );
    }
    @AfterEach
    void tearDown() {
    }

}