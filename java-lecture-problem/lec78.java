public class lec78{
    public static boolean isPalindrome(String str){
        int n = str.length()-1;
        for(int i = 0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                return false;
            }            
        }
        return true;
    }
    public static void main(String args[]){
        //palindrome 
        String str = "chiku";
        System.out.println(isPalindrome(str));
    }

}