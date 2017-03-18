package javaFights.sumOfTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 You have two integer arrays, a and b, and an integer target value v.
 Determine whether there is a pair of numbers, where one number is taken from a and the other from b,
 that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

 Example

 For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
 sumOfTwo(a, b, v) = true.

 Input/Output

 [time limit] 3000ms (java)
 [input] array.integer a

 An array of integers.

 Constraints:
 0 ≤ a.length ≤ 105,
 -109 ≤ a[i] ≤ 109.

 [input] array.integer b

 An array of integers.

 Constraints:
 0 ≤ b.length ≤ 105,
 -109 ≤ b[i] ≤ 109.

 [input] integer v

 Constraints:
 -109 ≤ v ≤ 109.

 [output] boolean

 true if there are two elements from a and b which add up to v, and false otherwise.
 */
public class SumOfTwo {
    public static void main(String[] args) throws IOException {
        int[] arr1 = {1, 5, 10, 12, 4, 20};
        int[] arr2 = {0, 7, 15, 12, 32, 50, 10, 18, 40};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your value: ");
        int value = Integer.parseInt(br.readLine());
        System.out.println("Result: " + sumOfTwo(arr1, arr2 , value));
    }

    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for(int i=0;i<a.length;i++) {
            for(int j=0;j<b.length;j++) {
                if(a[i] + b[j] == v){
                    return true;
                }
            }
        }
        return false;
    }

}
