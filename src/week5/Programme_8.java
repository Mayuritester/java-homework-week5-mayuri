package week5;

import java.util.HashSet;

//*** Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
//     * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
//     * else)
public class Programme_8 {

    public static void main(String[] args) {
        HashSet<Integer> number = new HashSet<>();
        number.add((4));
        number.add((7));
        number.add((8));

        System.out.println("checking the number between 1 and 10");
        for (int i = 1; i<=10; i++){
            if ( (number.contains(i))) {
                System.out.println(i + " is in the set");
            }else {
                System.out.println(i + " is not in the set");
            }
        }

    }
}
