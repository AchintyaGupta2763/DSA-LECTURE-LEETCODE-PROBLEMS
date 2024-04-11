import java.util.*;

public class lec40{

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int product1 = multiply(a, b);
        System.out.println(product1);

        int c = scan.nextInt();
        int d = scan.nextInt();

        int product2 = multiply(c, d);
        System.out.println(product2);
    }
}