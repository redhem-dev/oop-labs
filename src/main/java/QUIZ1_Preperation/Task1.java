package QUIZ1_Preperation;
import java.util.List;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        countEvenOddZeroOccurances(new int[]{11, 22, 0, 47, 28,2});

    }

    public static void countEvenOddZeroOccurances(int[] numbers){

        int even = 0;
        int odd = 0;
        int zeros = 0;

        for (int i=0; i< numbers.length; i++){
            if (numbers[i]%2==0 && numbers[i]!=0){
                even++;
            }
            else if (numbers[i]%2==1){
                odd++;
            }
            else if (numbers[i]==0){
                zeros++;
            }
        }

        System.out.println("Count of even numbers is: "+even);
        System.out.println("Count of odd nunbers is: "+odd);
        System.out.println("Count of zeros is: "+zeros);
    }
}
