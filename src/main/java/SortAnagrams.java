import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Pritesh on 23/10/2019.
 */
public class SortAnagrams {


    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("act");
        words.add("dog");
        words.add("cat");
        words.add("wolf");
        words.add("gym");
        words.add("elf");
        words.add("flow");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("---------------");
        int maxIndex = words.size();

        for (int i = 0; i < maxIndex; i++) {
            for (int j = i + 1; j < maxIndex; j++) {
                String firstPos = words.get(i);
                String SecondPos = words.get(j);
                if (firstPos.compareTo(SecondPos) > 0) {
                    words.set(i, SecondPos);
                    words.set(j, firstPos);
                }
            }
        }
        for (String word : words) System.out.println(word);

    }
}
