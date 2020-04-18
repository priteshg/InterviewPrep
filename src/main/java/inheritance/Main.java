package inheritance;

/**
 * Created by Pritesh on 09/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
        Base b2 = new Base();
        b2.show();
    }
}
