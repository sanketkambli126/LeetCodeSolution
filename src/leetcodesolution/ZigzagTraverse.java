
package leetcodesolution;

import java.util.ArrayList;
import java.util.List;

/*Zigzag Traverse
Write a function that takes in an n x m two-dimensional array (that can be square-shaped when n == m) and returns a one-dimensional array of all the array's elements in zigzag order.
Zigzag order starts at the top left corner of the two-dimensional array, goes down by one element, and proceeds in a zigzag pattern all the way to the bottom right corner.
*/

public class ZigzagTraverse {
    public static void main(String[] args) {
        List<List<Integer>> arrray1=new ArrayList<List<Integer>>();
        arrray1.add(List.of(1,  3,  4, 10));
        arrray1.add(List.of(2,  5,  9, 11));
        arrray1.add(List.of(6,  8, 12, 15));
        arrray1.add(List.of(7, 13, 14, 16));
        System.out.println(zigzagTraverse(arrray1));
    }
    public static List<Integer> zigzagTraverse(List<List<Integer>> array) {
    List<Integer> op=new ArrayList<>();
       int width=array.get(0).size()-1;
       int height=array.size()-1;
       int row=0;
       int column=row;
       boolean isDown=true;
        while (!(row<0||row>height||column<0||column>width)) {         
            op.add(array.get(row).get(column));
            if(isDown){
                if(column==0||row==height){
                    isDown=false;
                    if (row==height) {
                        column++;
                    }else{
                        row++;
                    }
                }else{
                    row++;
                    column--;
                }
            }
            else{
                if (row==0||column==width) {
                    isDown=true;
                    if(column==width){
                        row++;
                    }else{
                        column++;
                    }
                }else{
                    column++;
                    row--;
                }
            }
        }
    return op;
  }
}
