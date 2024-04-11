public class lec71{

    public static void diagonalSum(int numbers[][]){
        int sum = 0;

        if(numbers.length == numbers[0].length){
            if(numbers.length%2 == 0){
                for(int i = 0; i<numbers.length;i++){
                    for(int j = 0; j<numbers[0].length;j++){
                        if(i == j){
                            sum+=numbers[i][j];
                        }
                    }
                }
                for(int i = numbers.length-1; i>=0; i--){
                    for(int j = numbers[0].length-1; j>=0; j--){
                        if(i==j){
                            sum+=numbers[i][j];
                        }
                    }
                }
            }
            if(numbers.length%2!=0){
                for(int i = 0; i<numbers.length;i++){
                    for(int j = 0; j<numbers[0].length;j++){
                        if(i == j){
                            sum+=numbers[i][j];
                        }
                    }
                }
                for(int i = numbers.length-1; i>=0; i--){
                    for(int j = numbers[0].length-1; j>=0; j--){
                        if(i==j){
                            if(i==numbers.length/2){
                                continue;
                            }else{
                                sum+=numbers[i][j];
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("matrix size should be n x n");
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        int numbers[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int numbers2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        diagonalSum(numbers);
        diagonalSum(numbers2);
    }
}