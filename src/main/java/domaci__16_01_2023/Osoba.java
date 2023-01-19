package domaci__16_01_2023;

public class Osoba {

    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;

//    constructors
    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

//    getters and setters

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

//    METHODS
    public void stampaj(){
        System.out.println(this.imeIPrezime + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }

}

//Zadatak
//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
//
//Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//-	broj (broj koji igrac nosi)
//-	poziciju koju igra (odbrambeni, napadac, … )
//-	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere za broj, kapiten i poziciju
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//-	godine iskustva
//-	tip trenera (kondicioni, za igru, pomocni, personalni)
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
// na kraju programa ispisati sve igrace i trenere.
// Podatke za igrace i trenere unosi korisnik sa tastature.
