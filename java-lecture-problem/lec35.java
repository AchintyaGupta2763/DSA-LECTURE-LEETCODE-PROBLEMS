import java.util.*;

public class lec35 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        for(int i = 1;i<userInput;i++){
            if(i == 1 || i == userInput-1){
                for(int j = 1;j<=userInput;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int z = 1;z<=userInput;z++){
                    if(z==1 || z==userInput){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
