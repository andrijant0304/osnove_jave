package domaci__19_01_2023;

public class SuperKartica {

    private String broj;
    private String kupac;
    private int popust = 200;

//    constructors
    public SuperKartica(){
    }

    public SuperKartica(String broj, String kupac, int popust) {
        this.broj = broj;
        this.kupac = kupac;
        this.popust = popust;
    }

//    getters and setters

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    public String getPunoIme() {
        return kupac;
    }

    public void setPunoIme(String kupac) {
        this.kupac = kupac;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

//    METHODS
    public void stampajSK(){
        System.out.println("Super Kartica: " + this.broj + ", " + this.kupac);
    }
}
