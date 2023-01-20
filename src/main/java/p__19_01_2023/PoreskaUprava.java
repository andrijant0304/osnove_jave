package p__19_01_2023;

import java.util.ArrayList;

public class PoreskaUprava {

    private String grad;

    private ArrayList<Objekat> objekti;

//    constructors
    public PoreskaUprava() {
        super();
        objekti = new ArrayList<>();
    }

    public PoreskaUprava(String grad) {
        this.grad = grad;
        objekti = new ArrayList<>();
    }

    //    METHODS
    public void dodajObjekat(Objekat o){
        objekti.add(o);
    }
//    public Objekat najveciPorez(){
//        for (int i = 0; i < objekti.size(); i++) {
//
//        }
//    }
//
//    public Objekat najmanjiPorez(){
//
//    }


    public void stampajSve(){
        for (int i = 0; i < objekti.size(); i++) {
            System.out.println("Lista objekta: ");
            this.objekti.get(i).stampa();
        }
    }
}
