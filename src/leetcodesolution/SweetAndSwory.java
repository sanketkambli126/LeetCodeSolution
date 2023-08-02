package leetcodesolution;

import java.util.Arrays;

/*✩Sweet And Savory✩
You're hosting an event at a food festival and want to showcase the best possible painting of two dishes from the festival that complement each other's flavor profile
Each dish has a flavor profile represented by an integer. A negative integer means a dish is sweet, while a positive integer means a dish is savory. The absolute value of that integer represents the Intensity of that flavor. For example, a flavor profile of 3 is slightly sweet, one of-10 is extremely sweet, one of 2 is mildly savory, and one of 8 is significantly savory.
You're given an array of these dishes and a target combined flavor profile. Write a function that returns the best possible pairing of two dishes (the pairing with a total flavor profile that's closest to the torget one). Note that this pairing must include one sweet and one savory dish. You're also concerned about the dish being too savory, so your pairing should never be more savory than the target flavor profile.
All dishes will have a positive or negative flavor profile; there are no dishes with a value. For simplicity, you can assume that there will be at most one best solution. If there isn't a valid solution, your function should retum Ie, 6] The returned array should be sorted, meaning the sweet dish should always come first.*/
public class SweetAndSwory {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sweetAndSavory(new int[]{-3, -5, 1, 7}, 8)));
        System.out.println(Arrays.toString(sweetAndSavory(new int[]{2, 5, -4, -7, 12, 100, -25}, 8)));
    }

    public static int[] sweetAndSavory(int[] dishes, int target) {
        int oparray[] = new int[]{0, 0};
        Arrays.sort(dishes);
        if (dishes.length == 0 || !(dishes[0] < 0)) {
            return oparray;
        }
        int leftvalue = 0;
        int rightvalue = 0;
        int leftindex = 0;
        int rightindex = dishes.length - 1;
        int bestvalue = Integer.MAX_VALUE;
        while (leftindex < rightindex) {

            if ((dishes[leftindex] < 0) && (dishes[rightindex] > 0)) {
                if (target == dishes[leftindex] + dishes[rightindex]) {
                    return new int[]{dishes[leftindex], dishes[rightindex]};
                } else if (target > dishes[leftindex] + dishes[rightindex]) {
                    //leftvalue=dishes[leftindex];
                    //rightvalue=dishes[rightindex];
                    leftindex++;
                } else {
                    int currentSum = dishes[leftindex] + dishes[rightindex];
                    if (currentSum <= bestvalue) {
                        leftvalue = dishes[leftindex];
                        rightvalue = dishes[rightindex];
                        bestvalue=currentSum;
                    }

                    rightindex--;
                }
            } else {
                break;
            }

        }
        return leftvalue + rightvalue <= target ? new int[]{leftvalue, rightvalue} : new int[]{0, 0};
    }
}
