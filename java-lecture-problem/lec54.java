import java.util.*;
public class lec54{
    public static void reverseArray(int numbers[]){
        int temp;
        int start = 0;
        int end = numbers.length-1;
        for(int i = 0;i<numbers.length;i++){
            if(start<=end){
                temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                end--;
                start++; 
            }           
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+",");
        }
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6};
        reverseArray(numbers);
    }
}