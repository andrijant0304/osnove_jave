package Vezbanje_16_12_2022;

import java.util.Scanner;

public class Zadatak10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        int timeVideo = s.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        int timeWatched = s.nextInt();

        if (timeVideo <= 0 || timeWatched < 0) {
            System.out.println("Uneli ste pogresne parametre! :(");
        } else {

            int percent = 100;
            int percentWatched = timeWatched * percent / timeVideo;

            int timeVideoMin = 0;
            int timeVideoSec;

            int timeWatchedMin = 0;
            int timeWatchedSec;


            for (int i = 1; i <= percent; i++) {
                if (i <= percentWatched) {

                    System.out.print("*");
                } else {
                    System.out.print("-");
                }

            }
            if (timeVideo >= 60) {
                timeVideoMin = timeVideo / 60;
                timeVideoSec = timeVideo % 60;
            } else {
                timeVideoSec = timeVideo;
            }
            if (timeWatched >= 60) {
                timeWatchedMin = timeWatched / 60;
                timeWatchedSec = timeWatched % 60;
            } else {
                timeWatchedSec = timeWatched;
            }
            System.out.println();
            System.out.println(timeWatchedMin + ":" + timeWatchedSec + " / " + timeVideoMin + ":" + timeVideoSec);
        }
    }
}


//(ZA VEZBANJE) Napisati program koji iscrtava timeline na youtube videu.
// Korisnik unosi duzinu videa u sekundama i trenutno vreme u videu,
// a program iscrtava timeline tako sto deo koji je pogledan iscrtava zvezdicama a ostatak crticama.
// Timeline je kontrola koja ima tacno 100 karaktera.
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//        *********-------------------------------------------------------------------------------------------
//
//        (Objasnjenje:Ako video ima 203s a mi smo na 20s, to znaci da je pogledano 9.85% videa
//        (zaokruzicemo to na 9zvezdica ostatak do 100 su crtice)
//
//(DOPUNA TAKODJE ZA VEZBANJE)
//        Pretvorite vremena u minute i sekune i stavite ih ispod prikaza:
//        Primer izvrsenja:
//        Unesite duzinu videa (s): 203
//        Unesite trenutno vreme videa (s): 20
//        *********-------------------------------------------------------------------------------------------
//        0:20 / 3:23
