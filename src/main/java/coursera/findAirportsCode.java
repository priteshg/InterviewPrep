package coursera;
import coursera.Airport;

public class findAirportsCode {

    public static String findAirports(String toFind, Airport[] airports) {

        int high, low, mid;
        high = airports.length - 1;
        low = 0;


        while (low <= high) {
            mid = low + (high - low) / 2;
            int compare = toFind.compareTo(airports[mid].getCity());
            if (compare < 0) {
                high = mid - 1;
            } else if (compare > 0) {
                low = mid + 1;
            } else{
                return airports[mid].getCity();
            }
        }
        return null;
    }

}
