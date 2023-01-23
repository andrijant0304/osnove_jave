package domaci__10_01_2023;

public class Vaga {

    private String mernaJed;
    private ProizvodV proizvod;

//constructors

    public Vaga() {
    }

//getters and setters

    public String getMernaJed() {
        return mernaJed;
    }

    public void setMernaJed(String mernaJed) {
        this.mernaJed = mernaJed;
    }

    public ProizvodV getProizvod() {
        return proizvod;
    }

    public void setProizvod(ProizvodV proizvod) {
        this.proizvod = proizvod;
    }

//METHODS
    public double sracunajCenu(double tezina){
        if(this.mernaJed.equals("kg"))
            return this.proizvod.getCenaKg() * tezina;
        if(this.mernaJed.equals("lb"))
            return this.proizvod.getCenaLb() * tezina;
        return 0;
    }

    public void stampajRacun(){
        this.proizvod.stampa();
            if (this.mernaJed.equals("kg")){
                System.out.println("Cena: " + this.proizvod.getCenaKg() + " za " + this.mernaJed);
                System.out.println("Ukupno: ");
            } else if(this.mernaJed.equals("lb")){
                System.out.println("Cena: " + this.proizvod.getCenaLb() + " za " + this.mernaJed);
                System.out.println("Ukupno: ");
            } else {
                System.out.println("Pogresno uneta merna jedinica!");
            }
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
//-	metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena.
//-	metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
//   Ukupno: (ukupna cena)
