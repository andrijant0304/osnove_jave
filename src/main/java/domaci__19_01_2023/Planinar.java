package domaci__19_01_2023;

public abstract class Planinar {

    protected int idBroj;
    protected String punoIme;

//    constructors

    public Planinar(int idBroj, String punoIme) {
        this.idBroj = idBroj;
        this.punoIme = punoIme;
    }

//    getters and setters

    public int getIdBroj() {
        return idBroj;
    }

    public String getPunoIme() {
        return punoIme;
    }

//    METHODS
    public abstract void stampaj();
    public abstract int clanarina();
    public abstract boolean uspesanUspon(Planina planina);
}
