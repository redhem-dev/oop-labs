package Week1.Lab;

public class Third {

    public static void main(String[] args) {
        int d = 365;
        int s=0;

        for(int i =0; i<d; i++){
            s=s+(24*60*60);
        }
        System.out.println("There are " + s + " seconds in a year.");
    }
}
