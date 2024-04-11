public class lec70{

    public static void spiralMatrix(int numbers[][]){
        int startRow = 0;
        int endRow = numbers.length-1;
        int startColumn = 0;
        int endColumn = numbers[0].length-1;

        while (startRow<=endRow && startColumn<=endColumn) {
            for(int i = startColumn; i<=endColumn-1; i++){
                System.out.print(numbers[startRow][i]+" ");
            }
            for(int i = startRow; i<=endRow-1;i++){
                System.out.print(numbers[i][endColumn]+" ");
            }
            for(int i = endColumn; i>startColumn;i--){
                System.out.print(numbers[endRow][i]+" ");
            }
            for(int i = endRow; i>startRow;i--){
                System.out.print(numbers[i][startColumn]+" ");
            }

            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }

    public static void main(String args[]){
        int numbers[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        spiralMatrix(numbers);
    }
}