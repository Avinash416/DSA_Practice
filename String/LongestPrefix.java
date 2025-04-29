package Strings;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));
    }

    //First Sort the Array and then take the first string and last string of the sorted array.
    //Then compare each character of the first string with the corresponding character of the last string.
    //If they are equal increment the index else stop.
    //Return the substring of the first string till that index.
    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int i = 0;
        while(i<strs.length) {
            if(str1.charAt(i) == str2.charAt(i)){
                i++;
            }else {
                break;
            }
        }
        return i== 0 ? "" : str1.substring(0,i);
    }
}
