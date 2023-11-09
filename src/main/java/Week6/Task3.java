package Week6;

public class Task3 {

    public static void main(String[] args) {
        int[] values = {6, 5, 8, -7000, -10, 99, 8, -1908};
        System.out.println(indexOdTheSmallestStartingFrom(values, 4));

    }
    public static int indexOdTheSmallestStartingFrom(int[] array, int startingIndex){
        int index = 0;
        int smallest = array[0];

        for (int i =startingIndex; i<array.length; i++){
            if(array[i]<smallest){
                smallest =array[i];
                index = i;
            }
        }
        return index;
    }
}
