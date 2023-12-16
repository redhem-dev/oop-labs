package Week11.StudentManagementSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;

class StudentSystem {

    List<Student> students = new ArrayList<>();

    public StudentSystem(String fileName) {

        try{
            students = loadStudentsFromFile(fileName);

        }
        catch(IOException e){
            System.out.println("Unable to read a file");
        }


    }

    public static List<Student> loadStudentsFromFile(String fileName) throws IOException{
        List<Student> students = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(fileName));

        List<String> lines = br.lines().collect(Collectors.toList());

        for (String l : lines) {
            String[] splitLine = l.split(",");
            Student temp = new Student(
                    splitLine[0].equals(" ") ? 0 : Integer.parseInt(splitLine[0]),
                    splitLine[1],
                    splitLine[2],
                    splitLine[3],
                    splitLine[4].equals("") ? 1.0 : Double.parseDouble(splitLine[4]));
            students.add(temp);
        }
        br.close();
        return students;

    }

    public Optional<Student> getStudentByID(int ID) throws StudentNotFoundException{
        for (Student s : students){
            if (s.getStudent_ID()==ID){
                return Optional.of(s);
            }
        }
        throw new StudentNotFoundException("Student could not be found");
    }

    public  Student getHighestGPAStudent(){

        /*List<Student> students = new ArrayList<>();


        try{
            students = loadStudentsFromFile(fileName);

        }
        catch(IOException e){
            throw new EmptyStudentListException("List of students is empty");
        }*/


        double biggestGPA = students.get(0).getGPA();
        Student currentStudent=students.get(0);
        for(Student s: students){

            if (s.getGPA()>biggestGPA){
                currentStudent=s;
                biggestGPA=s.getGPA();
            }
        }
        return currentStudent;

    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students);
    }

    public Student getLongestNameStudent(){



        Student current = students.get(0);
        int longestName = students.get(0).getStudent_name().length();

        for(Student s : students){
            if (s.getStudent_name().length()>longestName){
                longestName=s.getStudent_name().length();
                current=s;
            }
        }
        return current;
    }
}

class Main{

    public static void main(String[] args) {

        StudentSystem ss = new StudentSystem("/Users/edhemrogo/Desktop/students.csv");

        try{

            System.out.println(ss.getStudentByID(10));
        }
        catch (StudentNotFoundException e){
            System.out.println("Student not found");
        }

        System.out.println(ss.getHighestGPAStudent());

        System.out.println(ss.getLongestNameStudent());

        System.out.println(ss.getAllStudents());

    }






}