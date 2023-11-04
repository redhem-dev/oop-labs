package QUIZ1_Preperation;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        printTablesNumber(4,10,5);

    }
    public static void printTablesNumber(int start, int end, int number){

        for (int i=start; i<=end; i++){

            System.out.println(i+" * "+number+" = "+(i*number));

        }

    }
}
