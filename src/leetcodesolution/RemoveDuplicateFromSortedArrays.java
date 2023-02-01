/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

/**
 *
 * @author sanke
 */
public class RemoveDuplicateFromSortedArrays {

    public RemoveDuplicateFromSortedArrays() {
    }
    
    // Array should be sorted 
    // doesn't care about input array
    public int bestSolution(int[] nums) {
        int p = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[p] != nums[i]){
                nums[p+1] = nums[i];
                p++;
            }
        }
        return p + 1;
    }
      
    // Precondition array Should be sorted
    public int solution(int[] nums)
    {
        int count = 1;
        int prev = nums.length > 0 ? nums[0] : 0;
        for(int i=1; i<nums.length; i++)
        {
            if(prev != nums[i])
                count++;
            prev = nums[i];
        }
        return count;
    }
        
      
}
