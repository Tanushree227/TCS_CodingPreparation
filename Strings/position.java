package Strings;

import java.util.Scanner;

public class position {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            String pattern = sc.next();
            int foundIndex = foundPattern(str, pattern);
            System.out.println("The substring starts from the index: " +foundIndex);
        }
    }
    public static int foundPattern(String text, String pattern)
    {
        int N = text.length();
        int M = pattern.length();
        for (int i=0; i<=N-M; i++)
        {
            int temp = i;
            int j = 0;
            for(j = 0; j < M; j++)
            {
                if(text.charAt(temp) != pattern.charAt(j))
                {
                    break;
                }
                temp++;
            }
            if(j == M)
            {
                return i;
            }
        }
        return -1;
    }
}
