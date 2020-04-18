package collections_test;

/**
 * Created by Pritesh on 07/11/2019.
 */
public class BinaryTest {
        public int solution(int N) {
            String br = Integer.toBinaryString(N);
            System.out.println(br);
            String[] gaps = br.split("1");

            int l = gaps.length;
            if(br.substring(br.length()-1).equals("0")){
                l = l - 1;
            }

            int n = 0;
            System.out.println("size of Array:"+gaps.length);
            for(int i = 0; i < l; i++){
                System.out.println("gaps["+i+"] = " +gaps[i]);
                if(gaps[i].length() > n) n = gaps[i].length();
            }
            System.out.println(n);
            System.out.println("---------------");
            return n;

        }

    public static void main(String[] args) {
        BinaryTest bt = new BinaryTest();
        bt.solution(32);
        bt.solution(65);

    }
    }

