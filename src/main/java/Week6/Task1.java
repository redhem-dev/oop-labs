package Week6;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {2, 4, 5, 62, 1, 99, -1};
        System.out.println(smallest(values));
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i : array){
            if (i<smallest){
                smallest = i;
            }

        }
        return smallest;
    }


}
