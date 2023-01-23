package JavaKlaseTest;
public class InstagramUser {
    private String username;
    private String imeIPrezime;

//constructors

    public InstagramUser(String username) {
        this.username = username;
    }

    public InstagramUser(String username, String imeIPrezime) {
        this.username = username;
        this.imeIPrezime = imeIPrezime;
    }
    //    getters and setters

    public String getUsername() {
        return username;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
//    METHODS
    public void stampajUsera(){
        System.out.println("@" + this.username +" \\t " + this.imeIPrezime);
    }
    public String generisiLink(){
        return "https://www.instagram.com/" + this.username + "/";
    }
}

//constructors
//    getters and setters
//    METHODS