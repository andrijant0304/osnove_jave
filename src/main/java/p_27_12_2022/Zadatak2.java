package p_27_12_2022;

public class Zadatak2 {

    public static void main(String[] args) {

        SlackMessage message1 = new SlackMessage();
        message1.firstName = "Andrija Antic";
        message1.lastName = "Antic";
        message1.text = "Hello!";
        message1.createdAt = "26.08.2021 18:55";

        message1.print();

        SlackMessage message2 = new SlackMessage();
        message2.firstName = "Nikola";
        message2.lastName = "Nikolic";
        message2.text = "Cao! :)";
        message2.createdAt = "26.08.2021 19:05";

        message2.print();

//        System.out.println(message1.fullName + " - " + message1.dateAndTime);
//        System.out.println(message1.text);
//
//        System.out.println(message2.fullName + " - " + message2.dateAndTime);
//        System.out.println(message2.text);

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
