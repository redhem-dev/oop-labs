package Week4;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String adress, int salary) {
        super(name, adress);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return this.name + "\n  " + this.adress + "\n  " + "salary " + this.salary + " euros/month";
    }


}
