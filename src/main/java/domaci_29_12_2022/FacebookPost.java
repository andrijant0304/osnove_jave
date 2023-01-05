package domaci_29_12_2022;

public class FacebookPost {

    private String userFullName;
    private String friendFullName;
    private String textPost;
    private int likes;
    private int shares;

    public void setUserFullName(String userFullName){
        this.userFullName = userFullName;
    }
    public String getUserFullName(){
        return userFullName;
    }

    public void setFriendFullName(String friendFullName){
        this.friendFullName = friendFullName;
    }
    public String getFriendFullName(){
        return friendFullName;
    }

    public void setTextPost(String textPost){
        this.textPost = textPost;
    }
    public String getTextPost(){
        return textPost;
    }

    public int getLikes(){
        return likes;
    }

    public int getShares(){
        return shares;
    }

    public void like(){
        this.likes = this.likes + 1;
    }

    public void dislike(){
        this.likes = this.likes - 1;
        if (this.likes < 0){
            this.likes = 0;
        }
    }

    public void share(){
        this.shares = this.shares + 1;
    }

    public void printFacebookPost(){
        System.out.println( this.friendFullName + " >>> " + this.userFullName + "\n" +
                this.textPost + "\n" +
                "Likes " + this.likes + " | Shares " + this.shares + "\n");
    }
}

//Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//-	ime i prezime korisnika koji je objavio post
//-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//-	tekst objave
//-	broj lajkova
//-	broj deljenja
//-	gettere za sve atribute
//-	settere za sve atribute osim broja lajkova i broja deljenja
//  Od metoda:
//-	like(), koja povecava broj lajkova za 1.
//-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//-	share(), koja povecava broj deljenja za 1
//-	print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

