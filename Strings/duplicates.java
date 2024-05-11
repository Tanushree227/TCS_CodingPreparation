package Strings;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        String str = "sinstriiintng";

        HashMap < Character, Integer > map = new HashMap < Character, Integer > (26);

        for (int i = 0; i < str.length(); i++)
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);

        for (Map.Entry < Character, Integer > entry: map.entrySet())
            if (entry.getValue() > 1)
                System.out.println(entry.getKey() + " - " + entry.getValue());
    }
}

// import java.util.*;

// class Solution {
//     public static void main(String[] args) {
//         String str = "sinstriiintng";

//         int[] counts = new int[26];

//         for (int i = 0; i < str.length(); i++)
//             counts[str.charAt(i) - 'a']++;

//         for (int i = 0; i < 26; i++)
//             if (counts[i] > 1)
//                 System.out.println((char)(i + 'a') + " - " + counts[i]);
//     }
// }