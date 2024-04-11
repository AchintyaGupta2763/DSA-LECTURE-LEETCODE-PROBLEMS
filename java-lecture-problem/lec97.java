import java.util.Scanner;

public class lec97{
    public static int clearRangeBit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be cleared");
        int num1 = scan.nextInt();
        System.out.println("enter the start position");
        int num2 = scan.nextInt();
        System.out.println("enter the end position");
        int num3 = scan.nextInt();

        int a = (-1<<num3+1);
        int b = (1<<num2)-1;
        int bitmask = a | b;
        return num1 & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearRangeBit());
    }
}