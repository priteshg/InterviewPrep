package collections_test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Pritesh on 05/11/2019.
 */
public class PriceC{

    private Integer id;
    private Integer price;
    private Date date;

    public PriceC(int id, int price, Date date) {
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



    static class PriceComparator implements Comparator<PriceC> {


        @Override
        public int compare(PriceC o1, PriceC o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    }


    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        List<PriceC> prices = new ArrayList<PriceC>();
        prices.add(new PriceC(1,1,new Date()));
        prices.add(new PriceC(1,7,new Date()));
        prices.add(new PriceC(2,8,new Date()));
        prices.add(new PriceC(3,9,new Date()));
        prices.add(new PriceC(1,7,new Date()));

        Collections.sort(prices, new PriceComparator());

        List<PriceC> latestPrices = new ArrayList<PriceC>();

        for(PriceC price:prices){

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
