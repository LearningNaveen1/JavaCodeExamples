package Strings;

import java.util.HashMap;

public class Anagram_With_HashMap {
    public static void main(String[] args) {
        String str1 = "silen";
        String str2 = "listen";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        System.out.println(areAnagram(arr1, arr2));
    }

    public static boolean areAnagram(char[] arr1, char[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;

        if (len1 != len2)
            return false;

        HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

        for (char c : arr1){
            if(hm1.containsKey(c))
                hm1.put(c,hm1.get(c)+1);
            else
                hm1.put(c,1);
        }
        for (char c : arr2){
            if(hm2.containsKey(c))
                hm2.put(c,hm1.get(c)+1);
            else
                hm2.put(c,1);
        }

        if(hm1.equals(hm2))
            return true;
        else
            return false;
    }
}
