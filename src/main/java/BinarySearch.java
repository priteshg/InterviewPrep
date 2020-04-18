/**
 * Created by Pritesh on 22/10/2019.
 */
public class BinarySearch {


    public int binarySearchMethod(int[] arr, int x, int upper, int lower) {
        int index = (upper + lower) / 2;
        int key = arr[index];

        if(upper == 0){
            return -1;
        }
        if(key == x){
            return index;
        }else if(key > x){
           return binarySearchMethod(arr, x, index - 1, lower);
        } else{
            return binarySearchMethod(arr, x, upper+ 1, index);
        }
    }


    public int getElement(int[] arr, int x) {
        int maxIndex = arr.length -1;
        return binarySearchMethod(arr,x, maxIndex,0);
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.getElement(new int[]{1, 2, 3, 6, 7, 9},  10));

    }
}
