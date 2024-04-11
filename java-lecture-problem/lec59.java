import java.util.*;

public class lec59{

    public static int rainwaterTrap(int numbers[]){
        int leftBoundary[] = new int[numbers.length];
        int rightBoundary[] = new int[numbers.length];
        int largestLeftBoundary = 0;
        int largestRightBoundary = 0;
        int min;
        int totalRainwater = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largestLeftBoundary){
                largestLeftBoundary = numbers[i];
            }
            leftBoundary[i] = largestLeftBoundary;
        }

        for(int i = (numbers.length-1);i>=0;i--){
            if(numbers[i]>largestRightBoundary){
                largestRightBoundary = numbers[i];
            }
            rightBoundary[i] = largestRightBoundary;
        }

        for(int i=0;i<numbers.length;i++){
            min = leftBoundary[i]<=rightBoundary[i] ? leftBoundary[i]:rightBoundary[i];
            totalRainwater = totalRainwater + ((min-numbers[i])*1);
        }
        return totalRainwater;    
    }

    public static void main(String args[]){
        int numbers[] = {4,2,0,6,3,2,5};
        int totalRainwater = rainwaterTrap(numbers);
        System.out.println(totalRainwater);

    }
}