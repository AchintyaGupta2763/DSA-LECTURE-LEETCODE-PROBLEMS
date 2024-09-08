//Max area in histogram

// Given an array of integers representing the histogram’s bar height 
// where the width of each bar is 1,
// return the area of the largest rectangle in the histogram

import java.util.*;

/**
 * lec185
 */
public class lec185 {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length]; // nsr = next smaller right
        int nsl[] = new int[arr.length]; // nsl = next smaller left

        Stack<Integer> s = new Stack<>();

        // filling nsr array
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();
        // filling nsl array
        for (int i = 0; i<arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // area => width x height
        // width = j-i-1 ==> nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("max area in histogram = "+maxArea);

    }
    public static void main(String[] args) {
        int arr [] = {2, 1, 5, 6, 2, 3};
        maxArea(arr);
        
    }
}