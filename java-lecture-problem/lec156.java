// pair sum using brute force array list
import java.util.ArrayList;
public class lec156 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;

        while (lp!=rp) {
            if (list.get(lp)+list.get(rp) == target) {
                return true;            
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }            
        }
            
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] elements = {1,2,3,4,5,6};
        for(int element:elements){
            list.add(element);
        }
        int target = 50;
        System.out.println(pairSum(list, target));
    }
}