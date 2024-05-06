package Arrays;
//Problem Statement: Given an array, we have to find the sum of all the elements in the array.

import java.util.Scanner;

public class sumArray {
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                sum = sum + arr[i];
            }
            System.out.println("The sum of all the elements is : " + sum);
        }
    }
}
