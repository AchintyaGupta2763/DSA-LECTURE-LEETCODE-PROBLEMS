// container with most water(almost similar to rainwater)
import java.util.ArrayList;

public class lec153 {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0; i<height.size(); i++){
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-1;
                int currWater = ht*width;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        int[] elements = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        for (int element : elements){
            height.add(element);
        }
        System.out.println(storeWater(height));
    }
}