package com.pgh;

public class QuickSort {
    int[] A = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};
    int left = 0;
    int right = A.length - 1;


    public void QuickSort() {
        quickSort(A, left, right);
    }

    private void quickSort(int[] A, int left, int right) {
        int a = partition(A, left, right);
        if (left == (a - 1)) {
            if (A[left] >= A[a]) {
                int b = A[a];
                A[a] = A[left];
                A[left] = b;
            }
        } else {
            quickSort(A, left, a - 1);
            quickSort(A, a + 1, right);
        }

    }

    private int partition(int[] A, int left, int right) {
        int X = A[right];
        int i = left;
        int j = right - 1;

        do {
            while ((i <= j) && A[i] <= X) i++;
            while ((i <= j) && A[j] >= X) {
                j--;
                if (j == 0) break;
            }

            if (i > j) break;
            if (A[i] >= X && A[j] <= X) {
                int mid = A[i];
                A[i] = A[j];
                A[j] = mid;
                i++;
                j--;
            }
        } while (i < j);

        int m = A[i];
        A[i - 1] = X;
        A[right] = m;

        return j;
    }
}
