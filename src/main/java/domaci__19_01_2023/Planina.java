package domaci__19_01_2023;

public class Planina {

    private String ime;
    private String drzava;
    private int visina;

//    constructors

    public Planina() {
    }

    public Planina(String ime, String drzava, int visina) {
        this.ime = ime;
        this.drzava = drzava;
        this.visina = visina;
    }

//    getters and setters

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getVisina() {
        return visina;
    }

    public void setVisina(int visina) {
        this.visina = visina;
    }

//    METHODS

}
