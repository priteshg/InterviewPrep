package coursera;

import java.util.Arrays;

public class arraySort {

    public static void sortArray(Integer[] list){
        int indexMin;
        for(int i = 0; i<list.length -1; i++){
            indexMin = i;
            for(int j = i + 1; j <list.length; j++){
                if(list[j] < list[indexMin]) {
                    indexMin = j;
                }
            }
          swap (list, indexMin, i);
        }
    }

    private static void swap(Integer[] list, int indexMin, int i) {
        //Swaps
        Integer temp = list[i];
        list[i] = list[indexMin];
        list[indexMin] = temp;
    }

    public static void main(String[] args) {


    }
}
