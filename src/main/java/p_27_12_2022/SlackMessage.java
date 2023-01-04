package p_27_12_2022;

public class SlackMessage {

    public String text;
    public String firstName;
    public String lastName;
    public String createdAt;


    public void print(){
        System.out.println(this.text + " - " + this.firstName + " " + this.lastName);
        System.out.println(this.createdAt);
    }

}
//    Kreirati klasu SlackMessage koja ima:
//        tekst poruke
//        ime i prezime osobe koja je stavila poruku
//        datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//        U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//        [ime i prezime osobe] - [kad je poslata]
//        [Tekst poruke]
//
//        Dopuna:
//        Dopunite klasu SlackMessage metodom za stampu koja stampa podatke u formatu
//        koji je naveden iznad i u mainu pozovite metode nad objektima koje ste kreirali.
//