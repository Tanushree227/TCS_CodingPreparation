package Arrays;
//Problem Statement: Given an array of integers, having some duplicate elements, sort the array by frequency.

import java.util.Arrays;
import java.util.Scanner;

public class SortElements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Sortele(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void swap(int[][] arr, int i, int j) {
        int temp1 = arr[0][i];
        arr[0][i] = arr[0][j];
        arr[0][j] = temp1;

        int temp2 = arr[1][i];
        arr[1][i] = arr[1][j];
        arr[1][j] = temp2;
    }

    // Function to sort 2d array by frequency
    public static void sort2darray(int[][] array2d, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - 1 - i; j++) {
                if (array2d[1][j] < array2d[1][j + 1]) {
                    swap(array2d, j, j + 1);
                }
            }
        }
    }

    // Function to sort elements of array by frequency
    public static void Sortele(int[] arr, int n) {
        // Step 1: Sort the array
        Arrays.sort(arr, 0, n);
        // Step 2: Create a 2d array
        int[][] arr2d = new int[2][100];
        int k = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr2d[0][k] = arr[i];
                count = 1;
            } else if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                arr2d[1][k] = count;
                count = 1;
                k++;
                arr2d[0][k] = arr[i];
            }
        }
        arr2d[1][k] = count;
        k++;

        // Step 3: sort the 2d array according to frequency
        sort2darray(arr2d, k);

        // Step 4: Store the answer in original array
        k = 0;
        int i = 0;
        while (i < n) {
            while (arr2d[1][k] > 0) {
                arr[i] = arr2d[0][k];
                i++;
                arr2d[1][k]--;
            }
            k++;
        }
    }
}
