package javaFights.singleNumber;

import java.util.Arrays;

/**
 You are given an array of integers in which every element appears twice, except for one. Find the element that only appears one time. Your solution should have a linear runtime complexity (O(n)). Try to implement it without using extra memory.

 Example

 For nums = [2, 2, 1], the output should be
 singleNumber(nums) = 1.

 Input/Output

 [time limit] 3000ms (java)
 [input] array.integer nums

 Constraints:
 1 ≤ nums.length ≤ 104,
 -109 ≤ nums[i] ≤ 109.

 [output] integer
 */
public class SingleNumber {
    public static void main(String[] args) {
        int[] n = {2, 2, 3};
        System.out.println(singleNumber(n));
    }
//    public static int singleNumber(int[] nums) {
//        Arrays.sort(nums);
//        for(int i = 0; i < nums.length-1; i++)
//            if(nums[i]!=nums[i+1])
//                return nums[i+1];
//        return 0;
//    }
    public static int singleNumber(int[] nums) {
        int result =0;
        for(int i : nums){
            result ^= i;
        }
        return result;
    }
}
