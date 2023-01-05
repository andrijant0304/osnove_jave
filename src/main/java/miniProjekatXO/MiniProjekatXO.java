package miniProjekatXO;

import java.util.ArrayList;
import java.util.Scanner;

public class MiniProjekatXO {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        XOTabla igra = new XOTabla();


        System.out.print("Unesite ime igraca X: ");
        igra.setImeX(s.next());

        System.out.print("Unesite ime igraca O: ");
        igra.setImeO(s.next());

        igra.pokreniIgru();
        igra.stampaj();

        System.out.print("Odigraj potez: ");
        igra.setPotez(s.nextInt());
        igra.odigrajPotez();
        System.out.println();
        igra.zameniIgraca();


        while(igra.popunjenaTabla() != true && igra.pobednikX() != true && igra.pobednikO() != true){

            igra.stampaj();
            System.out.print("Odigraj potez: ");
            igra.setPotez(s.nextInt());

            if(igra.poljePrazno() == false){
                System.out.println("\n * Potez nije validan! *");
            } else {
                igra.odigrajPotez();
                System.out.println();
                igra.zameniIgraca();
            }
        }

        igra.stampaj();

        if(igra.pobednikX() == true){
            System.out.println("***Cestitamo! Pobednik je " + igra.getImeX() + "!!!***");
        }
        if(igra.pobednikO() == true){
            System.out.println("***Cestitamo! Pobednik je " + igra.getImeO() + "!!!***");
        }
        if(igra.popunjenaTabla() == true){
            System.out.println("Igra je neresena.");
        }
    }
}

//XO - Mini Projekat
//
//
//
//Kreirati klasu XOTabla koja ima:
//●	Od privatnih atributa:
//○	polje1
//○	polje2
//○	polje3
//○	polje4
//○	polje5
//○	polje6
//○	polje7
//○	polje8
//○	polje9
//○	ime X igraca
//○	ime O igraca
//○	naPotezu - atribut koji sluzi da odredi da li je X ili O na potezu. Atribut moze da cuva samo vrednosti X ili O.
//●	Atributi koji predstavljaju polja mogu da imaju samo jednu od sledecih vrednosti: X, O ili razmak. Polje je prazno ako je u njemu razmak.
//●	Od getera i setera :
//○	geter za ime i prezime X igraca
//○	geter za ime i prezime O igraca
//○	geter za igraSledeci
//○	seter za ime i prezime X igraca
//○	setter za ime i prezime O igraca
//●	Od javnih metoda:
//○	pokreniIgru - metoda nema dodatnih parametara. Metoda sluzi da podesi stanje pre pocetka igre. Stanje na pocetku igre treba da bude:
//■	sva polja su prazna
//■	na potezu je igrac X
//○	stampaj - metoda stampa stanje igre kao u primeru:
//
//○	poljePrazno - metoda kao parametar prima broj polja (indeks polja) i vraca da li je polje slobodno. Polje je slobodno ako se u trazenom polju nalazi razmak.
//■	(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 1 vraca false.
//■	(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 2 vraca true.
//○	zameniIgraca - metoda nema dodatnih parametara. Metoda utice na stanje objekta tako sto menja informaciju ko igra sledeci. Ako je na potezu bio X, metoda postavlja da je sledeci na potezu O i obrnuto.
//○	odigrajPotez - metoda ima samo jedan parametar, parametar je broj polja za koje korisnik hoce da odigra potez. Na trazeno polje se upisuje vrednost igraca koji je na potezu.
//(Za primer sa slike iz metode stampaj) Sledeci na potezu je X i ako se pozove metoda odigrajPotez(9) metoda postavlja se polje9 na X.
//●	popunjenaTabla - metoda vraca da li je tabla popunjena. Tabla je popunjena ukoliko nijedno polje na tabli nije prazno. Metoda vraca true ako jeste popunjena i false ako nije.
//●	pobednikX - metoda koja proverava da li je u igri pobedio igrac X. Pobednik je ukoliko su na tabli 3 X u nizu, po bilo kojoj koloni, redu ili dijagonali. Ako je pobednik X vraca true u suprotnom false.
//●	pobednikO - metoda koja proverava da li je u igri pobedio igrac O. Pobednik je ukoliko su na tabli 3 O u nizu, po bilo kojoj koloni, redu ili dijagonali. Ako je pobednik O vraca true u suprotnom false.
//
//PODSETNIK: Za sva poredjenja stringova koristite metodu equals.
//
//
//U glavnom programu:
//●	Kreira se objekat klase XOTabla
//●	Sa tastature se ucitava igrac X
//●	Postavlja igraca X u objekat
//●	Sa tastature se ucitava igrac O
//●	Postavlja igraca O u objekat
//●	Pokrece se igra
//●	Zatim, sve dok se ne dobije pobednik ili popuni cela tabla
//○	Stampa se tabla
//○	Stampa se koji igrac je na potezu i od njega se trazi da odigra potez
//○	Ako polje nije prazno ispisuje se greska “Potez nije validan”
//○	Ako je polje prazno, odigra se trazeni potez i zameni se igrac
//●	Na kraju programa, ukoliko u igri postoji pobednik stampa se ko je pobedio, ukoliko nemamo pobednika stampa se poruka da je igra neresena.
//
//Primeri izvrsenja programa:
//-	Pobednik X
//-	Pobednik O
//-	Nereseno