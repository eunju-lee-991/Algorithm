package Algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String... args) {
        int i, j, temp = 0;

        int[] array = {10,4,6,7,2,9,1,3,5,8};

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }

            //System.out.print(array[i]+" ");
        }

        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a]+" ");
        }
    }


}
