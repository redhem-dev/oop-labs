package Week2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int first = 0;
        int last = 0;

        System.out.println("First : ");
        Scanner scan = new Scanner(System.in);
        first = Integer.parseInt(scan.nextLine());


        System.out.println("Last : ");
        last = Integer.parseInt(scan.nextLine());


        while (first<=last){
            System.out.println(first);
            first=first + 1;
        }
    }
}
