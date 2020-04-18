package inheritance;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Pritesh on 09/05/2017.
 */
public class HashMapExample {
    Map<Integer,String> hmap = new HashMap<Integer,String>();

    public static void main(String[] args) {
        HashMapExample hme = new HashMapExample();
        hme.setMap();
        hme.printMap();
    }

    public void setMap(){
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
    }

    public void printMap(){
      for(Map.Entry<Integer, String> entry : hmap.entrySet()){
          System.out.println(entry.getKey());
      }
    }
}
