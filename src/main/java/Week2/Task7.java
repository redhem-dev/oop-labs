package Week2;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {

        printStars(5);
        printStars(3);
        printStars(9);

    }

    private static void printStars(int amount){

        int i=0;
        String str = "";

        while (i<amount){
            str= str + "*";
            i++;

        }

        System.out.println(str);
    }
}


