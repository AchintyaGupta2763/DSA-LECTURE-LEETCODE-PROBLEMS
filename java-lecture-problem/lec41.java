import java.util.*;
public class lec41{
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        int result = factorial(a);
        System.out.println(result);
    }
}