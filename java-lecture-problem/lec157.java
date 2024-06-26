// pair sum but the array is rotated - sorted

import java.util.ArrayList;

public class lec157 {
    public static boolean pairSum2(ArrayList<Integer> list , int target){
        int pivot = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }            
        }
        int lp = pivot+1;
        int rp = pivot;

        while (lp!=rp) {
            if (list.get(lp)+list.get(rp) == target) {
                return true;            
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }            
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] elements = {11, 15, 6, 8, 9, 10};
        for (int element : elements) {
            list.add(element);            
        }
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}