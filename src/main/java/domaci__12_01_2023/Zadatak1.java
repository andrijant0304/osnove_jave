package domaci__12_01_2023;

import java.util.ArrayList;

public class Zadatak1 {

    public static void main(String[] args) {

        ArrayList<ZeleniKarton> ispit = new ArrayList<ZeleniKarton>();

        ispit.add(new ZeleniKarton("Student1", "123456", "Predmet2", 10, "Profesor1"));
        ispit.add(new ZeleniKarton("Student2", "123458", "Predmet5", 5, "Profesor2"));
        ispit.add(new ZeleniKarton("Student3", "123459", "Predmet6", 7, "Profesor3"));
        ispit.add(new ZeleniKarton("Student4", "123410", "Predmet5", 8, "Profesor2"));
        ispit.add(new ZeleniKarton("Student5", "123412", "Predmet7", 10, "Profesor6"));
        ispit.add(new ZeleniKarton("Student6", "123416", "Predmet3", 8, "Profesor4"));
        ispit.add(new ZeleniKarton("Student7", "123418", "Predmet1", 6, "Profesor5"));
        ispit.add(new ZeleniKarton("Student8", "123420", "Predmet8", 5, "Profesor2"));
        ispit.add(new ZeleniKarton("Student9", "123422", "Predmet2", 6, "Profesor1"));
        ispit.add(new ZeleniKarton("Student10", "123256", "Predmet4", 9, "Profesor2"));

        for (int i = 0; i < ispit.size(); i++) {
            ispit.get(i).stampaj();
        }

        int zbirOcena = 0;
        for (int i = 0; i < ispit.size(); i++) {
            int ocena = ispit.get(i).getOcena();
            zbirOcena = zbirOcena + ocena;
        }

        int zbirProlaznihOcena = 0;
        int counter = 0;
        for (int i = 0; i < ispit.size(); i++) {
            int ocena = ispit.get(i).getOcena();
            if(ispit.get(i).getOcena() > 5){
                zbirProlaznihOcena = zbirProlaznihOcena + ocena;
                counter++;
            }
        }

        System.out.println("Zbir ocena je: " + zbirOcena);
        System.out.println("Prosecna ocena je: " + zbirOcena/ ispit.size());
        System.out.println("Zbir prolaznih ocena je: " + zbirProlaznihOcena);
        System.out.println("Prosecna prolazna ocena je: " + zbirProlaznihOcena/counter);

    }
}
//1.	Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//●	ime i prezime studenta
//●	broj indeksa
//●	naziv predmeta
//●	ime i prezime profesora
//●	ocenu - od 5 do 10
//●	gettere i settere
//●	konstruktore
//●	metodu koja vraca da li je ispit polozen ili ne
// (ispit je polozen ako je ocena veca od 5)
//●	metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//●	kreirati niz od 10tak zelenih kartona za ispite i
// odstampati podatke za sve ispite

//●	(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite

//(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz
// polozenih ispita
