import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Pritesh on 08/05/2017.
 */
public class SexyPair {
    static boolean flag = false;

    public static void main(String[] args) {
        int max = 0;
        System.out.println("Enter Maximum No.:");
        Scanner sc = new Scanner(System.in);
        max = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        List<Integer> primeNos = new ArrayList<Integer>();
        int n;
        for (n = 1; n < max; n++) {
            flag = true;
            int i;
            for (i = 2; i < n; i++) {
                System.out.println("n = [" + n + "], testing [" + i + "] mod = [" + n % i + "]");
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                primeNos.add(n);
            }



        }
        for (int pn : primeNos) {
            for (int i : primeNos) {
                if ((i - pn) == 6) {
                    sb.append("(").append(pn).append(",").append(i).append(")");
                }
            }
        }

        System.out.println("Sexy Pairs:" +sb.toString());

    }
}
