package domaci_27_12_2022;

public class Product {

    public String name;
    public double price;
    public double weight;

    public void print() {
        System.out.println("{{" + this.name + "}}" + "{{" + this.price + "}}" + "{{" + this.weight + "}}");
        System.out.println();

    }

    public double converter(String unit, double weight){
        if(unit.equals("kg")){
            return (double) (this.weight * 0.0001);
        } else if(unit.equals("t")){
            return (double) (this.weight / 0.0000001);
        } else {
            return 0;
        }
    }


}



//    Napisati klasu Proizvod koja ima atribute
//        ○	naziv proizvoda (String)
//        ○	cenu proizvoda (double)
//        ○	težinu proizvoda u gramima. (double)
//        i metode:
//        ○	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        ○	konvertuj - metoda konvertuje tezinu u kilograme i tone.
//          Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
//          Jedinica moze biti “kg” ili “t”
//
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
