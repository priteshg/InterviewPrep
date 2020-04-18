/**
 * Created by Pritesh on 08/05/2017.
 */

import java.io.*;

public class PalindromeString {
    public static void main(String a[]) throws Exception {
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn = br.readLine();
        System.out.println("Result string is:");
        char[] chars = strn.toCharArray();
        int endIndex = chars.length - 1;
        int index;
        flag=1;
         for(index = 0; index<(endIndex/2); index++){
             if(chars[index] != chars[endIndex-index]){
                 flag = 0;
             }
         }
        //reverse letters

        //end
        if (flag == 1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome");

    }
}


