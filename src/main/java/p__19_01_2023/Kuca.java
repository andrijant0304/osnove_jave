package p__19_01_2023;

public class Kuca extends Objekat{

    private int brojClanova;

//    constructors
     public Kuca(String adresa, double povrsinaObjekta, int zona, int brojClanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojClanova = brojClanova;
    }

    //        getters and setters
    public int getBrojClanova() {
        return brojClanova;
    }

    public void setBrojClanova(int brojClanova) {
        this.brojClanova = brojClanova;
    }

    //    METHODS
    @Override
    public double porezObjekta() {
        return koeficijent() * this.povrsinaObjekta;
    }

    @Override
    public void stampa() {
        System.out.println("Kuca: ");
        System.out.println("Adresa: " + this.adresa +
                ", povrsina: " + this.povrsinaObjekta +
                "m2, zona: " + this.zona +
                ", broj clanova: " +this.brojClanova);
        System.out.println("Porez: " + this.porezObjekta() + " dinara");
        System.out.println();
    }
}
