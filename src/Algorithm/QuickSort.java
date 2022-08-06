package Algorithm;

public class QuickSort {
    public static void main(String[] args) {
        int number = 10;
        int[] array = {3,4,2,7,6,9,1,10,5,8};

        quickSort(array, 0, number-1);

        for (int a : array) {
            System.out.print(a+" ");
        }
    }

    private static void quickSort(int[] array, int start, int end){
        /*if (start >= end) { // 원소가 한 개인 경우
            return;
        }

        int pivot = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j){ // 엇갈릴 때까지
            System.out.println(i);
            System.out.println(pivot);
            while (array[i] <= array[pivot] && i < end ){ // 피벗보다 큰 값을 만날 때까지 오른쪽으로 이동
                i++;
            }
            while (array[j] >= array[pivot] && j > start) { // 피벗보다 작은 값을 만날 때까지 왼쪽으로 이동
                j--;
            }

            if (i > j) { // 엇갈린 상태면 피벗과 교체
                temp = array[j];
                array[j] = array[pivot];
                array[pivot] = temp;
            }else{
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }*/

        if (start >= end) {
            return;
        }

        int pivot = start;
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j) {
            while (i <= end && array[i] < array[pivot] ) {
                System.out.println(i + "i");
                System.out.println(pivot + "pivot");
                i++;
            }
            while (array[j] >= array[pivot] && j > start) {
                j--;
            }
            if (i > j) {
                temp = array[j];
                array[j] = array[pivot];
                array[pivot] = temp;
            }else {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        quickSort(array, start, j - 1);
        quickSort(array, j + 1, end);

        //return array;
    }
}
