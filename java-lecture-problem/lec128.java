public class lec128{
    public static int factorialMoreOptimized(int base, int power){
        if(power == 1){
            return base;
        }
        int num = factorialMoreOptimized(base, power/2);
        num = num*num;

        if(power%2!=0){
            num = base*num;
        }
        return num;
    }
    public static void main(String[] args){
        int base = 2;
        int power = 11;
        System.out.println(factorialMoreOptimized(base, power));
    }
}