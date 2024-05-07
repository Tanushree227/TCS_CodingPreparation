package Arrays;

import java.util.Scanner;

public class MaxProductSubarray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int result = maxProductArray(arr);
            System.out.println("The maximum product for the sub array is: " + result);
        }
    }

    static int maxProductArray(int[] arr) {
        int prod1 = arr[0], prod2 = arr[0], result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
            prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
            prod1 = temp;

            result = Math.max(result, prod1);
        }

        return result;
    }
}
