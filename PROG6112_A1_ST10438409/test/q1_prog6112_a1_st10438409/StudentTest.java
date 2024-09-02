package q1_prog6112_a1_st10438409;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    public StudentTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        // Clear the studentList before each test
        Student.studentList.clear();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSaveStudent() {
        System.out.println("TestSaveStudent");
        Student student = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        String result = Student.SaveStudent(student);
        assertEquals("The new student was successfully added", result);
        assertEquals(1, Student.studentList.size());
        assertEquals(student, Student.studentList.get(0));
    }

    @Test
    public void testSearchStudent() {
        System.out.println("TestSearchStudent");
        Student student = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        Student.SaveStudent(student);
        String result = Student.SearchStudent("10111");
        String expected = "STUDENT ID: 10111\n" +
                          "STUDENT NAME: J.Bloggs\n" +
                          "STUDENT AGE: 19\n" +
                          "STUDENT EMAIL: jbloggs@ymail.com\n" +
                          "STUDENT COURSE: disd";
        assertEquals(expected, result);
    }

    @Test
    public void testSearchStudent_StudentNotFound() {
        System.out.println("TestSearchStudent_StudentNotFound");
        String result = Student.SearchStudent("99999");
        String expected = "Student with Student ID: 99999 was not found!";
        assertEquals(expected, result);
    }

    @Test
    public void testDeleteStudent() {
        System.out.println("TestDeleteStudent");
        Student student = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        Student.SaveStudent(student);
        String result = Student.DeleteStudent("10111");
        String expected = "Student with Student ID: 10111 WAS deleted!";
        assertEquals(expected, result);
        assertEquals(0, Student.studentList.size());
    }

    @Test
    public void testDeleteStudent_StudentNotFound() {
        System.out.println("TestDeleteStudent_StudentNotFound");
        String result = Student.DeleteStudent("99999");
        String expected = "No student matching ID: 99999 was found.";
        assertEquals(expected, result);
    }

    @Test
    public void testStudentAge_StudentAgeValid() {
        System.out.println("TestStudentAge_StudentAgeValid");
        boolean result = Student.StudentAgeValid("19");
        assertTrue(result);
    }

    @Test
    public void testStudentAge_StudentAgeInvalid() {
        System.out.println("TestStudentAge_StudentAgeInvalid");
        boolean result = Student.StudentAgeValid("15");
        assertFalse(result);
    }

    @Test
    public void testStudentAge_StudentAgeInvalidCharacter() {
        System.out.println("TestStudentAge_StudentAgeInvalidCharacter");
        boolean result = Student.StudentAgeValid("abc");
        assertFalse(result);
    }
}
