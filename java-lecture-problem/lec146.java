//size == length function for array list 
import java.util.ArrayList;

public class lec146{
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        
        // get operation - O(1)

        list.add(1);
        list.add(2);      
        list.add(3);      
        list.add(4);
        list.add(5);
        System.out.println(list.size());
        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
    }
}