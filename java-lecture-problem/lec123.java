public class lec123{
    public static int sumOfNumbers(int n){
        if(n==1){
            return n;
        }
        return n+sumOfNumbers(n-1);
    }
    public static void main (String[] args){
        int n = 3;
        System.out.println(sumOfNumbers(n));
    }
}