import java.util.*;

public class lec23 {
    public static void main(String args[]){
        int counter = 1;
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        while(counter<=userInput){
            System.out.println(counter);
            counter++;
        }
    }
}
