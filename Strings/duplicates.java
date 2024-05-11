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