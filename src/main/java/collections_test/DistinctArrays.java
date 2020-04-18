package collections_test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pritesh on 07/11/2019.
 */
public class DistinctArrays {
        public static int solution(int[] A) {
            int count = 0;
            //Points for each
            for (int i = 0; i < A.length - 1; i++) {
                System.out.println();
                System.out.print("A[" + i + "] = " + A[i] + " :");

                //Get the points in the list
                List<Integer> points = new ArrayList<Integer>();
                for (int p = i; p > -A[i] + i - 1; p--) {
                    System.out.print(p + ",");
                    points.add(p);
                }
                for (int p = i; p < A[i] + i + 1; p++) {
                    System.out.print(p + ",");
                    if (!points.contains(p)) points.add(p);
                }

                //iterate others
                outerLoop:
                for (int j = i + 1; j < A.length; j++) {
                    for (int p = j; p > -A[j] + j - 1; p--) {
                        if (points.contains(p)) {
                            count++;
                            break outerLoop;
                        }
                    }

                    for (int p = j; p > A[j] + j + 1; p++) {
                        if (points.contains(p)) {
                            count++;
                            break outerLoop;
                        }
                    }

                }
            }
            return count;
        }

    public static void main(String[] args) {
        DistinctArrays.solution(new int[]{2,1,1,2,3,1});
    }
}
