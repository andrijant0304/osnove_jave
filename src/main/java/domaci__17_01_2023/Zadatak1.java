package domaci__17_01_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        VideoPlayer video = new VideoPlayer(12, 10, 99, 144);

        TimeControl time1 = new TimeControl(video, true);
        TimeControl time2 = new TimeControl(video, false);

        AudioControl audio1 = new AudioControl(video, true);
        AudioControl audio2 = new AudioControl(video, false);

        QualityOptimizerControl quality1 = new QualityOptimizerControl(video, 50);
        QualityOptimizerControl quality2 = new QualityOptimizerControl(video, 100);

        video.stampaj();

        time1.izvrsiAkciju(video);
        audio1.izvrsiAkciju(video);
        quality1.izvrsiAkciju(video);

        video.stampaj();

        time2.izvrsiAkciju(video);
        time2.izvrsiAkciju(video);
        audio2.izvrsiAkciju(video);
        audio2.izvrsiAkciju(video);
        audio2.izvrsiAkciju(video);
        quality2.izvrsiAkciju(video);

        video.stampaj();


        time1.izvrsiAkciju(video);
        audio1.izvrsiAkciju(video);
        audio1.izvrsiAkciju(video);
        audio1.izvrsiAkciju(video);
        audio1.izvrsiAkciju(video);
        quality1.izvrsiAkciju(video);

        video.stampaj();

    }

}

// Zadatak
//Kreirati klasu VideoPlayer koja ima:
//duzinu videa
//trenutno vreme videa
//jacinu zvuka
//Kvalitet videa (144, 240, 360, 480, 720, 1080)
//gettere, settere i konstruktore
//metodu stampaj koja stampa podatke u formatu:
//trenutno vreme videa
//jacina zvuka
//kavlitet videa
//
//Kreirati apstraktnu klasu Control koja ima:
//abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
//
//Kreirati klasu TimeControl koja nasledjuje klasu Control i
//konstruktore
//ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//implementira metodu izvrsi akciju tako sto pomeri trenutno
// vreme videa za 15s unapred ili unazad u zavisnosti od atributa.
// Veoma je bitno da se ne izadje van granica videa.
//
//Kreirati klasu AudioControl koja nasledjuje klasu Control i
//gettere, settere i konstruktore
//ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1.
// U opsegu od 0 do 100
//
//Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//gettere, settere i konstruktore
//implementira metodu izvrsi akciju tako sto postavlja kvalitet videa
// u zavisnosti od brzine interneta.

// Kvalitet se racuna na osnovu formule:
//brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//npr: ako je brzina interneta 20 * 10.1 = 204 => postavlja 240
//npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720
//
//U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
