package Arrays;
import java.util.*;

class secondElement
{
    static private void getElements(int[] arr, int n)
    {
        if(n == 0 || n == 1)
        {
            System.out.println(-1);
            System.out.println("");
            System.out.println(-1);
            System.out.println("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n - 2];
        System.out.println("Second smallest is " +small);
        System.out.println("Second largest is " +large);
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i=0; i<t; i++) {
            arr[i] = sc.nextInt();
        }
        getElements(arr, t);
    }
}