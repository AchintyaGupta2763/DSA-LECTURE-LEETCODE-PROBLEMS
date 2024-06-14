// pair sum using brute force array list
import java.util.ArrayList;
public class lec155 {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        for(int i = 0; i<list.size();i++){
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i)+list.get(j) == target) {
                    return true;
                }
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