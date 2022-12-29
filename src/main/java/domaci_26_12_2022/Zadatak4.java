package domaci_26_12_2022;

public class Zadatak4 {

    public static void main(String[] args) {

        String jmbg = "20009807000005";
        String firstName = "Andrija";
        String lastName = "Antic";
        String birthYear = "1980";
        boolean active = true;

        printData(jmbg, firstName, lastName, birthYear, active);

    }

    public static void printData(String a, String b, String c, String d, boolean e){
        System.out.println("JMBG: [" + a + "]");
        System.out.println("Ime: [" + b + "]");
        System.out.println("Prezime: [" + c + "]");
        System.out.println("God. rodjenja: [" + d + "]");
        System.out.println("Aktivan: [" + e + "]");
    }
}

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.