// container with most water (2 pointer approach)

import java.util.ArrayList;

public class lec154 {
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater, currWater);

            if(height.get(lp)<height.get(rp)) {
                lp++;
            } else {
                rp--;
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