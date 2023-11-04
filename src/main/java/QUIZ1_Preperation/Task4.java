package QUIZ1_Preperation;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){

        Task4 obj = new Task4();
        System.out.println(obj.baseRaisedToPower(2,3));
    }
    public int baseRaisedToPower(int base, int power){
        int result = base;
        for (int i=2; i<=power; i++){
            result=result*base;

        }
        return result;
    }

}
