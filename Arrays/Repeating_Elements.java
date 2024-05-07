package Arrays;

import java.util.Scanner;

//Problem Statement: Find all the repeating elements present in an array.
public class Repeating_Elements {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            findRepeatingElements(arr);
        }
    }

    static void findRepeatingElements(int[] arr)
    {
        int count = 0;
        int[] dup = new int[arr.length];
        for(int i=0;i<arr.length-1;i++) {
	        for(int j=i+1;j<arr.length;j++) {
	            if(arr[i]==arr[j]) dup[count++] = arr[i];
	        }
	    }
	    System.out.print("The repeating elements are: ");
	    for(int i=0;i<count;i++) 
	        if(dup[i] != dup[i+1]) System.out.print(dup[i]+" ");
    }
}