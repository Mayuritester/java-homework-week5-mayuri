package week5;

import java.util.*;

//** * Write a programme that tells you which line passes through particular stations.
//     * Just use Zone 1 stations name.
public class Programme_10 {

    public static void main(String[] args) {

    Map<String, List<String>> stationLines = new HashMap<>();
    stationLines.put("Euston Square", Arrays.asList("Circle", "Hammersmith&City","Metropolitan"));
    stationLines.put("Embankment", Arrays.asList("Circle", "District","Bakerloo"));
    stationLines.put("Leicester Square", Arrays.asList("Picadilly","Bakerloo"));
    stationLines.put("Liverpool street", Arrays.asList("Central", "Circle", "Hamersmith and City", "Overground", "Elizabeth"));

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the station name to find the line that pass throuch it (Zone 1): ");
        String stationName = scanner.nextLine();

        List<String> lines = stationLines.get (stationName);

        if (lines != null) {
            System.out.println("Line pass through is " + stationName + ":" + String.join(",", lines));
        }else {
            System.out.println("Station not found in Zone 1 or the station name in incorrect. ");


        }
        scanner.close();
}}
