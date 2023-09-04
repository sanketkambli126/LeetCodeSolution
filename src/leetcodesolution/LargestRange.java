package leetcodesolution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Largest Range✩
Write a function that takes in an array of integers and returns an array of length 2 representing the largest range of integers contained in that array.
The first number in the output array should be the first number in the range, while the second number should be the last number in the range.
A range of numbers is defined as a set of numbers that come right after each other in the set of real integers. For instance, the output array [2, 6] represents the range (2, 3, 4, 5, 6}, which is a range of length 5. Note that numbers don't need to be sorted or adjacent in the input array in order to form a range.
You can assume that there will only be one largest range.*/
public class LargestRange {

    public static int[] largestRange(int[] array) {
        int op[] = new int[2];
        int longestLength = 0;
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        for (int i : array) {
            map.put(i, Boolean.TRUE);
        }
        for (int currentValue : array) {
            if (!map.get(currentValue)) {
                continue;
            }
            int left = currentValue - 1;
            int right = currentValue + 1;
            int currentLength = 0;
            while (map.containsKey(left)) {
                map.put(left, Boolean.FALSE);
                currentLength++;
                left--;
            }
            while (map.containsKey(right)) {
                map.put(right, Boolean.FALSE);
                currentLength++;
                right++;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                op = new int[]{left + 1, right - 1};
            }
        }
        return op;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(largestRange(new int[]{1, 11, 3, 0, 15, 5, 2, 4, 10, 7, 12, 6})));
    }

}
