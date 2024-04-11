import java.util.Scanner;

public class lec98{
    public static boolean checkIfPowerOfTwo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to check whether power of two");
        int num1 = scan.nextInt();

        return ((num1&(num1-1))==0);
    }

    public static void main(String args[]){
        System.out.println(checkIfPowerOfTwo());
    }
}