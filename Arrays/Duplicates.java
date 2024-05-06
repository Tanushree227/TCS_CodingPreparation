package Arrays;

import java.util.Scanner;

public class Duplicates {
   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i=0 ;i < n ;i++)  
        arr[i] = sc.nextInt();
    int k = removeDuplicates(arr);
    System.out.println("The array after removing duplicates: ");
    for(int i = 0; i < k; i++)
    {
        System.out.print(arr[i] + " ");
    }
   } 
   static int removeDuplicates(int[] arr)
   {
    int i = 0;
    for(int j = 1; j < arr.length; j++)
    {
        if(arr[i] != arr[j])
        {
            i++;
            arr[i] = arr[j];
        }
    }
    return i+1;
   }
}
