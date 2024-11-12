package week5;

import java.util.ArrayList;

//**  Write a Java program to test if an array list is empty or not
public class Programe_7 {

    public static void main(String[] args) {

        ArrayList<String > colourist = new ArrayList<>();
        colourist.add ("Blue");
        colourist.add ("Green");
        colourist.add ("Yellow");
        colourist.add ("Brown");

        System.out.println("Print colour list: " + colourist);
        System.out.println("checking the above array list is empty or not " + colourist.isEmpty());
        colourist.removeAll(colourist);
        System.out.println( "Array list after remove all" + colourist);
        System.out.println("Checking the above list is empty or not " + colourist.isEmpty());

    }

}
