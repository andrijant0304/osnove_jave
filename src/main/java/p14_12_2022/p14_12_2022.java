package p14_12_2022;

import java.util.Scanner;

public class p14_12_2022 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Uneiste vrednost za a: ");
        int a = s.nextInt();

        System.out.print("Uneiste vrednost za b: ");
        int b = s.nextInt();
        int sum = a + b;


        System.out.println("Suma " + a + "+" + b + "=" + sum);
    }

}
