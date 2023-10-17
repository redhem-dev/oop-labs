package Week1.Lecture;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] arg){
        System.out.println("Welcome to the Calculator !");

        Scanner reader = new Scanner(System.in);
        while(true){
            System.out.println("Enter a command (sum, difference, quit) : ");
            String command = reader.nextLine();

            if (command.equals("quit")){
                break;
            }

            System.out.println("Enter the numbers");
            int prvi = Integer.parseInt(reader.nextLine());
            int drugi = Integer.parseInt(reader.nextLine());

            if (command.equals("sum")){
                int sum = prvi + drugi;
                System.out.println("The sum of the numbers is " + sum + ".");
                break;
            }
            else if (command.equals("difference")){
                int difference = prvi-drugi;
                System.out.println("The difference of the numbers is "+ difference + ".");
                break;
            }

            else {
                System.out.println("Unknown command.");
            }
        }

        System.out.println("Thanks, bye!");

    }



}
