package JavaKlaseTest;

public abstract class InstagramAddOn {
    protected int idAddOn;
    protected int x;
    protected int y;
    protected int sirina;
    protected int visina;

    //constructors

    public InstagramAddOn(int idAddOn, int x, int y, int sirina, int visina) {
        this.idAddOn = idAddOn;
        this.x = x;
        this.y = y;
        this.sirina = sirina;
        this.visina = visina;
    }
//    getters and setters

    public int getIdAddOn() {
        return idAddOn;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSirina() {
        return sirina;
    }

    public int getVisina() {
        return visina;
    }
//    METHODS
    public abstract int minimalnaSirina();
    public abstract int minimalnaVisina();
    public void povecajDimenzije(int visina, int sirina){
        this.visina += visina;
        this.sirina += sirina;
    }
    public void smanjiDimenzije(int visina, int sirina){
        this.visina -= visina;
        this.sirina -= sirina;
        if (this.visina < this.minimalnaVisina()) this.visina = this.minimalnaVisina();
        if (this.sirina < this.minimalnaSirina()) this.sirina = this.minimalnaSirina();
    }
    public abstract void stampaj();
}
