public class lec131{
    public static int numberOfPairs(int n){
        if(n==1||n==2){
            return n;
        }
        return (numberOfPairs(n-1) + ((n-1)*numberOfPairs(n-2)));
    }
    public static void main(String[] args){
        System.out.println(numberOfPairs(5));        
    }
}