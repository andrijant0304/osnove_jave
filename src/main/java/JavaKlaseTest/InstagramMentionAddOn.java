package JavaKlaseTest;

public class InstagramMentionAddOn extends InstagramAddOn {

    private InstagramUser tagovan;
//constructors


    public InstagramMentionAddOn(int idAddOn, int x, int y, int sirina, int visina, InstagramUser tagovan) {
        super(idAddOn, x, y, sirina, visina);
        this.tagovan = tagovan;
    }
//getters and setters

    public InstagramUser getTagovan() {
        return tagovan;
    }

    public void setTagovan(InstagramUser tagovan) {
        this.tagovan = tagovan;
    }

    //    METHODS
    @Override
    public int minimalnaSirina() {
        return 80;
    }

    @Override
    public int minimalnaVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("[" + this.x + ", " + this.y + " " +
                "(" + this.visina + ", " + this.sirina + ") @"
                +  this.tagovan + this.tagovan.generisiLink());
    }
}
