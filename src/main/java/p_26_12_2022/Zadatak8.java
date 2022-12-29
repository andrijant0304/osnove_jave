package p_26_12_2022;

import java.util.Scanner;

public class Zadatak8 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesi stranicu A: ");
        int a = s.nextInt();

        System.out.print("Unesi stranicu B: ");
        int b = s.nextInt();

        System.out.print("Unesi stranicu C: ");
        int c = s.nextInt();



        if (triangle(a, b, c)){
            System.out.println("Trougao je pravougli.");
        } else {
            System.out.println("Trougao nije pravougli.");
        }


    }
    public static boolean triangle (int a, int b, int c){
        if (a * a + b * b == c * c){
            return true;
        } else {
            return false;
        }

//        if (a * a + b * b == c * c) {
//            return true;
//        }
//        return false;
    }
}

//    Napisati metodu koja proverava da li je trougao pravougli.
//    Metoda prima stranice trougla i hipotenuzu trougla.
//    Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//        Trougao je pravougli ukoliko je a*a+b*b=c*c
//
