package javaFights.commonCharacterCount;

/**
 *Given two strings, find the number of common characters between them.

 Example

 For s1 = "aabcc" and s2 = "adcaa", the output should be
 commonCharacterCount(s1, s2) = 3.

 Strings have 3 common characters - 2 "a"s and 1 "c".

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string s1

 A string consisting of lowercase latin letters a-z.

 Guaranteed constraints:
 1 ≤ s1.length ≤ 15.

 [input] string s2

 A string consisting of lowercase latin letters a-z.

 Guaranteed constraints:
 1 ≤ s2.length ≤ 15.

 [output] integer
 */
public class CommonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(commonCharacterCount(s1, s2));
        System.out.println(commonCharacterCount2(s1, s2));
    }

    public static int commonCharacterCount(String s1, String s2) {
        int count = 0;
        boolean[] t = new boolean[s2.length()];
        for(int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j) && !t[j]) {
                    t[j] = true;
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static int commonCharacterCount2(String s1, String s2) {
        int[] a = new int[26],
                b = new int[26];
        for (char c: s1.toCharArray())
            a[c - 'a']++;
        for (char c: s2.toCharArray())
            b[c - 'a']++;
        int s = 0;
        for (int i = 0; i < 26; ++i)
            s +=Math.min(a[i],b[i]);
        return s;
    }
}
