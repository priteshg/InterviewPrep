package collections_test;

import java.util.Arrays;

/**
 * Created by Pritesh on 07/11/2019.
 */
public class ArraySequence {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++){
            if(A[i] != i+1){
                return 0;
            }
        }
    return 1;
    }
}

