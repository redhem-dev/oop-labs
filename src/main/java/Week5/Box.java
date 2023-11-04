package Week5;

import java.util.ArrayList;

public class Box {

    private double maxiumumWeight;
    private ArrayList<ToBeStored> things;

    public Box (double maximumWeight){
        this.maxiumumWeight = maximumWeight;
        this.things = new ArrayList<ToBeStored>();
    }

    public void add(ToBeStored thing){
        if ((maxiumumWeight - totalWeight()) >= thing.weight()){
            things.add(thing);
        }
    }

    public double totalWeight(){
        double total = 0;
        for (ToBeStored t : this.things){
            total = total + t.weight();
        }
        return total;
    }

    @Override
    public String toString(){
        return "Box: "+things.size()+" things, total weight "+totalWeight()+ " kg.";
    }


}
