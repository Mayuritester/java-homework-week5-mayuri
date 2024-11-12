package week5;
//** * Write a Java program to iterate through all elements in an array list using
// * Iterator.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programme_5 {

    public static void main(String[] args) {
        Map<Integer, String> countryList = new HashMap<>();
        countryList.put (1, "Brazil");
        countryList.put (2, "Portugal");
        countryList.put (3, "India");
        countryList.put (4, "USA");
        countryList.put (5, "Japan");

        System.out.println(countryList);

        for (Map.Entry<Integer, String> country :   countryList.entrySet()) {
            System.out.println(country.getKey() + " " + country.getValue());
        }

        Iterator<Map.Entry<Integer, String>> countriesList = countryList.entrySet().iterator();
        while (countriesList.hasNext()) {
            System.out.println(countriesList.next());

        }
        }
    }
