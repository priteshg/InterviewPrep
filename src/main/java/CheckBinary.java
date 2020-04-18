import java.util.Scanner;

/**
 * Created by Pritesh on 08/05/2017.
 */
public class CheckBinary {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        String type = "binary";
        String numAsString = String.valueOf(num);
        char[] chars = numAsString.toCharArray();

        for (char c : chars) {
            if (Character.getNumericValue(c) > 1) {
                type = "not binary";
                break;
            }
        }
        System.out.println("The number is:" + type);

    }
}
