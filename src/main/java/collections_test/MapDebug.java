package collections_test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pritesh on 18/10/2019.
 */
public class MapDebug {

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa",1);
        map.put("bbb",2);
        map.put("ccc",3);
        map.put("ddd",4);
        System.out.println("hashcode:" +map.hashCode());


            }

}
