package p_26_12_2022;

import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite rimski broj: ");
        String roman = s.next();

        int arabic = conversion(roman);

        System.out.print("Arapski broj je: " + arabic);
    }

    public static int conversion(String roman){
        if (roman.equals("I")){
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        }else if (roman.equals("V")) {
            return 5;
        } else {
            return 0;
        }
    }
}

//    Napisati metodu koja vrsi konverziju rimske(string) u arapske brojeve(int).
//        1 - I
//        2 - II
//        3 - III
//        4 - IV
//        5 - V
//        Kao parametar se unosi vrednost rimkog broja(string) a vraca se arapski (int).
//        Ako se unese V vraca se 5. Ako se unese vrednost koja nije podrzana vracamo nulu.


