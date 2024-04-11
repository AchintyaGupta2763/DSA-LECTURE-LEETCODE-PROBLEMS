import java.util.Scanner;
public class lec37 {

    public static void printHelloWorld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    public static void calculateSum(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String args[]){
        printHelloWorld();
        calculateSum();
    }
}
