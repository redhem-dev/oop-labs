package Week5;

public class MilitaryService implements NationalService{

    private int daysLeft;
    public MilitaryService(int daysLeft){

        this.daysLeft = daysLeft;


    }

    public int getDaysLeft(){
        return this.getDaysLeft();
    }

    public void work (){
        if (daysLeft>0){
            this.daysLeft--;
        }
    }


}
