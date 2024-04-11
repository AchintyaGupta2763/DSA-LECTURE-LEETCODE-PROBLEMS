import java.util.*;

public class lec15 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a<500000){
            System.out.println("no tax to pay");
        }
        else if(a>=500000 && a<1000000){
            int tax = (int) (a * 0.2); 
            System.out.println("tax " + tax);         
        }
        else if(a>=1000000){
            int tax = (int) (a * 0.3);  
            System.out.println("tax " + tax);         
        }
    }   
}
