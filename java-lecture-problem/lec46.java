// optimized method to find the prime number
public class lec46{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i = 2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    public static void main(String args[]){
        System.out.println(isPrime(5));
        System.out.println(isPrime(12));
        System.out.println(isPrime(2));
    }
}