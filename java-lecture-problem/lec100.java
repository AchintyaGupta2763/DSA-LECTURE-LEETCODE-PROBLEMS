import java.util.*;

public class lec100{

    public static int fastExponential(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num1 = scan.nextInt();
        System.out.println("enter the exponent");
        int num2 = scan.nextInt();
        
        int ans = 1;

        while(num2>0){
            if((num2&1)!=0){
                ans = ans * num1;
            }
            num1 = num1*num1;
            num2 = num2>>1;
        }
        return ans;

    }
    public static void main(String args[]){
        System.out.println(fastExponential());
    }
}