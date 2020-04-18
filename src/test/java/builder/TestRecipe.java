package builder;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Created by Pritesh on 09/05/2017.
 */
public class TestRecipe {

    @Test
    public void testBuilder() {
        Recipe recipe = new Recipe.Builder().meatType("test").egg("egg").build();

        Assert.assertThat('l', equalTo('l'));
    }
}
