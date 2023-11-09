package Week6;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};
        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));


    }

    public static void swap(int[] array, int index1, int index2){
        int  remember=0;

        remember = array[index1];

        array[index1]=array[index2];
        array[index2]=remember;


    }
}
