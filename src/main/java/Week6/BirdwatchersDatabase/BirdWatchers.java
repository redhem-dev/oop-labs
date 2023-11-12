package Week6.BirdwatchersDatabase;
import java.util.ArrayList;
public class BirdWatchers {
    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird){
        birds.add(bird);
    }
    public void observations(String name){
        for (Bird b: birds){
            if(b.getName().equals(name)){
                b.setObservations();
                return;
            }
        }
        System.out.println("Is not a bird!");

    }

    public void statistics(){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
    public void show(String who){
        for (Bird b : birds){
            if(b.getName().equals(who)){
                System.out.println(b);
            }
        }
    }

}
