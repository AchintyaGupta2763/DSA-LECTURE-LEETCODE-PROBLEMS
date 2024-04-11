import java.util.Arrays;
import java.util.Collections;

public class lec67{
    public static void main(String args[]){
        Integer numbers[] = {5, 4, 1, 3, 2};
        Arrays.sort(numbers, 0, 4, Collections.reverseOrder());
        for(int num:numbers){
            System.out.print(num);
        }
    }
}