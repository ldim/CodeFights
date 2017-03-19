package javaFights.tripletSum;

import java.util.Arrays;

/**
 Note: Write a solution with O(n2) time complexity, since this is what you would be asked to do during a real interview.

 You have an array a composed of exactly n elements. Given a number x, determine whether or not a contains three elements for which the sum is exactly x.

 Example

 For x = 15 and a = [14, 1, 2, 3, 8, 15, 3], the output should be
 tripletSum(x, a) = false;

 For x = 8 and a = [1, 1, 2, 5, 3], the output should be
 tripletSum(x, a) = true.

 The given array contains the elements 1,2, and 5, which add up to 8.

 Input/Output

 [time limit] 3000ms (java)
 [input] integer x

 Constraints:
 1 ≤ x ≤ 3000.

 [input] array.integer a

 Constraints:
 3 ≤ a.length ≤ 1000,

 1 ≤ a[i] ≤ 1000.

 [output] boolean

 Return true if the array contains three elements that add up to x and false otherwise.
 */
public class TripletSum {
    public static void main(String[] args) {
        int x = 16;
        int[] a = {13, 1, 2, 3, 8, 15, 3};
        System.out.println(tripletSum(x, a));
    }

    public static boolean tripletSum(int x, int[] a) {
        Arrays.sort(a);
        int c = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > x) {
                break;
            }
            int b = x-a[i];
            for(int j = 1; j < a.length; j++) {
                if(a[j] > x) {
                    break;
                }
                if(i!=j)
                    c = b - a[j];
            }

            return (b + c + a[i]) == x;
        }
        return false;
    }

}
