package QUIZ1_Preperation;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        System.out.println(isPalindrome("anavolimilovana"));
        System.out.println(isPalindrome("Edhem"));
    }

    public static boolean isPalindrome(String str){

        for (int i=0, j=str.length()-1; i<=j; i++, j--){

            if (str.charAt(i)==str.charAt(j)){
                continue;
            }
            else return false;
        }
        return true;


    }

}
