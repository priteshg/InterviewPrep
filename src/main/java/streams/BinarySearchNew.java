package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pritesh on 22/10/2019.
 */
public class BinarySearchNew {

    public int binarySearch(int [] arr, int ef, int l, int u ){
        if(u < l){
            return -1;
        }

        int i = ((u+l)/2);
        int e = arr[i];

        if(e == ef){
            return i;
        }else if(e > ef){
            return binarySearch(arr,ef,l,i-1);
        } else {
            return binarySearch(arr,ef,i+1,u);
        }



    }


    public int findElementInArray(int [] arr, int element){
        int upperIndex = arr.length - 1;
        int lowerIndex = 0;
        return binarySearch(arr,element,lowerIndex,upperIndex);
    }

    public static void main(String[] args) {
        BinarySearchNew binarySearchNew = new BinarySearchNew();
        int[] arr = new int []{1,2,3,5,6,7,8,9};
        int ef = 9;
        System.out.println(binarySearchNew.findElementInArray(arr,ef));
        System.out.println(Arrays.binarySearch(arr,ef));

        ArrayList arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(Collections.binarySearch(arrayList,ef));
    }
}
