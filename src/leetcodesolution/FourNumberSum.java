package leetcodesolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourNumberSum {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    for (int l = k + 1; l < array.length; l++) {
                        if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                            result.add(new Integer[]{array[i], array[j], array[k], array[l]});
                        }
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fourNumberSum(new int[]{7, 6, 4, -1, 1, 2}, 16).toArray()));
    }
}
