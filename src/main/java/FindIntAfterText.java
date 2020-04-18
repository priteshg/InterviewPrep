

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Pritesh on 22/10/2019.
 */
public class FindIntAfterText {

    public List<String> getEntriesWithInt(String [] A, String text){
        int n = text.length();
        List<String> intAfterText = new ArrayList<>();
        for (int i = 0; i < A.length; i++){
            String afterText = A[i].substring(n);
            try {
                Integer.parseInt(afterText);
                intAfterText.add(A[i]);
            }catch(Exception e){
               // e.printStackTrace();
            }
        }

        return intAfterText;
    }


}
