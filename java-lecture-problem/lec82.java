// for a given set od string, print the largest string 
// lexicograhically e.i a<b== appple < banana

public class lec82{
    public static void main(String args[]){
        //in built function
        // st1.compareTo and st1.compareToIgnoreCase
        // a!= A and a == A
        // 0:equal
        // <0:-ve st1<st2
        // >0:+ve st1>st2
        // code:-

        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}