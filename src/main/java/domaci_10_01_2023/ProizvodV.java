package domaci_10_01_2023;

public class ProizvodV {

    private int sifra;
    private String naziv;
    private int cenaPoKg;

//constructors
    public ProizvodV(int sifra, String naziv, int cenaPoKg) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKg = cenaPoKg;
    }

//getters and setters

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaPoKg(int cenaPoKg) {
        this.cenaPoKg = cenaPoKg;
    }

    public int getCenaPoKg() {
        return cenaPoKg;
    }
    //METHODS
    public double getCenaKg() {
        return this.cenaPoKg;
    }
    public double getCenaLb() {
        return this.cenaPoKg * 2.2046;
    }
    public void stampa(){

        System.out.println("Sifra: " + this.sifra + " - Naziv: " + this.naziv);
    }
}

//3. (Za vezbanje) Kreirati klasu Proizvod koja ima:
//-	sifru proizvoda
//-	naziv proizvoda
//-	cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//-	konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//-	gettere i settere za sifru i naziv
//-	setter za cenu po kilogramu
//-	metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//-	metodu getCenaLb koja vraca cenu za 1lb prozvoda
// 		konverzija: 1 kg = 2.2046 lb
//-	metodu koja stampa proizvod u formatu:
//(sifra) - (naziv)
//
//	Kreirati klasu Vaga koja ima:
//-	merna jedinica (kg ili lb)
//-	proizvod (proizvod koji se meri)
//-	TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//-	default-ni konstuktor
//-	getteri i setteri za sve atribute
//-	metodu sracunajCenu koja vraca cenu proizvoda
// za unetu tezinu (tezina je parametar funkcije).
// Na racunanje cene utice i merna jedinica
// na koju je vaga podesena.
//-	metodu stampaj koja stampa racun u formatu.
// POMOC: trebace vam tezina kao parametar u ovoj metodi
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica)
//   x (tezina)
//   Ukupno: (ukupna cena)