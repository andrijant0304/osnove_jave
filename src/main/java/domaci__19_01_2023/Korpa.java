package domaci__19_01_2023;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaza;

//    constructors

    public Korpa() {
        this.ambalaza = new ArrayList<>();
    }

//    getters and setters



//    METHODS
    public void dodajAmbalazu(Ambalaza a){
        this.ambalaza.add(a);
    }

    public void izbaciAmbalazu(String barkod){
        for (int i = 0; i < this.ambalaza.size(); i++) {
            if(this.ambalaza.get(i).getBarkod().equals(barkod)){
                this.ambalaza.remove(i);
            }
        }
    }

    private double ambalazaSaPopustom(double popustUProcentima){
        double ukupnaCena = 0;
        for (int i = 0; i < this.ambalaza.size(); i++) {
           ukupnaCena += this.ambalaza.get(i).cena();
        }
        return ukupnaCena * (100 - popustUProcentima)/100;
    }

    public double ukupnaCenaKorpe(SuperKartica superKartica){
        System.out.println();
        double ukupnaCena = 0;
        for (int i = 0; i < this.ambalaza.size(); i++) {
            ukupnaCena += this.ambalaza.get(i).cena();
        }
        return ukupnaCena - superKartica.getPopust();
    }


}
