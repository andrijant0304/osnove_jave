package p_20_12_2022;

import java.util.Scanner;

public class p_20_12_2022_while_loop {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number = 0;

        while (number != 0) {
            System.out.println("Unesi broj: ");
            number = s.nextInt();

            System.out.println("Unet broj je " + number);
        }
        System.out.println("Unet broj je nula. END");
    }
}
