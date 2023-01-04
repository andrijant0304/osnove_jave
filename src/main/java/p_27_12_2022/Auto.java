package p_27_12_2022;

public class Auto {

    public  String vozac;
    public  String marka;
    public  int brojVrata;
    public  int potrosnja;
    public  int trenutnaBrzina;
    public int ogranicenje;
    public int godinaProizvodnje;
    public int mesecRegistracije;
    public int trenutniMesec;
    public int kubikaza;
    public int cenaRegistracije;



    public  void stampa(){
        System.out.println(this.vozac + "\n" +
                            this.marka + " - " + brojVrata + "-ro vrata \n" +
                            "Sa potrosnjom od " + potrosnja + " l na 100km \n" +
                            trenutnaBrzina + " km/h je trenutna brzina.");
        System.out.println();
    }

    public boolean prekoracenje(int ogranicenje){
        if (trenutnaBrzina > ogranicenje){
            return true;
        }
        return  false;
    }

    public int kazna(int trenutnaBrzina, int ogranicenje) {
        if (trenutnaBrzina > ogranicenje) {
            int kazna = (trenutnaBrzina - ogranicenje) * 1000;
            return kazna;
        } else {
            return  0;
        }

    }

    public  boolean oldtimer(int godinaProizvodnje){
        if (godinaProizvodnje < 1950){
            return true;
        }
        return false;
    }

    public  boolean registracija(int mesecRegistracije, int trenutniMesec){
        if (trenutniMesec < mesecRegistracije){
            return true;
        }
        return false;
    }

    public  int izracunajCenuRegistracije(int kubikaza){
        if(kubikaza <= 2000 ){
            int cenaRegistracije = kubikaza * 100;
            return cenaRegistracije;
        } else {
            return  cenaRegistracije = kubikaza * 130;

        }
    }
}

//●	metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//        ●	metodu koja vraca da li je istekla registracije.
//        Metoda kao parametar prima trenutni mesec i na osnovu toga vraca true ili false.
//        ●	metodu koja racuna i vraca cenu registracije za auto.
//        Za automobile do 2000 kubika cena registracije kubikaza * 100din,
//        za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
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
//        Za automobile do 2000 kubika cena registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.
//
