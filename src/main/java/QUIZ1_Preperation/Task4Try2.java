package QUIZ1_Preperation;

public class Task4Try2 {
    public static void main(String[] args) {
        System.out.println(baseRaisedToPower(2, 5));
    }

    public static int baseRaisedToPower(int base, int power){
        int result = 1;

        for (int i=1; i<=power; i++){
            result = result *base;

        }

        return result;
    }
}
