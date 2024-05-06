package Arrays;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)  
            arr[i] = sc.nextInt();  
        
        System.out.println("Brute Force Approach: The Largest element is : " + findLargestElement(arr));
    }
    static int findLargestElement(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
