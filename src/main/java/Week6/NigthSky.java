package Week6;
import java.util.*;

public class NigthSky {

    public static void main(String[] args) {

        NigthSky nightsky = new NigthSky(0.1, 40, 20);
        nightsky.print();
        System.out.println();

        System.out.println("Number of stars: "+ nightsky.starsInLastPrint());



    }
    double starDensity;
    int width;
    int height;

    public NigthSky(double starDensity, int width, int height) {
        this.starDensity = starDensity;
        this.width = width;
        this.height = height;
    }
    public NigthSky(double starDensity) {
        this.starDensity = starDensity;
        this.width = 20;
        this.height = 10;
    }

    public NigthSky(int width, int height) {
        this.starDensity = 0.1;
        this.width = width;
        this.height = height;
    }
    public void printLine(){
        List<Integer> randomNumbers = new ArrayList<>();
        Random rand = new Random();
        int i=0;


        while (i<(int)(width*starDensity)){
            int randomNumber = rand.nextInt((this.width-0)+1)+0;
            if (randomNumbers.contains(randomNumber)){
                continue;
            }
            else {
                randomNumbers.add(randomNumber);
                i++;
            }
        }

        Collections.sort(randomNumbers);



        for (int j=0; j<width; j++) {
            if (randomNumbers.contains(j)){
                System.out.print("*");

            }
            else {
                System.out.print(" ");
            }
        }
    }
    public void print(){
        for (int k=0; k<width; k++){

            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint(){
        int starsInLastPrint;
        double previous = this.width*this.height*this.starDensity;
        starsInLastPrint=(int)previous;
        return starsInLastPrint;
    }



}
