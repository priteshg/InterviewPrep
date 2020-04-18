package codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.StrictMath.abs;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Solution3 {
    public int solution(int[] A) {
        // write your code in Java SE 8



        //[2, 150, 10, 8, 100]


        Arrays.sort(A);
        int biggestGap = 0;
        int gap;
        for (int i = 0; i < A.length - 1; i++) {
            gap = abs(A[i] - A[i + 1]); //initialise
            if (gap > biggestGap) biggestGap = gap;
        }
        return biggestGap/2;// get how
    }

    public static void main(String[] args) {
//        System.out.println(String.format("%s = %d", "joe", 35));
//        System.out.println(String.format("%id = %0.8f",423.147));
        System.out.println(2/0);

        List<Solution3> people = new ArrayList<>();
        people.add(new Solution3());
//        Solution3 s = new Solution3();
//        System.out.println(s.solution(new int[]{1,10}));
    }

}
