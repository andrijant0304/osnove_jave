package p_21_12_2022;

import java.util.ArrayList;

public class UvodNizovi {
    public static void main(String[] args) {
        System.out.println("POCETAK");

        String x = "Milan";
//        x.length()
        ArrayList<String> cars = new ArrayList<String>();
        cars.add(0, "Volvo");
        cars.add(0, "BMW");
        cars.add(0, "Ford");
        cars.add(0, "Mazda");

        cars.remove(2);
    }
}
//