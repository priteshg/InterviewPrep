package inheritance.abstracttest;

/**
 * Created by Pritesh on 17/10/2019.
 */
public abstract class Teacher extends Person {

    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void getMyMoney();

}
