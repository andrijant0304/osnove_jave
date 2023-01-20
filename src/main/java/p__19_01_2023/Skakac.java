package p__19_01_2023;

public class Skakac extends Atleticar{

//    constructors
    public Skakac() {
    }

    public Skakac(String imeIprezime, double rezultat) {
        super(imeIprezime, rezultat);
    }

    //    METHODS
    @Override
    public boolean daLiJeBolji(Atleticar a) {
        if(this.rezultat > a.rezultat){
            return  true;
        } else {
            return  false;
        }
    }
}
