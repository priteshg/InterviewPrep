package multi_intheritance;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Animal {
    private String name;
    private String color;

    Animal(String n, String c){
        name =n;
        color = c;
    }

    public Animal() {

    }

    public String getName() {
        System.out.println("The name of the animal goes here");
        return name;
    }

    public String getColor() {
        System.out.println("The color of the animal goes here");
        return color;
    }

}

class Dog extends Animal {
        Dog() {
            super("Lion", "Orange");
        }

    public static void main(String[] args) {
        Animal a = new Dog();
    }
}




