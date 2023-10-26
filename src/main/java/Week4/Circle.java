package Week4;

public class Circle extends Shape{

    double radius;

    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.println(this.getColor() + ", " + this.getFillType()+ " "+this.radius);
    }

    @Override
    public void getArea(){
        System.out.println(this.getRadius()*this.getRadius()*3.14);
    }

    public void calculateCircumference(double PI, double r){
        PI=3.14;


        System.out.println(2*PI*r);
    }

    public void calculateCircumference(double r){
        System.out.println(2*3.14*r);
    }
}
