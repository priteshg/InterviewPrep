package streams;

import java.util.Arrays;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Demo {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int n = 1;
        Arrays.sort(A);

        for (int i = 0; i < A.length; i++) {
            if (A[i] == n) {
                n++;
            } else if (A[i] > n) {
                return n;
            }

        }

        return n;
    }
}
