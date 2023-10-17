package Week1.Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fourth {

    public static void main(String[] args){

        int b;
        int sum = 0;

        Scanner first = new Scanner(System.in);
        System.out.println("Type any number : ");

        int a = first.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Type another number : ");

        b = first.nextInt();

        sum = a + b;

        System.out.println("\nSum of the numbers is " + sum + ".");

    }






}
