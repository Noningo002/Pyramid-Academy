import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class GreetingTest {
    Greeting greeting;

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before all- I am only called once!!!");
    }

    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @DisplayName("Test Hello World")
    @Test
    void helloWord() {
        System.out.println(greeting.helloWorld());
        assertEquals("Hello World", greeting.helloWorld(), "Test #1 False");
    }

    @DisplayName("Test Hello Everrett")
    @Test
    void testhelloEverrett() {
        System.out.println(greeting.helloWorld("Everrett"));
        assertEquals("Hello Everrett", greeting.helloWorld("Everrett"), "Test #2 False");
    }

    @DisplayName("Test Hello Raphael")
    @Test
    void testhelloRaphael() {
        System.out.println(greeting.helloWorld("Raphael"));
        assertEquals("Hello Raphael", greeting.helloWorld("Raphael"), "Test #3 False");
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after Each");
    }

    @AfterAll
    public static void afterclass() {
        System.out.println("I am only called once");

    }
}


