package Algorithm;

public class MergeSort {
    static int[] sorted = new int[8];

    public static void main(String[] args){
        int[] arr = {8, 4, 3, 2, 7, 6, 5, 1};
        mergeSort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void merge(int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;

        while (i <= middle && j <= n) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                i++;
            }else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > middle) {
            for (int t = j; t <= n; t++) {
                sorted[k] = arr[t];
                k++;
            }
        } else {
            for (int t = i; t <= middle; t++) {
                sorted[k] = arr[t];
                k++;
            }
        }

        // 정렬된 배열을 실제 배열에 삽입
        for (int t = m; t <= n; t++) {
            arr[t] = sorted[t];
        }

    }

    private static void mergeSort(int[] arr, int m, int n) {
        // 크기가 1보다 큰 경우
        if (n > m) {
            int middle = (n + m) / 2;
            System.out.println("mergeSort 1 호출됨");
            mergeSort(arr, m, middle);
            System.out.println("mergeSort 2 호출됨");
            mergeSort(arr, middle + 1, n);

            System.out.println("merge 호출됨");
            merge(arr, m, middle, n);
        }
    }
}
