package Week2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int number = 0;
        int sum = 0;
        int i = 0;


        System.out.println("Type a number : ");
        Scanner scan = new Scanner(System.in);
        number = Integer.parseInt(scan.nextLine());

        while (i <= number) {

            sum = sum + (int)Math.pow(2, i);

            i++;

        }

        System.out.println("The result is : " + sum);


    }
}
