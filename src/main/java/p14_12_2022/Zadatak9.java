package p14_12_2022;

import java.util.Scanner;

public class Zadatak9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

//        int defaultVolume = 75;

        System.out.print("Unesite pocetnu jacinu zvuka: ");
        int defaultVolume = s.nextInt();

        String volumeUp = "pojacaj", volumeDown = "smanji", volumeMute = "mute";

        System.out.println("Jacina zvuka je: " + defaultVolume);

        System.out.print("Unesi akciju: ");
        String volumeAction = s.next();

        if ( volumeAction.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction.equals(volumeMute)){
            defaultVolume = 0;
        } else {
            System.out.println("Pogresno uneta naredba");
        }

        if ( defaultVolume < 0){
            defaultVolume = 0;
        } else if ( defaultVolume > 100){
            defaultVolume = 100;
        }

        System.out.println("Nova jacina zvuka je " + defaultVolume);

    }

}
