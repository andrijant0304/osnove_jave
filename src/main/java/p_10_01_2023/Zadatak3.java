package p_10_01_2023;

public class Zadatak3 {

    public static void main(String[] args) {

        Film f = new Film("Blabla", 2025);
        Reziser r = new Reziser("John Smith",
                2000);


        r.setReziraoJe(f);

        f.stampaj();
        System.out.println();
        r.stampaj();
    }
}

//.Zadatak
//Kreirati klasu Film koja ima:
//naziv filma
//iz koje godine je film
//konstruktore, gettere i settere
//metodu print koja stampa podatke u formatu
//naziv filma, godina
//
//
//Kreirati klasu Reziser koja ima:
//ime i prezime rezisera
//starost
//konstruktore, gettere i settere koji su potrebni
//metodu print koja stampa podatke u formatu
//ime prezime, starost.god
//
//U main metodi, kreirati jedan film i jednog rezisera i pozvati svaku od metoda