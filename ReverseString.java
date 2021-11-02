import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * LeetCode 344 Reverse String
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {


    /**
     * Write a function that reverses a string.
     * 
     * Runtime: 1 ms, faster than 96.35% of Java online submissions.
     * Memory Usage: 45.7 MB, less than 82.94% of Java online submissions.
     * 
     * 477 / 477 test cases passed.
     * Status: Accepted
     * Runtime: 1 ms
     * Memory Usage: 45.7 MB
     * 
     * Runtime: O(n) - Space: O(1)
     */
    static public void reverseString(char[] s) {
        
        // **** sanity check(s) ****
        if (s.length == 1) return;

        // **** initialization ****
        int l = 0;
        int r = s.length - 1;

        // **** loop inverting array ****
        while (l < r) {

            // ???? ????
            System.out.println("<<< l: " + l + " r: " + r);

            char tmp    = s[l];
            s[l++]      = s[r];
            s[r--]      = tmp;
        }
    }


    /**
     * Test scaffold.
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // **** open buffered reader ****
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // **** read input into list ****
        List<String> lst = Arrays.stream(br.readLine().trim().split(","))
                        .collect(Collectors.toList());

        // **** close buffered reader ****
        br.close();

        // **** concatenate strings ****
        String str = "";
        for (String s : lst)
            str += s.substring(1, 2);

        // **** convert string to char[] ****
        char[] s = str.toCharArray();

        // ???? ????
        System.out.println("main <<< s: " + Arrays.toString(s));

        // **** call function of interest ****
        reverseString(s);

        // **** display output ****
        System.out.println("main <<< output: " + Arrays.toString(s));
    }

}