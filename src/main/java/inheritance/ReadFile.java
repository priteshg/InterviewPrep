package inheritance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Pritesh on 15/10/2019.
 */
public class ReadFile {


    FileReader fileReader = new FileReader("c:\test.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);


    ReadFile() throws FileNotFoundException {

    }

    public static void main(String[] args) {

    }
}
