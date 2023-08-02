package StringsPackage;

/*✩Caesar Cipher Encryptor✩
Given a non-empty string of lowercase letters and a non-negative integer representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key.
Note that letters should "wrap" around the alphabet, in other words, the letter z shifted by one returns the letter a.*/
public class Caesar_Cipher_Encryptor {

    public static String caesarCypherEncryptor(String str, int key) {
        String op = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                int a = (int) str.charAt(i) + key % 26;
                op += a <= 90 ? (char) a : (char) (65 + a % 90);
            } else {
                int a = (int) str.charAt(i) + key % 26;
                op += a <= 122 ? (char) a : (char) (96 + a % 122);
            }
        }
        return op;
    }

    public static void main(String[] args) {
        System.out.println(caesarCypherEncryptor("Xyz", 2));
    }
}
