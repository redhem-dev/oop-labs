package Week1.Lab;

import java.util.Scanner;

public class Fifth {

    public static void main(String[] args){

        Scanner first = new Scanner(System.in);
        System.out.println("Type a number : ");

        int a = first.nextInt();

        if (a>0){
            System.out.println("The number is positive.");
        }else {
            System.out.println("The number is not positive.");
        }

    }

}
