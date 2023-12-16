package Week11.StudentManagementSystem;

public class Student {

    private int student_ID;
    private String student_name;

    private String university;
    private String department;

    private double GPA;


    public Student(int student_ID, String student_name, String university, String department, double GPA) {
        this.student_ID = student_ID;
        this.student_name = student_name;
        this.university = university;
        this.department = department;
        this.GPA = GPA;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString(){
        return this.student_name;
    }
}
