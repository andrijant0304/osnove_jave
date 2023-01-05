package domaci_29_12_2022;

public class Product {

    private String name;
    private double price;
    private double weight;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void printData() {
        System.out.println("Artikal: {{" + this.name + "}}, " + "cena: {{" + this.price + "}}, " + "Tezina: {{" + this.weight + "}} gr.");
    }

    public void priceUp(double priceincrease){
        this.price = this.price + priceincrease;
    }

    public double priceDiscount(double discount){
        if (discount > 0 && discount <= 100){
            double discountPrice = this.price - (this.price * (discount / 100));
            return discountPrice;
        } else {
            return this.price;
        }
    }

    public int shippingFee(){
        if(this.weight <= 100){
            return  200;
        } else if (this.weight <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }

//    racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        -	za tezinu do 100g, postarina iznosi 200din
//        -	za tezinu od 101g do 500g, postarina iznosi 400din
//        -	za tezinu preko 500g, postarina iznosi 1000din
}

//1.	Napisati klasu Proizvod koja ima atribute
//        a.	naziv proizvoda (String)
//        b.	cenu proizvoda (double)
//        c.	težinu proizvoda u gramima. (double)
//        i metode:
//        d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//        Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//        f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//        a povratnu vrednost je cena proizvoda kada se uračuna popust.
//        Ova funkcije ne menja atribut cena.
//        Smatrati da je parametar popust u opsegu od 0 do 100.
//        g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        -	za tezinu do 100g, postarina iznosi 200din
//        -	za tezinu od 101g do 500g, postarina iznosi 400din
//        -	za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
//
