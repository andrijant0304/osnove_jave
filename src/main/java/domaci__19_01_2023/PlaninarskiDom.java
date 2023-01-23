package domaci__19_01_2023;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String naziv;
    private int godOsnivanja;
    private ArrayList<Planinar> clanovi;

//    constructors

    public PlaninarskiDom() {
        this.clanovi = new ArrayList<>();
    }

    public PlaninarskiDom(String naziv, int godOsnivanja) {
        this.naziv = naziv;
        this.godOsnivanja = godOsnivanja;
        this.clanovi = new ArrayList<>();
    }

//    getters and setters

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodOsnivanja() {
        return godOsnivanja;
    }

    public void setGodOsnivanja(int godOsnivanja) {
        this.godOsnivanja = godOsnivanja;
    }

    public ArrayList<Planinar> getClanovi() {
        return clanovi;
    }

    public void setClanovi(ArrayList<Planinar> clanovi) {
        this.clanovi = clanovi;
    }

//    METHODS

    public void uclaniPlaninara(Planinar p){
        this.clanovi.add(p);
    }

    public int uspesniClanovi(Planina planina){
        int uspon = 0;
        for (int i = 0; i < this.clanovi.size(); i++) {
            if(this.clanovi.get(i).uspesanUspon(planina))  uspon++;
        }
        return uspon;
    }

    public void izbaciPlaninara (int id){
        for (int i = 0; i < this.clanovi.size(); i++) {
            if (this.clanovi.get(i).getIdBroj() == id) this.clanovi.remove(i);
        }
    }

    public void stampajDom(){
        System.out.println("Planinarski dom: " + this.naziv + " osnova " + this.godOsnivanja + " godine.");
        System.out.println("Clanovi: ");
        for (int i = 0; i < this.clanovi.size(); i++) {
            this.clanovi.get(i).stampaj();
        }
    }

    public int mesecniPrihod(){
        int prihod = 0;
        for (int i = 0; i < this.clanovi.size(); i++) {
            prihod += this.clanovi.get(i).clanarina();
        }
        return prihod;
    }
}

//●	metodu učlani planinara, koja dodaje planinara u niz
//●	metodu koja vraća broj planinara koji će se uspešno popeti na planinu (metoda za parametar
// prima Planinu za koju se proverava informacija)
//●	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju
//●	metodu koja štampa podatke o domu i o svim članovima doma
//●	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara
