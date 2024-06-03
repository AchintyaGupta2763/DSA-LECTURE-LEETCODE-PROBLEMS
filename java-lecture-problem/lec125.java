public class lec125{
    public static int myFirstOccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] != key){
            return myFirstOccurence(arr, key, i+1);
        }
        return i;
    }

    public static int courseFirstOccurence(int arr[], int key, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return courseFirstOccurence(arr, key, i+1);
    }
    
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4,5,6,4,4,6,7,8};
        int index = myFirstOccurence(arr, 4, 0);
        if(index!=-1){
            System.out.println(index);
        }else{
            System.out.println("key not found");
        }

        int index2 = courseFirstOccurence(arr, 4, 0);
        if(index!=-1){
            System.err.println(index2);
        }else{
            System.out.println("key not found");
        }
    }
}