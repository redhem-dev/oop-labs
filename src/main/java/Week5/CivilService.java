package Week5;

public class CivilService implements NationalService{

    public CivilService(){
        this.daysLeft = 362;
    }
    private int daysLeft;

    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }

    @Override
    public void work() {

    }
}
