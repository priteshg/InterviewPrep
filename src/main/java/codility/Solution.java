package codility;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Solution {

    public Solution() {
        StringBuffer a;

    }

    static int solution(int[] A) {
        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            ans += A[i];
            System.out.println(ans);
        }
        return ans;
    }


    public static void main(String[] args) {
        Solution.solution(new int[]{1});
    }

}
