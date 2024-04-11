import java.util.*;

public class lec64{
    public static void insertionSort(int numbers[]){
        for(int i = 1; i<numbers.length; i++){
            for(int j = i - 1; j>=0; j--){
                if(numbers[i]>numbers[j]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public static void insertionSortApnaCollege(int numbers[]){
        for(int i = 1; i<numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;
            while(prev>=0 && numbers[prev] > curr){
                numbers[prev+1] = numbers[prev];
                prev--;
            }
            numbers[prev+1] = curr;
        }
        for(int num:numbers){
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {5, 4, 1, 3, 2};
        insertionSort(numbers);
        System.out.println();
        insertionSortApnaCollege(numbers);
    }
}