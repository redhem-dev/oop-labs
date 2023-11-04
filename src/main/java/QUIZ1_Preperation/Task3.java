package QUIZ1_Preperation;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){

        printInvertedPyramid(4);

    }

    public static void printInvertedPyramid(int rows){
        for (int i=rows; i>=1; i--){
            for (int j=1; j<=i; j++){

                System.out.print("* ");

                if(j==i){
                    System.out.println();
                }

            }
        }

    }
}
