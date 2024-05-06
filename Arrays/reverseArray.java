package Arrays;

import java.util.Scanner;

public class reverseArray {
    static void printArr(int[] arr, int n)
    {
        System.out.println("Reversed array is : ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverseArr(int[] arr, int n)
    {
        int p1 = 0, p2 = n - 1;
        while(p1 < p2)
        {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        printArr(arr, n);
    }
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
            System.out.println("Given array is : ");
            for (int i:arr)
                System.out.print(i+" ");

            System.out.println();

            reverseArr(arr, n);
        }
    }
}

// public class Main {
//     //Function to print array
//     static void printArray(int arr[], int n) {
//        System.out.print("Reversed array is:- \n");
//        for (int i = 0; i < n; i++) {
//           System.out.print(arr[i] + " ");
//        }
//     }
//     //Function to reverse array using recursion
//     static void reverseArray(int arr[], int start, int end) {
//        if (start < end) {
//           int tmp = arr[start];
//           arr[start] = arr[end];
//           arr[end] = tmp;
//           reverseArray(arr, start + 1, end - 1);
//        }
//     }
//     public static void main(String[] args) {
//        int n = 5;
//        int arr[] = { 5, 4, 3, 2, 1};
//        reverseArray(arr, 0, n - 1);
//        printArray(arr, n);
//     }
//  }
