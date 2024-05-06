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
        System.out.println("Recursive Approach: The Largest element is : " + LargestElement(arr));
    }
    static int findLargestElement(int[] arr)
    {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    static int LargestElement(int arr[]) {
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
          if (arr[i] > max) {
            max= arr[i];
          }
        }
        return max;
      }
}
