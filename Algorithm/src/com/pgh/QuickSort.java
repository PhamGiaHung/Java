package com.pgh;

public class QuickSort {
    int[] A = {23, 6, 44, 22, 8, 5, 11, 40, 34, 18};
    int left = 0;
    int right = A.length - 1;


    public void QuickSort() {
        quickSort(A, left, right);
        for (int k = 0; k < A.length; k++) {
            System.out.print(A[k] + " ");
        }
    }

    private void quickSort(int[] A, int left, int right) {
        int a;
        if (left < right) {
            a = partition(A, left, right);
            quickSort(A, left, a);
            quickSort(A, a + 1, right);
        }
    }

    private int partition(int[] A, int left, int right) {
        int x = A[left];
        int i = left + 1;
        int j = right;
        int t;
        do {
            while ((i <= j) && A[i] <= x)
                i++;
            while ((i <= j) && A[i] > x) {
                j--;
                if (i < j) {
                    t = A[i];
                    A[i] = A[j];
                    A[j] = t;
                    i++;
                    j--;
                }
            }


        } while (i <= j);
        t = A[left];
        A[left] = A[j];
        A[j] = t;
        return j;
    }

}
