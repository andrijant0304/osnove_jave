package p_14_12_2022;

import java.util.Scanner;

public class Vezbanje7_equals {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi znak karte koja je na stolu: ");
        String cardSign = s.next();

        System.out.print("Unesi znak karte koja je na stolu: ");
        String cardNum = s.next();

        System.out.print("Unesi znak karte koja je na stolu: ");
        String playerCardSign = s.next();

        System.out.print("Unesi znak karte koja je na stolu: ");
        String playerCardNum = s.next();

        if (cardSign.equals(playerCardSign) || cardNum.equals(playerCardNum)){

            System.out.println("Potez je validan");

        } else {
            System.out.println("Potez nije validan");
        }

    }

}
