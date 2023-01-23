package domaci__19_01_2023;

public class Alpinista extends Planinar {

    private int poeni;

//  constructors

    public Alpinista(int idBroj, String punoIme, int poeni) {
        super(idBroj, punoIme);
        this.poeni = poeni;
    }

//    getters and setters

    public int getPoeni() {
        return poeni;
    }

    public void setPoeni(int poeni) {
        this.poeni = poeni;
    }

//   METHODS
    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: "+ this.idBroj + ", ime: " + this.punoIme + ". Broj poena: " + this.poeni);
    }

    @Override
    public int clanarina() {
        return 1500 - this.poeni * 50;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisina() < 4000) return true;
        return false;
    }
}
//    Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500
// pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
//Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni)