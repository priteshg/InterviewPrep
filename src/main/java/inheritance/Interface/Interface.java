package inheritance.Interface;

import java.util.List;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Interface {

    public static void main(String[] args) {
        Animal a = new Lion();

        a.color();
        a.eat();
        ((Lion) a).move();
    }
}
