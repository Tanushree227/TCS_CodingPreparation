package Arrays;
//Problem Statement: Rearrange the array such that the first half is arranged in increasing order, and the second half is arranged in decreasing order
import java.util.*;

public class rearrangeArray
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = 0; i < n/2; i++)
            {
                System.out.print(arr[i] + " ");
            }
            for(int i = n-1; i >= n/2; i--)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}