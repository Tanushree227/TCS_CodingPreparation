package Arrays;
//Problem statement: Given an array, we have found the number of occurrences of each element in the array.
import java.util.*;

public class frequencyCounter {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
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
            int count = 1;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])
                {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println("Element " + arr[i] + " occurs " + count + " times.");
        }
    }
}
