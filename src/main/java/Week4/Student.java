package Week4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person{

    int credits=0;

    private int student_id;
    ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, String adress) {
        super(name, adress);


    }



    public void study(){

        this.credits = this.credits + 1;

    }


    @Override
    public String toString(){
        return this.name + "\n  " + this.adress + "\n" + "  credits "+this.credits;
    }

    public int credits(){
        return credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void addGrade(int grade){


        grades.add(grade);


    }

    public void displayGrades(){
        for (int i =0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }
    }
}
