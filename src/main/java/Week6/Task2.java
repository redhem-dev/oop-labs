package Week6;

public class Task2 {
    public static void main(String[] args) {

        int[] values = {6, 5, 8, -7000, -10, 99, 8, -1908};
        System.out.println(indexOdTheSmallest(values));

    }

    public static int indexOdTheSmallest(int[] array){
        int index = 0;
        int smallest = array[0];

        for (int i =0; i<array.length; i++){
            if(array[i]<smallest){
                smallest =array[i];
                index = i;
            }
        }
        return index;
    }
}
