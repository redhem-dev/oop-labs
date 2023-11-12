package Week6;
import java.util.*;

public class NigthSky {

    public static void main(String[] args) {

        NigthSky nightsky = new NigthSky(0.125, 5, 7);
        nightsky.print();
        System.out.println();

        System.out.println("Number of stars: "+ nightsky.starsInLastPrint());
        nightsky.print();
        System.out.println("Number of stars: "+ nightsky.starsInLastPrint());




        ////0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9
    }
    double starDensity;
    int width;
    int height;
    int starsinLastprint=0;

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
        Random random = new Random();


        for (int i = 0; i < this.width; i++) {
            // Use nextDouble to generate a random number between 0 and 1
            double randomValue = random.nextDouble();

            // Check if the random value is less than the density
            // If yes, print a star, otherwise print a space
            if (randomValue < this.starDensity) {
                System.out.print("*");
                starsinLastprint++;


            } else {
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
        int returnValue = starsinLastprint;
        starsinLastprint=0;
        return returnValue;
    }



}
