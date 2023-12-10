package Week10.Task2;


import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Integer> grades;

    public Student(String name, int id, ArrayList<Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(int grade) {
        this.grades.add(grade);
    }

    public void printInfo(){
        System.out.println(this.name+", "+this.id+" \n grades:");
        for (int i:grades){
            System.out.println(i+", ");
        }
    }
}
