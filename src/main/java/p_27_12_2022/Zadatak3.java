package p_27_12_2022;

public class Zadatak3 {

    public static void main(String[] args) {

        Auto bmw = new Auto();
        bmw.vozac = "Andrija Antic";
        bmw.marka = "BMW";
        bmw.brojVrata = 4;
        bmw.potrosnja = 10;
        bmw.trenutnaBrzina = 200;
        bmw.ogranicenje = 130;
        bmw.godinaProizvodnje = 1998;
        bmw.mesecRegistracije = 11;
        bmw.trenutniMesec = 10;
        bmw.kubikaza = 2000;

        bmw.stampa();
//        bmw.kazna(bmw.trenutnaBrzina, bmw.ogranicenje);
//        bmw.oldtimer(bmw.godinaProizvodnje);
//        bmw.registracija(bmw.mesecRegistracije, bmw.trenutniMesec);
//        bmw.izracunajCenuRegistracije(bmw.kubikaza);



        if(bmw.prekoracenje(bmw.ogranicenje)){
            System.out.println("Brzina je prekoracena!");
            System.out.println("Kazna je: " + bmw.kazna(bmw.trenutnaBrzina, bmw.ogranicenje) + " dinara.");
        }else{
            System.out.println("Brzina nije prekoracena.");
        }


        if(bmw.oldtimer(bmw.godinaProizvodnje)){
            System.out.println("Auto je oldtimer.");
        } else {
            System.out.println("Auto nije oldtimer.");
        }

        if (bmw.registracija(bmw.mesecRegistracije, bmw.trenutniMesec)){
            System.out.println("Auto je registrovan.");
        } else {
            System.out.println("Registacija je istekla!");
        }

        System.out.println("Cena registracije je: " + bmw.izracunajCenuRegistracije(bmw.kubikaza));
    }
}

//Zadatak
//        Kreirati klasu Auto koja ima:
//        ●	ime i prezime vozaca
//        ●	marku automobila
//        ●	broj vrata
//        ●	potrosnju na 100km (npr: 10)
//        ●	trenutnu brzinu kojom se auto krece
//        ●	metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//        [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina.
//
//        Primer:
//        Milan Jovanovic
//        BMW - 5-ro vrata
//        Sa potrosnjom od 10 l na 100km
//        200 km/h je trenutna brzina
//
//
//        (Dopuna)
//        U okviru klase Auto, implementirati jos 2 metode:
//        ●	metoda koja vraca informaciju da li je vozac prekoracio brzinu.
//        Kao parametar metode se prima ogranicenje (kao broj) a metoda vraca true ili false
//        ako je trenutna brzina veca od ogranicenja.
//        ●	metoda koja vraca visinu novcane kazne za prekoracenje, za svaku jedinicu prekoracenja placa se 1000din.
//        Metoda od parametara prima ogranicenje brzine
//        U glavnom programu pozvati ove metode i odstmpajte neke poruke na osnovu informacija koje dobijete od njih.
//
//        (Dopuna 2)
//        Dopuniti klasu Auto tako da ima:
//        ●	atribut godinu proizvodnje
//        ●	atribut mesec do kad je registrovan auto (int)
//        ●	atribut kubikaza auta (npr: 1600 - 5000)
//        ●	metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//        ●	metodu koja vraca da li je istekla registracije.
//        Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//        ●	metodu koja racuna i vraca cenu registracije za auto.
//        Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//        za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
