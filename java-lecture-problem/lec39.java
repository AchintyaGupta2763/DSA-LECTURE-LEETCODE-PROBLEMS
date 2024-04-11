import java.util.*;
public class lec39{
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);
        System.out.println("b = " +b);
    }
    // java always call by value 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        swap(a, b);//this funtion just copies the values of a and b rather than directly handling them
        // and then giving the result 

        System.out.println("a = "+a);
        System.out.println("b = " +b);

        // hence when called in the main function it doesn't change the value even after the function is called 
    }
}