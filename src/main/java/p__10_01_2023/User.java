package p__10_01_2023;

public class User {

    private String ime;
    private String prezime;
    private  String email;

    public User() {

    }

    public User(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }
    public User(String ime, String prezime, String  email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
