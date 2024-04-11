public class lec77{
    public static void printLetters(String str){
        for(int i = 0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        // find particular at a given index
        String firstName = "Shradha";
        String lastName = "Khapra";
        String fullname = firstName+" "+lastName;
        System.out.println(fullname.charAt(0));
        printLetters(fullname);
    }
}