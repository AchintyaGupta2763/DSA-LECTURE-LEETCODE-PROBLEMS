import java.util.*;
public class Problems {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        String type = (a>=0)?"positive":"negative";
        System.out.println(type);
    }
}
