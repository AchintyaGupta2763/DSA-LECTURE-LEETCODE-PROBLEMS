import java.util.*;
public class lec52{
    public static int findLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        int answer = findLargest(numbers);
        System.out.println(answer);
    }
}