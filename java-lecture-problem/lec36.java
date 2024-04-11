import java.util.*;
public class lec36 {
    public static void main (String args[]){
        Scanner scan  = new Scanner(System.in);
        int userInput = scan.nextInt();
        int space = (2*userInput)-2;
        for(int i = 1;i<=userInput;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            for(int z = space;z>0;z--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            space = space-2;
        }
        space = 0;
        for(int l = userInput;l>0;l--){
            for(int m = l;m>0;m--){
                System.out.print("*");
            }
            for(int n = space;n>0;n--){
                System.out.print(" ");
            }
            for(int o = l;o>0;o--){
                System.out.print("*");
            }
            System.out.print("\n");
            space = space+2;
        }
        
    }
}
