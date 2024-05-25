public class lec122{
    public static int factorial(int n){
        if (n==1){
            return n;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println("factorial of "+n+" is = "+ factorial(n));
    }
}