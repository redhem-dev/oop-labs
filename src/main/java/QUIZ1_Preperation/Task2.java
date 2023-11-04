package QUIZ1_Preperation;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        printWordsFromSentence("salih je imao desetku iz programiranja");
    }

    public static void printWordsFromSentence(String str){

        String [] newarr = str.split(" ");

        for (String w : newarr) {
            System.out.println(w);
        }


    }
}
