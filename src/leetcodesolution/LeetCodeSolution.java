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
public class LeetCodeSolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RemoveDuplicateFromSortedArrays soln = new RemoveDuplicateFromSortedArrays();
        int[] a = { 1,1,5,6,8,8, 14, 16,17,18,19,20 };
        System.out.println(soln.solution(a));
    }
    
}
