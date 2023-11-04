package Week5.Boxes;
import java.util.ArrayList;

public class MaxWeightBox extends Box{

    private ArrayList<Thing> things = new ArrayList<>();
    private int weightInBox;
    private int maxWeight;
    public MaxWeightBox(int maxWeight){
        this.maxWeight =maxWeight;
        this.weightInBox = 0;
    }

    @Override
    public void add(Thing thing){
        if(this.weightInBox<this.maxWeight){

            this.weightInBox=this.weightInBox+ (int)thing.weight() ;
            things.add(thing);
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
