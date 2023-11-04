package QUIZ1_Preperation;

public class Task5Try2 {
    public static void main(String[] args) {
        printTablesNumber(1,4,6);

    }

    public static void printTablesNumber(int start, int end, int number){
        for (int i=start; i<=end; i++){
            System.out.println(i+" * "+number+" = "+i*number);

        }
    }
}
