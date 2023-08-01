package StringsPackage;

/*✩Longest Palindromic Substring✩
Write a function that, given a string, returns its longest palindromic substring.
A palindrome is defined as a string that's written the same forward and backward. Note that single-character strings are palindromes.
You can assume that there will only be one longest palindromic substring.*/
public class LongestPalindromicSubstring {

    public static String longestPalindromicSubstring(String str) {
        String longestString = "";
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                String current_string = stringMaker(str, i, i - 1);
                if (longestString.length() < current_string.length()) {
                    longestString = current_string;
                }
            }
        }
        return longestString==""?str:longestString;
    }

    public static String stringMaker(String str, Integer current_Position, Integer last_Position) {
        String op = "" + str.charAt(current_Position) + str.charAt(last_Position);
        current_Position++;
        last_Position--;
        while (last_Position >= 0 && current_Position < str.length()) {
            if (str.charAt(current_Position) == str.charAt(last_Position)) {
                op = str.charAt(current_Position)+op + str.charAt(last_Position);
                current_Position++;
                last_Position--;
            } else {
                break;
            }

        }
        return op;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("z234a5abbba54a32z"));
    }
}
