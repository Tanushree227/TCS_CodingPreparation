package Arrays;
//Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

import java.util.Scanner;

public class addingElements {
    static void insertatbegin(int[] arr, int n, int value) {
        for (int i = n - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = value;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int value = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Given array is : ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            insertatbegin(arr, n, value);
            System.out.println("After inserting element at the beginning: ");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
