package leetcodesolution;

import java.util.Arrays;

/*Subarray Sort ✩
Write a function that takes in an array of at least two integers and that returns an array of the starting and ending indices of the smallest subarray in the input array that needs to be sorted in place in order for the entire input array to be sorted (in ascending order).
If the input array is already sorted, the function should return [-1, −1] .*/
public class SubArraySort {

    public static int[] subarraySort(int[] array) {
        int array2[]=Arrays.copyOf(array, array.length);
        Arrays.sort(array2);
       
        int minValue=-1;
        int maxValue=-1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=array2[i]){
                if(minValue==-1){
                    minValue=i;
                }else{
                    maxValue=i;
                }
            }
        }
        return new int[]{minValue,maxValue};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(subarraySort(new int[]{1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19})));
    }
}
