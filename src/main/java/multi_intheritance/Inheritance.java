package multi_intheritance;

import java.util.Scanner;

/**
 * Created by Pritesh on 17/10/2019.
 */
public class Inheritance {

    public static void main(String[] args) {
        WaterFan f1 = new WaterFan();

        System.out.print("Enter name of Fan");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        System.out.print("Price of fam");
        Scanner s2 = new Scanner(System.in);
        int price = s2.nextInt();

        System.out.print("Enter air speed");
        Scanner s3 = new Scanner(System.in);
        int fanspeed = s3.nextInt();

        System.out.print("Enter water capacity");
        Scanner s4 = new Scanner(System.in);
        int capacity = s4.nextInt();

        f1.setName(name);
        f1.setPrice(price);
        f1.setAirSpeed(fanspeed);
        f1.setWaterCapacity(capacity);

        System.out.printf("name:" +name +" price: "+price+" fanspeed: " +fanspeed+ " capacity" +capacity );
    }
}
