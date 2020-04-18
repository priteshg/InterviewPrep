import java.util.Arrays;
import java.util.List;

/**
 * Created by Pritesh on 15/10/2019.
 */
public class Basics {

    private List<String> records;

    public Basics(String[] records) {
        this.records = Arrays.asList(records);
    }

    public void getRecords(){
        for (String rec:records) {
            System.out.println(rec);
        }
    }


    public static void main(String[] args) {
        Basics basics = new Basics(new String[] {"one","two","Three"});

    }

    public class Palindrome {


    }
}
