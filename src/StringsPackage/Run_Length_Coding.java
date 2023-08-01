package StringsPackage;

import java.util.Map;
import java.util.HashMap;

/*Run-Length Encoding
Write a function that takes in a non-empty string and returns its run-length encoding.
From Wikipedia, "run-length encoding is a form of lossless data compression in which runs of data are stored as a single data value and count, rather than as the original run." For this problem, a run of data is any sequence of consecutive, identical characters. So the run "AAA" would be run-length-encoded as "3A"
To make things more complicated, however, the input string can contain all sorts of special characters, including numbers. And since encoded data must be decodable, this means that we can't naively run-length-encode long runs. For example, the run "AAAAAAAAAAAA" (12 A s), can't naively be encoded as "12A", since this string can be decoded as either "AAAAAAAAAAAA" or "1AA". Thus, long runs (runs of 10 or more characters) should be encoded in a split fashion; the aforementioned run should be encoded as "9A3A" */
public class Run_Length_Coding {

    public static String runLengthEncoding(String string) {
        String op = "";
        Integer currentLength = 1;
        for (int i = 1; i < string.length(); i++) {
            Character currentCharacter = string.charAt(i);
            Character previousCharacter = string.charAt(i - 1);
            if (currentCharacter != previousCharacter || currentLength == 9) {
                op += currentLength.toString() + previousCharacter;
                currentLength = 0;
            } 
                currentLength += 1;
            
        }
        op += currentLength.toString() + string.charAt(string.length() - 1);
        return op;
    }

    public static void main(String[] args) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
    }
}
