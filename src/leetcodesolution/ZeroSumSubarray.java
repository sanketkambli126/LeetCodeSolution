/**
 * Question: Zero Sum Subarray✩
You're given a list of integers nums. Write a function that returns a boolean representing whether there exists
a zero-sum subarray of nums
A zero-sum subarray is any subarray where all of the values add up to zero. A subarray is any contiguous section of the array. For the purposes of this problem, a subarray can be as small as one element and as long as the original array.
 * 
 * 
 * 
 */
package leetcodesolution;

import java.util.ArrayList;
import java.util.List;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int[] nums = {2, -2};
        System.out.println(zeroSumSubarray(nums));
    }
    public static boolean zeroSumSubarray(int[] nums) {
    int sum=0;
        int indexstart=0;
        List<Integer> set1=new ArrayList();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i] == 0 || sum == 0 || set1.contains(sum))
            {
              return true;
            }
            set1.add(sum);
        }
    return false;
  }
}
