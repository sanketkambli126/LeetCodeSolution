package StringsPackage;

/*✩Palindrome Check✩
Write a function that takes in a non-empty string and that returns a boolean representing
whether the string is a palindrome.
A palindrome is defined as a string that's written the same forward and backward. Note that
single-character strings are palindromes.*/
public class Palindrome_Check {

    public static boolean isPalindrome(String str) {
        int leftIndex = 0;
        int rightIndex = str.length() - 1;
        while (leftIndex < rightIndex) {
            if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }
}
