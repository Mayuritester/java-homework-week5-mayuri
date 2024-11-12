package week5;

import java.util.HashMap;

// /**
//     * Create a HashMap object called people that will store String keys and Integer
//     * values: And use for each loop to iterate the value from Map.
public class Programme_9 {

    public static void main(String[] args) {
        HashMap <String, Integer> people = new HashMap<>();
        people.put ("John", 30 );
        people.put ("Zara", 36 );
        people.put ("Sue", 44 );
        people.put ("Alex", 66 );

        System.out.println( "Ages of the people in the map");
        for (Integer age   :people.values()){
            System.out.println(age);
        }
    }
}
