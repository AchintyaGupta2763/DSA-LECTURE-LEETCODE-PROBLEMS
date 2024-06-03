public class lec129{
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int verticalPossibility = tilingProblem(n-1);
        int horizontalPosibility = tilingProblem(n-2);

        return verticalPossibility+horizontalPosibility;
    }
    public static void main(String[] args){
        System.out.println(tilingProblem(5));
    }
}