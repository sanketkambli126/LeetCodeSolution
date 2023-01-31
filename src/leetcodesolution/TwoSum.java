/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcodesolution;

/**
 *
 * @author kokne
 */
public class TwoSum {

    public static void main(String[] args) {
        int a[] = {2, 7, 11, 15};
        int[] a111 = twoSumArray(a, 9);
        for (int i : a111) {
            System.out.println(i);
        }
    }

    public static int[] twoSumArray(int[] nums, int target) {
        int[] aa = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    aa[0] = i;
                    aa[1] = j;
                    return aa;
                }
            }
        }
        return aa;
    }
}

