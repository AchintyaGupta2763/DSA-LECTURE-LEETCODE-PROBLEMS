import java.util.*;
public class lec51{

    public static int linearSearch(int numbers[], int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }        
        return -1;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int numbers[] = {1,4,7,9,3,2,5};
        int key = scan.nextInt();
        int answer = linearSearch(numbers, key);
        if(answer==-1){
            System.out.println("no such key in the table");
        }else{
            System.out.println("the key was at index :- "+answer);
        }
    }
}