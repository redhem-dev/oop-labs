package QUIZ2_Preperation;

enum FillType{
    FILLED, NOT_FILLED
}

class Shape {
    private String color;
    private FillType filltype;

    public Shape(String color, FillType filltype){
        this.color=color;
        this.filltype = filltype;

    }
    public void setColor(String newcolor){
        this.color = newcolor;
    }

    public String getColor(){
        return this.color;
    }

    public FillType getFillType(){
        return this.filltype;
    }

    public void setFillType(FillType newfilltype){
        this.filltype = newfilltype;
    }
    @Override

    public String toString(){
        return this.getColor()+ "  " + this.getFillType();

    }

}

class Circle extends Shape{

    private double radius;
    public Circle(String color, FillType filltype, double radius){
        super(color, filltype);
        this.radius = radius;


    }

    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double getRadius(){
        return radius;
    }

    @Override

    public String toString(){
        return this.getColor()  + "  " + this.getFillType() + "  " + this.getRadius();
    }



}

