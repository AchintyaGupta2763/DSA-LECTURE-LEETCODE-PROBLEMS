// sort values of java arraylist using inbuilt function
import java.util.Collections;
import java.util.ArrayList; 

public class lec150{
    
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(5);      
        list.add(9);      
        list.add(6);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}