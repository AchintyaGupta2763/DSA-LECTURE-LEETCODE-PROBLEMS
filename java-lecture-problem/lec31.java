import java.util.*;

public class lec31 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int noOfLines = scan.nextInt();
        for(int i = noOfLines; i>0; i--){
            for(int j = i; j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
