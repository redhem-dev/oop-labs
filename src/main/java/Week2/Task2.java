package Week2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 2; i++) {

            Scanner reader = new Scanner(System.in);

            if (i==0){

                System.out.println("Enter the first number : ");
                int read = reader.nextInt();
                sum = sum + read;


            }

            else if(i==1){
                System.out.println("Enter the second number : ");
                int read  = reader.nextInt();
                sum = sum + read;

            }
            else{
                System.out.println("Enter the third number : ");
                int read = reader.nextInt();
                sum = sum + read;
            }

        }

        System.out.println("Sum : " + sum);


    }

}
