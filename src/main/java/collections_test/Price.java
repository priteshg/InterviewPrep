package collections_test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Pritesh on 05/11/2019.
 */
public class Price implements Comparable<Price>{

    private Integer id;
    private Integer price;
    private Date date;

    public Price(int id, int price, Date date) {
        this.id = id;
        this.price = price;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }


    @Override
    public int compareTo(Price p) {

        return this.date.compareTo(p.getDate());
    }

    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<Price> prices = new ArrayList<Price>();
        prices.add(new Price(1,1,new Date()));
        prices.add(new Price(1,7,new Date()));
        prices.add(new Price(2,8,new Date()));
        prices.add(new Price(3,9,new Date()));
        prices.add(new Price(1,7,new Date()));

        Collections.sort(prices);

        List<Price> latestPrices = new ArrayList<Price>();

        for(Price price:prices){

            Integer id = price.getId();
            if (!latestPrices.stream().anyMatch(o -> o.getId().equals(id))){
                latestPrices.add(price);
            }
        }


        prices.forEach(System.out::println);

        System.out.println("-----------------------------------");
        latestPrices.forEach(System.out::println);

    }



}
