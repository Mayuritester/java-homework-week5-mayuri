package week5;

import java.util.ArrayList;

//**Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.
public class Programme_4 {

    public static void main(String[] args) {
        ArrayList <String> colourlist = new ArrayList<>();
        colourlist.add ("Blue");
        colourlist.add ("Green");
        colourlist.add ("Yellow");
        colourlist.add ("Brown");

        System.out.println("Colour list");

        for (String colour   : colourlist){
            System.out.println(colour);
        }
    }
}
