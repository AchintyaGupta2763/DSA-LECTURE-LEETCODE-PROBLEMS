import java.util.*;

public class lec62{

    public static void bubbleSort(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                if(numbers[j]<numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]= temp;
                }
            }
        }

        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {5, 4, 1, 3, 2};
        bubbleSort(numbers);
    }
}