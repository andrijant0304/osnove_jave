package JavaKlaseTest;

import java.util.ArrayList;

public class InstagramStory {

    private InstagramUser autorStorija;
    private String swipeUp;
    private String linkSlika;
    private ArrayList<InstagramAddOn> dodaci;
    private ArrayList<InstagramUser> pogledao;

//    constructors

    public InstagramStory() {
        this.dodaci = new ArrayList<>();
        this.pogledao = new ArrayList<>();
    }

    public InstagramStory(InstagramUser autorStorija, String swipeUp, String linkSlika) {
        this.autorStorija = autorStorija;
        this.swipeUp = swipeUp;
        this.linkSlika = linkSlika;
        this.dodaci =  new ArrayList<>();
        this.pogledao =  new ArrayList<>();
    }

//    getters and setters

    public InstagramUser getAutorStorija() {
        return autorStorija;
    }

    public String getSwipeUp() {
        return swipeUp;
    }

    public String getLinkSlika() {
        return linkSlika;
    }

    public ArrayList<InstagramAddOn> getDodaci() {
        return dodaci;
    }

    public ArrayList<InstagramUser> getPogledao() {
        return pogledao;
    }

    public void setSwipeUp(String swipeUp) {
        this.swipeUp = swipeUp;
    }

//    METHODS
    public void dodajDodatak(){

    }
    public void obrisiDodatak(int idUser){

    }
    public boolean daLiJePogledao(int username) {
        boolean daLiJe = true;
        for (int i = 0; i < this.pogledao.size(); i++) {
            if (this.pogledao.get(i).getUsername().equals(username)) {
                daLiJe = true;
            } else {
                daLiJe = false;
            }
        }
            return daLiJe;
    }

    public void pogledajStori(InstagramUser korisnik){
        for (int i = 0; i < this.pogledao.size(); i++) {
            if (!this.pogledao.get(i).getUsername().equals(korisnik.getUsername())){
                this.pogledao.add(korisnik);
            }
        }
    }

    public void postaviStori(){
        this.autorStorija.stampajUsera();
        System.out.println("Story: ");
        System.out.println("Image: " + this.linkSlika);

        System.out.println("<<< swipe up >>>");
        System.out.println(this.swipeUp);

    }

}
