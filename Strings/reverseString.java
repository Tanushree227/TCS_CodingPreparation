package Strings;

import java.util.Scanner;
import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println("Original string is : " + str);
            str += " ";
            Stack<String> st = new Stack<String>();
            int i;
            String s = "";
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    st.push(s);
                    s = "";
                } else {
                    s += str.charAt(i);
                }
            }
            String ans ="";
            while(st.size() != 1)
            {
                ans += st.peek() + " ";
                st.pop();
            }
            ans+=st.peek();
            System.out.print("\nReversed string is: ");
            System.out.println(ans);
        }
    }
}
