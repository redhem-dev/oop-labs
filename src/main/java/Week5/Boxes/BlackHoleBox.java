package Week5.Boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box{

    ArrayList<Thing> things = new ArrayList<>();
    public BlackHoleBox(){}

    @Override
    public void add(Thing thing){
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing){

        return false;

    }
}
