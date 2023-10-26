package Week4;

public class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void displayInfo(){
        System.out.println(this.getColor() + ", " + this.getFillType()+  ", " + this.width  + ", " +  this.height);
    }

    public void getArea(){
        System.out.println(2*this.width+ 2*this.height);
    }
}
