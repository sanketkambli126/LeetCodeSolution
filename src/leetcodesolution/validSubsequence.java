
package leetcodesolution;

import java.util.Arrays;
import java.util.List;

public class validSubsequence {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(5, 1, 22, 22, 25, 6, -1, 8, 10);
        System.out.println(isValidSubsequence(array, sequence));
    }
    // Time Complexity :-O(n) Space Complexity :-O(1)
     public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int  sequencePos=0;
        for (Integer arrayValue : array) {
            if(sequencePos==sequence.size())
                return true;
            if(sequence.get(sequencePos)==arrayValue)
                sequencePos++;
        }
        return sequencePos==sequence.size();
  }
}
