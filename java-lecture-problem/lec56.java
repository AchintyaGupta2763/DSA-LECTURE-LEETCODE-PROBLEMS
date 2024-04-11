import java.util.*;

public class lec56{
    public static void subArrays(int numbers[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum + numbers[k];
                    if(sum>max){
                        max = sum;
                    }
                }                
                System.out.println("the sum is "+sum);
                System.out.println();
                sum = 0;
            }
            System.out.println();
            System.out.println("the maxium of sum is " + max);
            max = Integer.MIN_VALUE;
            System.out.println();

        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        subArrays(numbers);
    }
}