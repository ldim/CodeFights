package javaFights.allLongestStrings;
/**
 Given an array of strings, return another array containing all of its longest strings.

 Example

 For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 allLongestStrings(inputArray) = ["aba", "vcd", "aba"].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string inputArray

 A non-empty array.

 Guaranteed constraints:
 1 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i].length ≤ 10.

 [output] array.string

 Array of the longest strings, stored in the same order as in the inputArray.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {
    public static void main(String[] args) {
        String[] arr = {"aba", "aa", "ad", "vcd", "aba"};
        System.out.println(Arrays.toString(allLongestStrings(arr)));
    }
    public static String[] allLongestStrings(String[] inputArray) {
        List<String> answer = new ArrayList<>();
        answer.add(inputArray[0]);
        for (int i=1; i<inputArray.length;i++) {
            if(inputArray[i].length()==answer.get(0).length()) {
                answer.add(inputArray[i]);
            }
            if(inputArray[i].length()>answer.get(0).length()) {
                answer = new ArrayList<>();
                answer.add(inputArray[i]);
            }
        }
        return answer.toArray(new String[answer.size()]);
    }
}
