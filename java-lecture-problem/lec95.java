import java.util.Scanner;

public class lec95{

    public static int clearIthBit(int num1, int num2){        
        return (num1 & (~(num2<<1)));
    }

    public static int setIthBit(int num1, int num2){
        return (num1 ^ (num2<<1));
    }


    public static int updateIthBit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be changed");
        int num1 = scan.nextInt();
        System.out.println("enter the position");
        int num2 = scan.nextInt();
        System.out.println("Enter the new nit");
        int num3 = scan.nextInt();
        if(num3 == 0){
            return clearIthBit(num1, num2);
        }else{
            return setIthBit(num1, num2);
        }
    }

    public static int updateIthBit2(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be changed");
        int num1 = scan.nextInt();
        System.out.println("enter the position");
        int num2 = scan.nextInt();
        System.out.println("Enter the new nit");
        int num3 = scan.nextInt();
        
        return ((clearIthBit(num1, num2)|(num3<<num2)));
    }
    public static void main(String args[]){
        System.out.println(updateIthBit());
        System.out.println(updateIthBit2());
        
    }
}