import java.util.*;

public class lec92{
    public static int getIthBit(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number whose ith bit has to be found");
        int num1 = scan.nextInt();
        System.out.println("enter the position");
        int num2 = scan.nextInt();
        if((num1 & (1<<num2)) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getIthBit());
    }
}