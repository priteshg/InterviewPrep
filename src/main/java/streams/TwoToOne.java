package streams;

import java.util.stream.IntStream;

/**
 * Created by Pritesh on 06/11/2019.
 */
public class TwoToOne {

    public static String longest (String s1, String s2) {
        // your code

        IntStream best =  s1.chars().distinct().count() > s2.chars().distinct().count() ? s1.chars().distinct() : s2.chars().distinct();

        return  best.sorted().collect(StringBuilder::new,
                StringBuilder::appendCodePoint,
                StringBuilder::append)
                .toString();
    }

    public static void main(String[] args) {
        System.out.println(TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
    }
}
