package collections_test;

/**
 * Created by Pritesh on 07/11/2019.
 */
public class Slice {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int n = (A[0]+A[1])/2; //initialise
        int startingPos = 1;
        int result;
        for(int i =0; i<A.length -1; i++){
            for(int j =i+1; j<A.length; j++){
                result=0;
                for(int k = i; k <= j; k++) result += A[k]; //add it all up
                    result /= (j-i+1);
                if(result < n) {
                    n = result;
                    startingPos = i;
                }
            }
        }
        return startingPos;
    }

    public static void main(String[] args) {

    }
}
