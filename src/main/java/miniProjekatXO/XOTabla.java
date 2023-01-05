package miniProjekatXO;

import java.util.ArrayList;

public class XOTabla {

    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeX;
    private String imeO;
    private String naPotezu;
//    private int brojPolja;
    private int potez;

    private ArrayList<String> tabla = new ArrayList<>();

    public String getImeX() {
        return imeX;
    }
    public void setImeX(String imeX) {
        this.imeX = imeX;
    }

    public String getImeO() {
        return imeO;
    }
    public void setImeO(String imeO) {
        this.imeO = imeO;
    }

    public String getNaPotezu() {
        return naPotezu;
    }

//    public void setBrojPolja(int brojPolja){
//        this.brojPolja = brojPolja;
//    }
//    public int getBrojPolja() {
//        return brojPolja;
//    }
//
//    public int getPotez() {
//        return potez;
//    }

    public void setPotez(int potez) {
        this.potez = potez;
    }

    public void pokreniIgru(){
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";
        tabla.add(this.polje1);
        tabla.add(this.polje2);
        tabla.add(this.polje3);
        tabla.add(this.polje4);
        tabla.add(this.polje5);
        tabla.add(this.polje6);
        tabla.add(this.polje7);
        tabla.add(this.polje8);
        tabla.add(this.polje9);

        this.naPotezu = "X";
    }

    public void stampaj(){
        System.out.println(this.polje1 + " | " + this.polje2 + " | " + this.polje3 + "\n" +
                           this.polje4 + " | " + this.polje5 + " | " + this.polje6 + "\n" +
                           this.polje7 + " | " + this.polje8 + " | " + this.polje9 + "\n" +
                            "Igrac X: " + this.imeX + "\n" +
                            "Igrac O: " + this.imeO + "\n" +
                            "Na potezu je igrac " + this.naPotezu );
    }

    public boolean poljePrazno(){
       if(tabla.get(potez-1).equals(" ")){
            return true;
        } return false;
    }

    public void zameniIgraca(){
        if(this.naPotezu.equals("X")){
            this.naPotezu = "O";
        } else{
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(){

        if(potez == 1){
            this.polje1 = getNaPotezu();
            tabla.set(0, getNaPotezu());
        }
        if(potez == 2){
            this.polje2 = getNaPotezu();
            tabla.set(1, getNaPotezu());
        }
        if(potez == 3){
            this.polje3 = getNaPotezu();
            tabla.set(2, getNaPotezu());
        }
        if(potez == 4){
            this.polje4 = getNaPotezu();
            tabla.set(3, getNaPotezu());
        }
        if(potez == 5){
            this.polje5 = getNaPotezu();
            tabla.set(4, getNaPotezu());
        }
        if(potez == 6){
            this.polje6 = getNaPotezu();
            tabla.set(5, getNaPotezu());
        }
        if(potez == 7){
            this.polje7 = getNaPotezu();
            tabla.set(6, getNaPotezu());
        }
        if(potez == 8){
            this.polje8 = getNaPotezu();
            tabla.set(7, getNaPotezu());
        }
        if(potez == 9){
            this.polje9 = getNaPotezu();
            tabla.set(8, getNaPotezu());
        }

    }

    public boolean popunjenaTabla(){
        for (int i = 0; i < tabla.size()-1; i++) {
            tabla.get(i).equals(" ");
            return false;
        }
        return true;
    }

    public boolean pobednikX(){
        if(tabla.get(0).equals("X") && tabla.get(1).equals("X") && tabla.get(2).equals("X") ||
           tabla.get(3).equals("X") && tabla.get(4).equals("X") && tabla.get(5).equals("X") ||
           tabla.get(6).equals("X") && tabla.get(7).equals("X") && tabla.get(8).equals("X") ||
           tabla.get(0).equals("X") && tabla.get(3).equals("X") && tabla.get(6).equals("X") ||
           tabla.get(1).equals("X") && tabla.get(4).equals("X") && tabla.get(7).equals("X") ||
           tabla.get(2).equals("X") && tabla.get(5).equals("X") && tabla.get(8).equals("X") ||
           tabla.get(0).equals("X") && tabla.get(4).equals("X") && tabla.get(8).equals("X") ||
           tabla.get(2).equals("X") && tabla.get(4).equals("X") && tabla.get(6).equals("X")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pobednikO(){
        if(tabla.get(0).equals("O") && tabla.get(1).equals("O") && tabla.get(2).equals("O") ||
                tabla.get(3).equals("O") && tabla.get(4).equals("O") && tabla.get(5).equals("O") ||
                tabla.get(6).equals("O") && tabla.get(7).equals("O") && tabla.get(8).equals("O") ||
                tabla.get(0).equals("O") && tabla.get(3).equals("O") && tabla.get(6).equals("O") ||
                tabla.get(1).equals("O") && tabla.get(4).equals("O") && tabla.get(7).equals("O") ||
                tabla.get(2).equals("O") && tabla.get(5).equals("O") && tabla.get(8).equals("O") ||
                tabla.get(0).equals("O") && tabla.get(4).equals("O") && tabla.get(8).equals("O") ||
                tabla.get(2).equals("O") && tabla.get(4).equals("O") && tabla.get(6).equals("O")) {
            return true;
        } else {
            return false;
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
//○	poljePrazno - metoda kao parametar prima broj polja (indeks polja) i vraca da li je polje slobodno.
// Polje je slobodno ako se u trazenom polju nalazi razmak.
//■	(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 1 vraca false.
//■	(Za primer sa slike iz metode stampaj) Ako se pozove metoda za broj polja 2 vraca true.
//○	zameniIgraca - metoda nema dodatnih parametara. Metoda utice na stanje objekta tako sto menja informaciju
// ko igra sledeci.
// Ako je na potezu bio X, metoda postavlja da je sledeci na potezu O i obrnuto.
//○	odigrajPotez - metoda ima samo jedan parametar, parametar je broj polja za koje korisnik hoce da odigra potez.
// Na trazeno polje se upisuje vrednost igraca koji je na potezu.
//(Za primer sa slike iz metode stampaj) Sledeci na potezu je X i ako se pozove metoda odigrajPotez(9)
// metoda postavlja se polje9 na X.
//●	popunjenaTabla - metoda vraca da li je tabla popunjena.
// Tabla je popunjena ukoliko nijedno polje na tabli nije prazno. Metoda vraca true ako jeste popunjena i false ako nije.
//●	pobednikX - metoda koja proverava da li je u igri pobedio igrac X.
// Pobednik je ukoliko su na tabli 3 X u nizu, po bilo kojoj koloni,
// redu ili dijagonali. Ako je pobednik X vraca true u suprotnom false.
//●	pobednikO - metoda koja proverava da li je u igri pobedio igrac O.
// Pobednik je ukoliko su na tabli 3 O u nizu, po bilo kojoj koloni,
// redu ili dijagonali. Ako je pobednik O vraca true u suprotnom false.
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
//●	Na kraju programa, ukoliko u igri postoji pobednik stampa se ko je pobedio,
// ukoliko nemamo pobednika stampa se poruka da je igra neresena.
//
//Primeri izvrsenja programa:
//-	Pobednik X
//-	Pobednik O
//-	Nereseno