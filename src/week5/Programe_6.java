package week5;

import java.util.HashMap;
import java.util.Map;

//*** Write a Java program to retrieve an element (at a specified index) from a given
//     * array list
public class Programe_6 {

    public static void main(String[] args) {
        Map<Integer, String> countryList = new HashMap<>();
        countryList.put (1, "Brazil");
        countryList.put (2, "Portugal");
        countryList.put (3, "India");
        countryList.put (4, "USA");
        countryList.put (5, "Japan");

        System.out.println(countryList.size());
        System.out.println(countryList.get(3));
    }
}
