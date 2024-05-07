package Arrays;

import java.util.Scanner;

public class UnsortedArrayDuplicates {
    static void duplicate(int[] arr, int n) {
        int mark[] = new int[n];

        for (int i = 0; i < n; i++) {
            mark[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        mark[j] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (mark[i] == 1) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            duplicate(arr, n);
        }
    }
}