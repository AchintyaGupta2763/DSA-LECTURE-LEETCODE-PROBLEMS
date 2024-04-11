import java.util.*;

public class lec34{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        int star = 1;
        
        while(userInput!=0){
            for(int i = userInput;i>1;i--){
                System.out.print(" ");
            }
            for(int j = 0;j<star;j++){
                System.out.print("*");
            }
            System.out.print("\n");
            userInput--;
            star++;
        }
    }
}