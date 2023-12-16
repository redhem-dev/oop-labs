package Week11.StudentManagementSystem;

import org.junit.jupiter.api.Test;
import javax.sound.midi.Soundbank;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Collectors;

class MainTest {

    private static final String fileName = "/Users/edhemrogo/Desktop/students.csv";
    private static final String fileName2 = "/Users/edhemrogo/Desktop/empty.csv";

    @Test
    public void testifStudentisPresent(){
        StudentSystem system = new StudentSystem(fileName);
        List<Student> students = system.getAllStudents();
        assertFalse(students.isEmpty(), "There should be at least one student in the file");
    }

    @Test
    public void testStudentWithId100() throws StudentNotFoundException{
        StudentSystem system = new StudentSystem(fileName);
        try{
            assertFalse(system.getStudentByID(100).isPresent(), "Student with ID 100 is present");
        }
        catch (StudentNotFoundException e){
            throw new StudentNotFoundException("Student could not be found");
        }
    }

    @Test
    public void testStudentNull(){
        StudentSystem system = new StudentSystem(fileName);

        for(Student s : system.getAllStudents()){
            assertNotNull(s, "Student should not be null");
        }
    }

    @Test
    public void testHighestGPAStudent(){
        StudentSystem system = new StudentSystem(fileName);
        assertNotNull(system.getHighestGPAStudent(), "There should be a student with the highest GPA");
    }

    @Test
    public void testExceptionForEmptyStudentList(){
        StudentSystem system = new StudentSystem(fileName2);

        try{
            system.getAllStudents();
        }
        catch(EmptyStudentListException e){
            assertEquals(e.getMessage(), "List of students is empty.");
        }

    }

    @Test
    public void testNameArray(){
        StudentSystem system = new StudentSystem(fileName);
        List<String> actualNames =

                system.getAllStudents().stream()
                        .map(student -> student.getStudent_name())
                        .limit(5)
                        .collect(Collectors.toList());

        List<String> expectedName = List.of("Camila Wood", "Alexander Thompson", "Liam Taylor", "Evelyn Jenkins", "Michael Jackson");

        assertEquals(actualNames, expectedName, "First 5 names match.");
    }

    @Test
    public void testSize(){
        StudentSystem system = new StudentSystem(fileName);

        List<Student> students= system.getAllStudents();

        assertEquals(70, students.size(), "The file has 70 students.");

    }

    @Test
    public void testLargestName(){
        StudentSystem system = new StudentSystem(fileName);
        String expected = "Ana White";


        assertEquals(expected, system.getLongestNameStudent(), "Two names are equal");

    }

    @Test
    public void testStudents(){
        StudentSystem system = new StudentSystem(fileName);

        assertNotSame(system.getHighestGPAStudent(), system.getLongestNameStudent(), "Students should not be the same");
    }

    @Test
    public void testSameStudent() throws StudentNotFoundException{
        StudentSystem system = new StudentSystem(fileName);
        try{
            assertNotSame(system.getHighestGPAStudent(), system.getStudentByID(120), "Students should not be same");
        }
        catch (StudentNotFoundException e){
            throw new StudentNotFoundException("Student with ID 120 is not found");
        }

    }


}

