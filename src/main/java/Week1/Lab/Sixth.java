package Week1.Lab;

import java.util.Scanner;

public class Sixth {

    public static void main(String[] args){



        Scanner first = new Scanner(System.in);
        System.out.println("Type the first number : ");

        int a = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Type the second number : ");

        int b = first.nextInt();

        if (a>b){
            System.out.println("Greater number : " + a);
        }
        else if (b>a){
            System.out.println("Greater number : " + b);
        }
        else {
            System.out.println("The numbers are equal!");
        }



    }
}
