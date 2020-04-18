package inheritance.Interface;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Lion implements Pet {

    @Override
    public String petKeeper() {
        return null;
    }

    @Override
    public void eat() {

    }

    @Override
    public void color() {

    }

    @Override
    public void weight() {

    }

    public void move() {
        System.out.println("Crawl...");
    }
}

