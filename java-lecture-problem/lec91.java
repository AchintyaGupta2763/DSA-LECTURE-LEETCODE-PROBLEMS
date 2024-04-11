import java.util.*;

public class lec91{
    public static void oddOrEven(){
        Scanner scan  = new Scanner(System.in);
        int num = scan.nextInt();
        if((num & 1)==1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
    public static void main(String args[]){
        oddOrEven();
    }
}