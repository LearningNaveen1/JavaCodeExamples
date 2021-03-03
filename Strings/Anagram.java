package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        boolean check = checkAnagram(arr1, arr2);
        System.out.println(check);
    }

    public static boolean checkAnagram(char[] str1, char[] str2){
        if(str1.length != str2.length)
            return false;

        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i = 0; i<str1.length; i++){
            if(str1[i] != str2[i])
                return false;
        }
        return true;
    }
}
