package Algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int i, j, temp = 0;

        int[] array = {10,4,6,7,2,9,1,3,5,8};
       // int[] array = {2,3,4,1};

        //1,4,5,2


/*        for (i = 0; i < 9; i++) {
            j=i;
            while (array[j] > array[j + 1] ) {
                System.out.println(array.length);
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                if (j > 0) {
                    j--;
                }
            }
        }*/

        for (i = 0; i < 9; i++) {
            for (j = i; j >= 0; j--) {
                if(array[j+1] < array[j]){
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int a : array) {
            System.out.print(a+ " ");
        }
    }

    public void test(){
        int temp;

        //int a = temp;
    }
}
