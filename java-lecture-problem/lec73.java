public class lec73{
    public static boolean staircaseSearch(int numbers[][], int key){
        int row = 0;
        int column = numbers[0].length-1;

        while(row<numbers.length && column>=0){
            if(numbers[row][column]==key){
                System.out.println("key was present at index "+row+","+column);
                return true;
            }
            else if(key<numbers[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;        
    }

    public static boolean staircaseSearch2(int numbers[][], int key){
        int row = numbers.length-1;
        int column = 0;

        while(row>=0 && column<numbers[0].length-1){
            if(numbers[row][column]==key){
                System.out.println("key was present at index "+row+","+column);
                return true;
            }
            else if(key<numbers[row][column]){
                row--;
            }
            else{
                column++;
            }
        }
        System.out.println("key not found");
        return false;        
    }
    public static void main(String args[]){
        int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        int key  = 33;
        staircaseSearch(matrix, key);
        staircaseSearch2(matrix, 30);
    }
}