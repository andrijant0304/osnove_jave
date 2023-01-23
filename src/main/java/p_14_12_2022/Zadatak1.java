package p_14_12_2022;

import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime: ");
        String firstName = s.next();

        System.out.println("Unesite prezime: ");
        String lastName = s.next();

        System.out.println("Unesite broj telefona: ");
        String phone = s.next();

        System.out.println("Unesite email: ");
        String email = s.next();

        System.out.println("Unesite JMBG: ");
        int jmbg = s.nextInt();

        System.out.println(firstName + " " + lastName + " - " + jmbg);
        System.out.println("Broj telefona: " + phone);
        System.out.println("Email: " + email);





    }

}
