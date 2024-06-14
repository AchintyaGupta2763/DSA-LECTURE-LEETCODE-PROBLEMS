// add, get, remove, change and find the element on array list 
import java.util.ArrayList;

public class lec145 {
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

        System.out.println(list);

        // get operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        // Delete operation - O(n)
        list.remove(2);
        System.out.println(list);

        // set operation - O(n)
        list.set(2, 10);
        System.out.println(list);

        // contain operation - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // add an element in between the indices - O(n)

        list.add(1, 9);
        System.out.println(list);

    }    
}