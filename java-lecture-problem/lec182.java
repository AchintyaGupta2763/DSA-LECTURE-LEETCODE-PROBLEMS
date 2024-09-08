// next greater element on right side

/**
 * lec182
 */

import java.util.*;

public class lec182 {

    public static int[] nextGreater(int arr[]) {
        int nextgreater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        int n = arr.length;

        // for finding next greatest element on the left side 
        // change ==> i = 0; i<n; i++
        for (int i = n - 1; i >= 0; i--) { 

            // for finding the smallest 
            //change ==> s.peak() >= arr[i]
            while (!s.isEmpty() && s.peek() <= arr[i]) { 
                s.pop();
            }

            if (s.isEmpty()) {
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = s.peek();
            }

            s.push(arr[i]);
        }

        return nextgreater;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int newArr[] = nextGreater(arr);

        System.out.println("Next greater elements:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
