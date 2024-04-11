public class lec72{
    public static void diagonalSumBruteForce(int matrix[][]){
        int sum = 0;
        for(int i = 0; i <matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void diagonalSumOptimizedMethod(int matrix[][]){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum+=matrix[i][i];
            if(i !=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }            
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        int numbers[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int numbers2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        diagonalSumBruteForce(numbers);
        diagonalSumBruteForce(numbers2);

        diagonalSumOptimizedMethod(numbers);
        diagonalSumOptimizedMethod(numbers2);
    }
}