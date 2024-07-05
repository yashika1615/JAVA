package STRINGS;

import java.util.*;

public class Anagram {
    public static boolean validAnagram(String s1, String s2) {
        // base case if the lengths of two strings is not same they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        // creates a hashmap
        HashMap<Character, Integer> map = new HashMap<>();
        // iterates through each character in s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            // increments the count of the character ch in the map. If the character does
            // not exist in the map, getOrDefault(ch, 0) returns 0, and 1 is added to it.
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // checking characters in second string

        // iterates through each character in s2
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            // checks if the character ch is not present in the map. If it's not,
            // the method returns false because s2 contains a character that s1 does not
            // have.
            if (!map.containsKey(ch)) {
                return false;
                // checks if the count of the character ch in the map is 1. If it is, the
                // character is removed from the map using map.remove(ch).
            } else if (map.get(ch) == 1) {
                map.remove(ch);
            } else {
                // decrements the count of the character ch in the map by 1
                map.put(ch, map.get(ch) - 1);
            }
        }
        // checks if the map is empty. If it is, it means all characters in s2 matched
        // those in s1 with the correct counts, so the method returns true. If the map
        // is not empty, the method returns false.
        return map.size() == 0;
    }

    public static void main(String[] args) {
        String s1 = "abbcaad";
        String s2 = "babacda";

        boolean result = validAnagram(s1, s2);
        System.out.println("Are the two strings anagrams? " + result);
    }
}
