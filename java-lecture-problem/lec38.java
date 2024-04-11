import java.util.*;
public class lec38{
    public static int calculateSum(int a, int b){//parameters or formal parameters
        int sum  = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int sum = calculateSum(a,b);// arguments or actual parameter
        System.out.println(sum);
    }
}