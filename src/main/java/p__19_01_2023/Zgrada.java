package p__19_01_2023;

public class Zgrada extends Objekat {

    private int brojStanova;

//    constructors
    public Zgrada(String adresa, double povrsinaObjekta, int zona, int brojStanova) {
        super(adresa, povrsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    //    getters and setters
    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

//    METHODS
    @Override
    public double porezObjekta() {
        return koeficijent() * this.brojStanova * this.brojStanova;
    }

    @Override
    public void stampa() {
        System.out.println("Zgrada: ");
        System.out.println("Adresa: " + this.adresa +
                ", povrsina: " + this.povrsinaObjekta +
                "m2, zona: " + this.zona +
                ", broj stanova: " +this.brojStanova);
        System.out.println("Porez: " + this.porezObjekta() + " dinara");
        System.out.println();
    }
}
