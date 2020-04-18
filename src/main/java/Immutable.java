/**
 * Created by Pritesh on 18/10/2019.
 */
public final class Immutable { //cannot be overridden or extended

    private final String varOne;
    private final String varTwo;

//once assigned cannot be changed
    public Immutable(String varOne, String varTwo) {
        this.varOne = varOne;
        this.varTwo = varTwo;
    }


    public String getVarOne() {
        return varOne;
    }

    public String getVarTwo() {
        return varTwo;
    }
}
