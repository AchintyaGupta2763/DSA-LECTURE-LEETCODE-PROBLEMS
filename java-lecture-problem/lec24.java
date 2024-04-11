import java.util.*;

public class lec24 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int counter = 1;
        int sum = 0;
        while(counter<=userInput){
            sum+=counter;
            counter++;
        }
    System.out.println(sum);
    }
}
