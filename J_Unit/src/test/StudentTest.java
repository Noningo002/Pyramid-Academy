import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student ("Raphael Ajaero", 24, "Margate Street");
    }
    @Test
    void getName(){
    assertEquals("Raphael Ajaero",student.getName());
    }
    @Test
    void setName(){
            student.setName("Everrett");
        assertEquals("Everrett",student.getName(), "Set Name Failed...");
    }
    @Test
    void getAge(){
        assertEquals(24,student.getAge());
    }
    @Test
    void setAge(){
        student.setAge(99);
        assertEquals(99,student.getAge());
    }
    @Test
    void groupedAssertions(){
        student.setName("Lindsay");
        student.setAge(99);

        assertAll("Test Props",
                () -> assertEquals("Lindsay", student.getName(), "First Name Failed"),
               () -> assertEquals(99, student.getAge(),"Wrong Age"),
            () -> assertEquals("Margate Street", student.getAddress(), "Wrong Address"));
}
}