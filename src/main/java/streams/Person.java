package streams;

/**
 * Created by Pritesh on 18/10/2019.
 */
public final class Person {

    private  Gender gender;
    private  int age;
    private  String name;

    Person(Gender gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
