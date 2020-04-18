package inheritance.abstracttest;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Student extends Person {

    private int fee;
    public Student(String name, int age, int fee) {
        super(name, age);
        this.fee = fee;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
