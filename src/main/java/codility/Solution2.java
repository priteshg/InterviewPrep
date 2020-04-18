package codility;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Solution2 {
    public static int solution(String S) {
        // write your code in Java SE 8
        int n = Integer.parseInt(S, 2);
        int counter = 0;
        while (n > 0) {
            n = (n%2 == 0 ) ? n/2 : n -1;
            counter++;
        }

        return counter;

    }

    public static void main(String[] args) {
        System.out.println(Solution2.solution("011100"));
    }
}
