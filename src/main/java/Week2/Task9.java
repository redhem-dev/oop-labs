package Week2;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        drawStarsPiramid(5);
        drawStarsPiramid(10);
    }

    public static void drawStarsPiramid(int amount){

        int i =1;
        String str = "";

        while (i<=amount){
            for(int j=1; j<=i; j++){
                str = str + String.valueOf(j);

            }

            System.out.println(str);
            str="";
            i++;

        }


    }
}
