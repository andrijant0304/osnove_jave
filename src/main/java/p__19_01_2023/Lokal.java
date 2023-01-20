package p__19_01_2023;

public class Lokal extends Objekat{

    public Lokal(String adresa, double povrsinaObjekta, int zona) {
        super(adresa, povrsinaObjekta, zona);
    }

    @Override
    public double porezObjekta() {
        return koeficijent() * this.povrsinaObjekta * 1.3;
    }

    @Override
    public void stampa() {
        System.out.println("Zgrada: ");
        System.out.println("Adresa: " + this.adresa +
                ", povrsina: " + this.povrsinaObjekta +
                "m2, zona: " + this.zona );
        System.out.println("Porez: " + this.porezObjekta() + " dinara");
        System.out.println();
    }


}
