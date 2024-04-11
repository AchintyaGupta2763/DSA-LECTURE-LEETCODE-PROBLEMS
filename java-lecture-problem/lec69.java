import java.util.*;

public class lec69{

    public static boolean search(int numbers[][], int key){
        int n = numbers.length, m = numbers[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(numbers[i][j] == key){
                    System.out.println("found at cell (" + i + "," + j +")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){

        int numbers[][] = new int[3][3];
        int n = numbers.length, m = numbers[0].length;

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j = 0; j<m; j++){
                numbers[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        search(numbers, 5);        
    }
}