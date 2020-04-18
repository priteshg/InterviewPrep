package inheritance.Interface;

/**
 * Created by Pritesh on 17/10/2019.
 */
public interface Animal {

    String name = "Any Animal";

    void eat();

    void color();

    void weight();

    default void printMe() {
        System.out.println("print me");
    }

}
