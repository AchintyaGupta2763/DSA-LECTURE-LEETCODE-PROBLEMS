import java.util.*;
public class sample {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println(avg);
        float side = scanner.nextFloat();
        float area = side*side;
        System.out.println(area);
    }
}
