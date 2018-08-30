package com.pgh;

public class BubbleSort {
    int[] A = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

    public void BubbleSort() {
        bubbleSort();
    }

    private void bubbleSort() {
        int m = A.length;
        for (int j = 0; j < A.length; j++) {
            swap(m - j);
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    private void swap(int max) {
        int i = 0;
        do {
            if (A[i] > A[i + 1]) {
                int mid = A[i];
                A[i] = A[i + 1];
                A[i + 1] = mid;
            }
            i++;
        } while (i < max - 1);
    }

}
