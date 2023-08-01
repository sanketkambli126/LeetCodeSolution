
package leetcodesolution;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 * 
 * @author sanke
 * 
 * Question: Best Seat
You walk into a theatre you're about to see a show in. The usher within the theatre walks you to your row and mentions you're allowed to sit anywhere within the given row. Naturally you'd like to sit in the seat that gives you the most space. You also would prefer this space to be evenly distributed on either side of you (e.g. if there are three empty seats in a row, you would prefer to sit in the middle of those three seats).
Given the theatre row represented as an integer array, return the seat index of where you should sit. Ones represent occupied seats and zeroes represent empty seats.
You may assume that someone is always sitting in the first and last seat of the row. Whenever there are two equally good seats, you should sit in the seat with the lower index. If there is no seat to sit in, return -1. The given array will always have a length of at least one and contain only ones and zeroes.
 */

public class BestSeat {
    public static void main(String[] args) {
        int[] seats = {1,0,1,0,0,0,1};
        
        List<int[]> result = new ArrayList<>();
        int start = -1;
        for(int i=0; i<seats.length; i++)
        {
          boolean isOcuppied = seats[i] == 1;
          if(isOcuppied)
          {
             if(start!=-1)
             {
                 result.add(new int[]{start, i-1, i-1-start});
             }
             start=-1;
          }
          else
          {
              if(start==-1)
              {
                  start = i;
              }
          }
          
          if(seats.length -1 == i && start!=-1)
          {
             result.add(new int[]{start, i, i-1-start});
          }
          
        }
        
        
        
        Collections.sort(result, (o1, o2) -> {
            return o2[2] - o1[2]; //To change body of generated lambdas, choose Tools | Templates.
        });
        
        
        
       // return result.size() > 0 ?  (int)Math.floor((result.get(0) + result.get(1)) / 2))  : -1;
        System.out.println(result.size() > 0 ?  (int)Math.floor((result.get(0)[0] + result.get(0)[1]) / 2)  : -1);
    }
}
