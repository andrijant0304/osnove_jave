package Vezbanje_14_12_2022;

import java.util.Scanner;

public class Zadatak11 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int defaultVolume = 75;

//        System.out.print("Unesite pocetnu jacinu zvuka: ");
//        int defaultVolume = s.nextInt();

        String volumeUp = "pojacaj", volumeDown = "smanji", volumeMute = "mute";

        System.out.println("Jacina zvuka je: " + defaultVolume);

        System.out.print("Unesi akciju 1: ");
        String volumeAction1 = s.next();

        if ( volumeAction1.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction1.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction1.equals(volumeMute)){
            defaultVolume = 0;
        } else {
            System.out.println("Pogresno uneta naredba");
        }
        if ( defaultVolume < 0){
            defaultVolume = 0;
        } else if ( defaultVolume > 100){
            defaultVolume = 100;
        }

        System.out.print("Unesi akciju 2: ");
        String volumeAction2 = s.next();

        if ( volumeAction2.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction2.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction2.equals(volumeMute)){
            defaultVolume = 0;
        } else {
            System.out.println("Pogresno uneta naredba");
        }
        if ( defaultVolume < 0){
            defaultVolume = 0;
        } else if ( defaultVolume > 100){
            defaultVolume = 100;
        }

        System.out.print("Unesi akciju 3: ");
        String volumeAction3 = s.next();

        if ( volumeAction3.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction3.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction3.equals(volumeMute)){
            defaultVolume = 0;
        } else {
            System.out.println("Pogresno uneta naredba");
        }
        if ( defaultVolume < 0){
            defaultVolume = 0;
        } else if ( defaultVolume > 100){
            defaultVolume = 100;
        }

        System.out.print("Unesi akciju 4: ");
        String volumeAction4 = s.next();

        if ( volumeAction4.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction4.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction4.equals(volumeMute)){
            defaultVolume = 0;
        } else {
            System.out.println("Pogresno uneta naredba");
        }
        if ( defaultVolume < 0){
            defaultVolume = 0;
        } else if ( defaultVolume > 100){
            defaultVolume = 100;
        }

        System.out.print("Unesi akciju 5: ");
        String volumeAction5 = s.next();

        if ( volumeAction5.equals(volumeUp)){
            defaultVolume = defaultVolume + 10;
        } else if (volumeAction5.equals(volumeDown)) {
            defaultVolume = defaultVolume - 10;
        } else if ( volumeAction5.equals(volumeMute)){
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

//11.	 Zadatak (za vezbanje)
//        Napisati program koji simulira ponasanje kontrole za zvuk na jutjubu..
//        Kada se ucita video difoltna jacina zvuka je 75.
//        Korisnik unosi 5 akcija. Jednu od sledecih:
//        ●	pojacaj - pojacava zvuka za 10
//        ●	smanji - smanjuje zvuk za 10.
//        ●	mute - postavlja zvuk na 0.
//        Na kraju programa odstampati jacinu zvuka.
//        NAPOMENA: Jacina zvuka nikad ne moze da ode iznad 100 niti da padne ispod 0.
