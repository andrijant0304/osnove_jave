package p__19_01_2023;

import java.util.ArrayList;

public class Disciplina {

    private String naziv;
    private String tip;
    private ArrayList<Atleticar> atleticari;
//    private ArrayList<Atleticar> atleticari = new ArrayList<>();

//    constructors
    public Disciplina(){
        super();
        atleticari = new ArrayList<>();
    }

    public Disciplina(String naziv, String tip) {
        this.naziv = naziv;
        this.tip = tip;
        atleticari = new ArrayList<>();
    }

//    getters and setters
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }

    public void setAtleticari(ArrayList<Atleticar> atleticari) {
        this.atleticari = atleticari;
    }

//    METHODS
    public void dodajAtleticara(Atleticar a){
        atleticari.add(a);
    }

    public void diskvalifikujAtleticara(String ime){
        for (int i = 0; i < this.atleticari.size(); i++) {
            if(this.atleticari.get(i).getImeIprezime().equals(ime)){
                this.atleticari.remove(i);
            }
        }
    }

    public Atleticar najboljiJe(){
        Atleticar a = this.atleticari.get(0);
        for (int i = 1; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).daLiJeBolji(a)){
                a = this.atleticari.get(i);
            }
        }
        return  a;
    }

    public  void pobednik(){
        this.najboljiJe().stampa();
    }
}
