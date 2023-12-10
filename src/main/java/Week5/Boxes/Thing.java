package Week5.Boxes;

import java.util.Objects;

public class Thing {
    private double weight;
    private String name;

    public double weight(){
        return this.weight;
    }

    public String getName(){
        return this.name;
    }

    public Thing(double weight, String name){
        if (weight>=0){this.weight = weight;}
        else {throw new IllegalArgumentException();}

        this.name = name;
    }




    @Override
    public boolean equals(Object newThing){
        if (this == newThing) return true;
        if (newThing==null || this.getClass() != newThing.getClass()) return false;
        Thing thing = (Thing) newThing;
        return Objects.equals(name, thing.name);

    }

    @Override
    public int hashCode(){
        return Objects.hash(name);

    }

}
