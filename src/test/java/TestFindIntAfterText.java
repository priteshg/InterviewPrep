import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Created by Pritesh on 22/10/2019.
 */
public class TestFindIntAfterText {
    FindIntAfterText findIntAfterText = new FindIntAfterText();

    @Before
    public void init(){
        //FindIntAfterText findIntAfterText = new FindIntAfterText();

    }

    @Test
    public void testOne(){
        List<String> returnVals = findIntAfterText.getEntriesWithInt(new String[] {"One","One1234","One12kkdd","One11","One990"}, "One");
        returnVals.stream().forEach(s -> System.out.println(s));

        ArrayList<String> expectedList = new ArrayList<String>(){
            {
                add("One1234");
                add("One11");
                add("One9901");
            }};
        assertThat(returnVals, equalTo(expectedList));
    }

    @After
    public void end(){

    }
}
