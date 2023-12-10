package Week5.Boxes;
import java.util.ArrayList;

public class MaxWeightBox extends Box{

    private ArrayList<Thing> things = new ArrayList<>();
    private double weightInBox;
    private double maxWeight;
    public MaxWeightBox(double maxWeight){
        this.maxWeight =maxWeight;
        this.weightInBox = 0;
    }

    @Override
    public void add(Thing thing){
        if(this.maxWeight-this.weightInBox>=thing.weight()){

            this.weightInBox=this.weightInBox+ thing.weight() ;
            things.add(thing);
        }
        else{throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing){
        for (Thing t : things){
            if (t.getName().equals(thing.getName())){
                return true;
            }
        }
        return false;

    }

}

class main{
    public static void main(String[] args) {
        MaxWeightBox box = new MaxWeightBox(7.0);

        box.add(new Thing(4.0, "Knjiga"));
        box.add(new Thing(3.0, "Knjiga2"));

        Thing t1 = new Thing(4.0, "Salih");
        MaxWeightBox njubokjs = new MaxWeightBox(4.0);

        System.out.println(t1.equals(njubokjs));




    }
}
