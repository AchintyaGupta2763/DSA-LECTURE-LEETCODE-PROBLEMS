import java.util.*;

public class lec20 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+' : System.out.println((a+b));
                break;
            case '-' : System.out.println((a-b));
                break;
            case '*' : System.out.println((a*b));
                break;
            case '/' : System.out.println((a/b));
                break;
            case '%' : System.out.println((a%b));
                break;
            default : System.out.println(("wrong operator"));
                break;
        }
    }
    
}
