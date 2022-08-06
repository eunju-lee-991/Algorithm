package Algorithm;

public class SelectionSort {

    public static void main(String... args){
        int i, j, min, temp = 0;
        int index = 0 ;

        int[] array = {1,4,6,7,2,9,10,3,5,8};

        for (i = 0; i < 10; i++) {
            min = 99;
            for (j = i; j < 10; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;

            System.out.print(array[i]);
        }
    }
}
