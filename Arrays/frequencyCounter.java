package Arrays;
//Problem statement: Given an array, we have found the number of occurrences of each element in the array.
import java.util.*;

public class frequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        countFreq(arr, n);
    }

    public static void countFreq(int[] arr, int n)
    {
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            if(visited[i] == true)
            {
                continue;
            }
        }
    }
}
