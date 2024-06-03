// find number of ways in grid ways using permutatiuon 

public class lec142 {
    public static int factorial(int a){
        if(a == 1){
            return a;
        }
        return a * factorial(a-1);
    }
    public static int gridWaysPermutattion(int n, int m){
        return factorial(n-1 + m-1)/(factorial(n-1)*factorial(m-1));
    }

    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(gridWaysPermutattion(n, m));
                
    }   
}