import java.util.*;

public class lec96{
    public static int clearIthBit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be removed");
        int num1 = scan.nextInt();
        System.out.println("enter till which position");
        int num2 = scan.nextInt();

        return (num1 &(-1<<num2));

    }
    public static void main(String args[]){
        System.out.println(clearIthBit());
    }
}