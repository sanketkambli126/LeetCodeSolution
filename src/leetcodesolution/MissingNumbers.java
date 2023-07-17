/**
 * Question: Missing Numbers✩
You're given an unordered list of unique integers nums in the range
[1, n], where n represents the length of nums + 2. This means that two numbers in this range are missing from the list.
Write a function that takes in this list and returns a new list with the two missing numbers, sorted numerically.
 * 
 */
package leetcodesolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(missingNumbers(new int[]{1, 4, 3})));
    }
    
    public static int[] missingNumbers(int[] nums)
    {
        int[] result = {-1, -1};
        int counter = 0;
        List<Integer> list = new ArrayList();
        for(int num : nums)
        {
            list.add(num);
        }
        int missingValues = 2;
        for(int i=1; i<= nums.length + missingValues; i++)
        {
            if(!list.contains(i))
            {
                result[counter++] = i;
                if(counter == missingValues)
                    return result;
            }
        }
        return result;
    }
}
