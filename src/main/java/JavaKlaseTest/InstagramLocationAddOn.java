package JavaKlaseTest;

public class InstagramLocationAddOn extends InstagramAddOn{
    private String lokacija;

//constructors
    public InstagramLocationAddOn(int idAddOn, int x, int y, int sirina, int visina, String lokacija) {
        super(idAddOn, x, y, sirina, visina);
        this.lokacija = lokacija;
    }

//    getters and setters
    public String getLokacija() {
        return lokacija;
    }

    public void setLokacija(String lokacija) {
        this.lokacija = lokacija;
    }


//    METHODS
    @Override
    public int minimalnaSirina() {
        return 100;
    }

    @Override
    public int minimalnaVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.x + ", " + this.y + " " +
                        "(" + this.visina + ", " + this.sirina + ")"
                            + " L " + this.lokacija);
    }


}
