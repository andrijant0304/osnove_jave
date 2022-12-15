package vezbanje_15_12_2022;

import java.util.Scanner;

public class Vezbanje2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite sat: ");
        int hour = s.nextInt();

        System.out.print("Unesite minut: ");
        int minute = s.nextInt();

        System.out.println("Aktivirace se u: ");

        int alarmDelay = 5;
        int counter = 0;

        while ( counter < 7 ){

            System.out.println( hour + ":" + minute);
            minute = minute + alarmDelay;

            if (minute >= 60){
                minute = minute - 60;
                hour++;
            }
            if ( hour == 24 ){
                hour = 0;
            }
            counter++;
        }

    }
}


//    Napisati program koji simulira alarm  .
//        Alarm se ponavlja na svakih 5minuta narednih pola sata.
//        Korisnik unosi sat i minut za koji zeli da navije alarm a program prikazuje vremena u
//        kojima ce se alarm aktivirati
//        Primer izvrsenja 1:
//        Unesite sat: 8
//        Unesite minut: 15
//        Aktivirace se u:
//        8:15
//        8:20
//        8:25
//        8:30
//        8:35
//        8:40
//        8:45
//        Primer izvrsenja 2:
//        Unesite sat: 8
//        Unesite minut: 36
//        Aktivirace se u:
//        8:36
//        8:41
//        8:46
//        8:51
//        8:56
//        9:1
//        9:6
//        Nije potrebno ali moglo bi da se vodi racuna za navijanje oko ponoci,
//        da se umesto u 24:00 prelazi u 00:00
