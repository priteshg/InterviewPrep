package collections_test;

/**
 * Created by Pritesh on 06/11/2019.
 */
public class Isograms {

    public static boolean  isIsogram(String str) {


        System.out.println(str.toLowerCase().chars());
//        for(int i=0; i < str.length()-1; i++){
//
//            System.out.println("sub:"+str.substring(i+1));
//            System.out.println("char:"+str.substring(i,i+1));
//            if(str.substring(i+1).contains(str.substring(i,i+1))){
//                System.out.printf("false");
//                return false;
//            }
//        }
//        System.out.println("true");
        return true;


    }

    public static void main(String[] args) {
        isIsogram("pritesh");
    }
}
