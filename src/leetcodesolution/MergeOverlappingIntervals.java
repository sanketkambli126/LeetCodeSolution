
package leetcodesolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** question: 
  Write a function that takes in a non-empty array of arbitrary intervals, merges any overlapping intervals, and returns the new intervals in no particular order.
Each interval interval is an array of two integers, with interval[0] as the start of the interval and interval[1] as the end of the interval.
Note that back-to-back intervals aren't considered to be overlapping. For example, [1, 5] and [6, 7] aren't overlapping; however, [1, 6] and [6, 7] are indeed overlapping.
Also note that the start of any particular interval will always be less than or equal to the end of that interval.
  
**/
public class MergeOverlappingIntervals {
    
    public static void main(String[] args) {
         int[][] inputArr = {{1, 2},{3, 5},{4, 7},{6, 8},{8, 10}};
         int index = 0;
         
         int [][] sortedIntervals = inputArr.clone();
         Arrays.sort(sortedIntervals, (a, b) -> Integer.compare(a[0], b[0]));
         
         //int[][] result = new int[inputArr.length][2];       
         List<int[]> result = new ArrayList<>();

         int [] prevArr = sortedIntervals[0];
                 
         for(int i=1;i<sortedIntervals.length; i++)
         {
             int[] currentArr = sortedIntervals[i];
             boolean isMerged = false;
             if(prevArr[1] >= currentArr[0])
             {
                 int start = prevArr[0];
                 int end = Math.max(prevArr[1], currentArr[1]);
                 int[] newPrevArr = {start, end};
                 prevArr = newPrevArr;
                 isMerged = true;
             }
             else
             {
                 //result[index++]=prevArr;                 
                 result.add(prevArr);
                 prevArr = currentArr;
             }
             if(i == (inputArr.length -1))
                 //result[index++]= isMerged ? prevArr : currentArr; 
                 result.add(isMerged ? prevArr : currentArr);
         }
         
         System.out.println(Arrays.deepToString(result.toArray()));
         
        int[][] result2 =  result.toArray(new int[result.size()][]);
        
        System.out.println(Arrays.deepToString(result2));
    }
}

