// find maximum numbers

import java.util.ArrayList;

public class lec148{
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        
        // get operation - O(1)

        list.add(2);
        list.add(5);      
        list.add(9);      
        list.add(6);
        list.add(8);

        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size();i++){
            if(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("max element = "+max);

        for(int i=0; i<list.size();i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = "+max);
    }
}