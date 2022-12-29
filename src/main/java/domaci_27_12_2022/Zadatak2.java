package domaci_27_12_2022;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite spoljnu temperaturu: ");
        int outsideTemp = s.nextInt();

        SmartAirConditioning inverter = new SmartAirConditioning();
        inverter.brand = "Samsung";
        inverter.airConTemp = 22;
        inverter.modeHeat = "greje";
        inverter.modeCool = "hladi";



        SmartAirConditioning standard = new SmartAirConditioning();
        standard.brand = "LG";
        standard.airConTemp = 25;
        standard.modeHeat = "greje";
        standard.modeCool = "hladi";

    }






}

//2.	Kreirati klasu SmartAirConditioning koja ima:
//        ●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//        ●	atribut za izabranu temperaturu
//        ●	atribut za mod (hladi/greje) - string
//        ●	metodu za stampu (proizvoljno)
//        ●	metodu koja vraca informaciju da li je napolju veca temperatura od one na koju je klima postavljena.
//
//        Metoda kao parametar prima temperaturu koja je napolju.
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metode
//

