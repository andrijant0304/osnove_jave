package p_19_12_2022;

import java.util.Scanner;

public class Zadatak11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite password: ");
        String pass = s.next();

        System.out.print("Skriveni password: ");

        for (int i = 0; i < pass.length(); i++) {
            System.out.print("*");
        }


    }
}
