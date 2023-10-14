package Week2;
import java.util.Scanner;
import java.util.Random;

public class Task10 {


    public static void main(String[] args) {

        int guesses = 0;
        String lesser = "The number is lesser, guesses made : ";
        String greater = "The number is grater, guesses made : ";

        Random rand = new Random();
        int randomNum  = rand.nextInt(100);



        while (true){

            System.out.println("Guess a number : ");
            Scanner scan = new Scanner(System.in);
            int guess = Integer.parseInt(scan.nextLine());
            guesses=guesses+1;

            if (guess == randomNum){
                System.out.println("Congratitulations, your guess is correct!");
                break;
            }

            else if (guess<randomNum){
                System.out.println(greater + guesses);

            }
            else {
                System.out.println(lesser + guesses);
            }
        }



    }


}
