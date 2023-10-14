package Week2;
import java.util.Scanner;


public class Task6 {
    public static void main(String[] args) {

        int iterations = 0;
        int i=0;

        System.out.println("How many times do you wish the text to be printed? ");
        Scanner scan = new Scanner(System.in);
        iterations = Integer.parseInt(scan.nextLine());
        while (i<iterations){
            printText();
            i++;
        }


    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");

    }
}
