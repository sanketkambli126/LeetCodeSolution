
package leetcodesolution;


public class MinRewards {
    public static void main(String[] args) {
        int[] scores = new int[]{ 0, 4, 2, 1, 3 };
        System.out.println(minRewards(scores));
    }
    public static int minRewards(int[] scores) {
    
        int minPoint=0;
        int minValue = scores[0];
        int minRewardCount = 1;
        
        int leftReward = 1; int rightReward =  1;
        
        int leftpointer = 0; int rightpointer = scores.length;
        
        int i=0;
        int scoreLength = scores.length;
        
        while(i<scoreLength)
        {
            if(minValue > scores[i])
            {
                minValue = scores[i];
                minPoint = i;
            }
            i++;
        }
        
        leftpointer = minPoint -1;
        rightpointer = minPoint + 1;
        int prevLeftValue = minValue; 
        int prevRightValue = minValue;
        
        while(leftpointer >= 0)
        {
            if(prevLeftValue < scores[leftpointer])
            {
                minRewardCount += (leftReward+1);
                leftReward+=1;
            }
            else
            {
                minRewardCount+= 1;
                leftReward = 1;
            }
            prevLeftValue = scores[leftpointer];
            leftpointer--;
        }
        
        while(rightpointer < scoreLength)
        {
            if(prevRightValue < scores[rightpointer])
            {
                minRewardCount += (rightReward+1);
                rightReward += 1;
            }
            else
            {
                minRewardCount +=1;
                rightReward = 1;
            }
            prevRightValue = scores[rightpointer];
            rightpointer++;
        }
        
        return minRewardCount;
  }
}
