package streams;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Pritesh on 08/11/2019.
 */
public class Price {

        private Integer id;
        private Double price;
        private Long timestamp;

        public Price(int id, double price, long timestamp){
            this.id = id;
            this.price = price;
            this.timestamp = timestamp;
        }

        public Integer getId(){
            return id;
        }

        public Double getPrice(){
            return price;
        }

        public Long getTimestamp(){
            return timestamp;
        }

        public String toString(){
            return "Price[" + id + "," + price + "," + timestamp + "]";
        }



        public static void main(String []args){
            List<Price> prices = Arrays.asList(
                    new Price(1,3.0,31111),
                    new Price(1,20.0,44444),
                    new Price(1,5.0,22222),
                    new Price(2,2.0,11111),
                    new Price(2,1.0,33333),
                    new Price(3,10.0,99989)
            );
            List<Price> result = prices.stream()
                    .collect(Collectors.groupingBy(Price::getId, Collectors.maxBy(Comparator.comparing(Price::getTimestamp))))
                    .values().stream()
                    .map(Optional::get)
                    .collect(Collectors.toList());

            result.forEach(System.out::println);

            //output
//            Price[1,20.0,44444]
//            Price[2,1.0,33333]
//            Price[3,10.0,99989]
        }
    }


