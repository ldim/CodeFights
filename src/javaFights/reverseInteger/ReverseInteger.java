package javaFights.reverseInteger;

/**
 Reverse the digits of the given integer.

 Example

 For x = 12345, the output should be
 reverseInteger(x) = 54321;
 For x = -4243, the output should be
 reverseInteger(x) = -3424.
 Input/Output

 [time limit] 3000ms (java)
 [input] integer x

 Constraints:
 -901000 ≤ x ≤ 901000.

 [output] integer
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 12345;
        System.out.println(reverseInteger(x));
    }

    public static int reverseInteger(int x) {
        int reverse=0;
        for(int i = x; i !=0; i /= 10) {
            reverse = reverse * 10 + i % 10;
        }
        return reverse;
    }
}
