import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Pritesh on 08/05/2017.
 */
public class TestReadFile {

    @Test
    public void testRead() {
        ReadFile readFile = new ReadFile("text.txt");
        String content = "This is a test";
        readFile.writeToFile(content);
        String result = readFile.printFile();
        assertThat(content, equalTo(result));

    }

}
