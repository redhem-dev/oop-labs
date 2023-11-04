package QUIZ1_Preperation;

public class Task3Try2 {
    public static void main(String[] args) {
        printInvertedHalfPyramid(5);

    }

    public static void printInvertedHalfPyramid(int rows){
        for (int i=rows; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("* ");

            }

            System.out.println();
        }
    }
}
