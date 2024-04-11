import java.util.*;
public class lec29 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<userInput;i++){
            if(userInput%i==0){
                isPrime = false;
            }
        }

        if(isPrime==true){
            System.out.println(userInput+" Is prime");
        }
        else{
            System.out.println(userInput + " Is composite");
        }
    } 
}
