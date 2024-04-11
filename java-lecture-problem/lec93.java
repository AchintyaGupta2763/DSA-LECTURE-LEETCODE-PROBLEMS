import java.util.Scanner;

public class lec93{
    public static int setIthBit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be changed");
        int num1 = scan.nextInt();
        System.out.println("enter the position");
        int num2 = scan.nextInt();
        
        return (num1 ^ (num2<<1));
    }

    public static void main(String args[]){
        System.out.println(setIthBit());
    }
}