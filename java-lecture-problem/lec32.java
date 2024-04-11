import java.util.*;
public class lec32 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        for(int i=1;i<=userInput;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }    
}
