package medium;

import java.util.Scanner;

/**
 * @author urja
 * Given a string, find the length of the longest substring without repeating characters.
 */
public class LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(getLengthOfLongestSubstring(input));
    }

    private static int getLengthOfLongestSubstring(String input) {
        char[] chars = input.toCharArray();
        String longestString = "";
        String oldString="";
        for(int i= 0; i < chars.length;i++) {
            if (longestString.contains(String.valueOf(chars[i])))
            {
                if(longestString.length() > oldString.length()){
                    oldString = longestString;
                }
                if(longestString.split(String.valueOf(chars[i])).length>1)
                    longestString= longestString.split(String.valueOf(chars[i]))[1]+(chars[i]);
                else{
                    longestString =String.valueOf(chars[i]);
                }
            }
            else{
                longestString =longestString+chars[i];
            }
        }
        return  oldString.length()< longestString.length()? longestString.length(): oldString.length();
    }
}
