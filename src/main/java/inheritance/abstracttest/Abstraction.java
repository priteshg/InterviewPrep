package inheritance.abstracttest;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Abstraction {


    public static void main(String[] args) {
        Student s1 = new Student("John", 15,15000);
        System.out.println(s1.getName());
        System.out.println(s1.getFee());
        System.out.println(s1.getAge());

    }
}
