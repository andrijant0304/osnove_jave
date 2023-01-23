package p_14_12_2022;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Upisi broj: ");
        int a = s.nextInt();

        if ( a < 10){
            System.out.println("Broj je jednocifren");
        } else if (a > 10 && a < 100) {
            System.out.println("Broj je dvocifren");
        } else {
            System.out.println("Broj je trocifren ili veci");
        }
    }

}
