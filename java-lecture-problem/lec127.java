public class lec127{
    public static int powerOfN(int base, int power){
        if(power == 1){
            return base;
        }
        return base*powerOfN(base, power-1);
    }
    public static void main (String[] args){
        int base = 2;
        int power = 5;
        System.out.println(powerOfN(base, power));
    }
}