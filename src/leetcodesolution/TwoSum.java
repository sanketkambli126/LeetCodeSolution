package leetcodesolution;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int[] a111 = twoSumArraySolution1(a, 9);
        for (int i : a111) {
            System.out.println(i);
        }
    }
// Time Complexity :-O(n)2 Space Complexity :-O(1)
    public static int[] twoSumArraySolution1(int[] nums, int target) {
       
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) 
                    return new int []{nums[i],nums[j]};
            }
        }
        return new int [0];
    }
    // Time Complexity :-O(n) Space Complexity :-O(n)
    public static int[] twoSumArraySolution2(int[] nums, int target) {
       
        HashSet<Integer>hashSet =new HashSet<Integer>();
        
        for (int num : nums) {
            int value=target-num;
            if(hashSet.contains(value))
                return new int []{value,num};
            else
                hashSet.add(num);
                
        }
        return new int [0];
    }
    // Time Complexity :-O(nlog(n)) Space Complexity :-O(1)
    public static int[] twoSumArraySolution3(int[] nums, int target) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while (left<right) {
            int currentSum=nums[left]+nums[right];
            if (currentSum==target)
                return new int[] {nums[left],nums[right]};
            else if(currentSum<left)
                left++;
            else if(currentSum>right)
                right--;
        }
        return new int [0];
    }
}

