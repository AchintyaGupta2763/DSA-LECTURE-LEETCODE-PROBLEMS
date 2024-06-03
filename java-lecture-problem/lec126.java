public class lec126{
    public static int lastOccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }

        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4,5,6,4,4,6,7,8};
        int index = lastOccurence(arr, 4, 0);
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("key not found");
        }
    }
}