package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Pritesh on 18/10/2019.
 */
public class Main {



    public static void main(String[] args) {
    List<Person> people = getPeople();

    List<Person> females = people.stream()
            .filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
            females.forEach(System.out::println);
    }

    private static List<Person> getPeople(){
        return Arrays.asList(
        new Person(Gender.MALE, 18, "John Doe"),
                new Person(Gender.FEMALE, 22, "Alexia Vega"),
                new Person(Gender.MALE, 20, "James Bond"),
                new Person(Gender.FEMALE, 28, "Mindy Moore"));
    }

}

