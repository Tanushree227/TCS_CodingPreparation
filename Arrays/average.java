package Arrays;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            double sum = 0, avg = 0;
            for(int j : arr)
            {
                sum += j;
            }
            avg = sum/n;
            System.out.println("Average of given array is: " + avg);
        }
    }
}
