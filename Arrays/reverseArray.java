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
        Scanner sc = new Scanner(System.in);
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
