package Arrays;
//Problem Statement: Given an array, we have to find the smallest element in the array.
//Approach 1

import java.util.*;

public class smallest
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Approach 1: The Smallest Element is : " + sorting(arr));
        System.out.println("Approach 2: The Smallest Element is : " + SmallestElement(arr));
    }
    static int sorting(int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
    }

    static int SmallestElement(int arr[])
    {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }
}