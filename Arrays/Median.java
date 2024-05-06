package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    static private void getMedian(int[] arr, int n)
    {
        Arrays.sort(arr);
        if(n % 2 == 0)
        {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
        }
        else
        {
            System.out.print(arr[n/2]);
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The median of the array is: ");
            getMedian(arr, n);
        }
    }
}
