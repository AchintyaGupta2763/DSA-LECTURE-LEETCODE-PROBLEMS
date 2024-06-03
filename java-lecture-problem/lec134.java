public class lec134{
    public static int search(int arr[], int tar, int si, int ei){

        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar){
            return mid;
        }

        // mid lie on l1
        if(arr[si]<=arr[mid]){
            // case A:
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr, tar, si, mid);
            }
            // case B
            else{
                return search(arr, tar, mid+1, ei);
            }
        }
        // mid lie on l2
        else{
            // case C
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            // case D
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}