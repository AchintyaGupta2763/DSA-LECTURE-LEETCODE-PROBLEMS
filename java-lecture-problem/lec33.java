import java.util.*;
public class lec33 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        char alphabet = 'A';
        for(int i = 1;i<=userInput;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(alphabet);
                alphabet++;
            }
            System.out.print("\n");
        }
    }
}
