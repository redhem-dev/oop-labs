package Week2;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        String password = "carrot";
        while (true){
            Scanner scann = new Scanner(System.in);
            System.out.println("Type the password : ");

            String newattempt = scann.nextLine();

            if (newattempt.equals(password)){
                System.out.println("Right!\n\n" + "The secret is : jryy qbar !");
                break;
            }
            else{
                System.out.println("Wrong!");
                continue;
            }


        }
    }

}
