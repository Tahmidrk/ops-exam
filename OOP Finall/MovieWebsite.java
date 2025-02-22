abstract class Hollywood{
    String genre;
    int length;
    int releaseYear;
    String casts;
    double imdbRating;

    public Hollywood(String genre,int length,int releaseYear,String casts,double imdbRating){
        this.genre=genre;
        this.length=length;
        this.releaseYear=releaseYear;
        this.casts=casts;
        this.imdbRating=imdbRating;
    }
    public void display(String MovieName){
        System.out.println("Movie:"+MovieName);
        System.out.println("Genre: "+genre);
        System.out.println("Length: "+length);
        System.out.println("ReleaseYear: "+releaseYear);
        System.out.println("Casts: "+casts);
        System.out.println("ImdbRating: "+imdbRating);
    }
}
class Nun_2 extends Hollywood{
    public Nun_2(String genre,int length,int releaseYear,String casts,double imdbRating){
        super(genre,length,releaseYear,casts,imdbRating);
    }

    @Override
    public void display(String MovieName) {
        super.display("Nun 2");
    }
}
class Wish extends Hollywood{
    public Wish(String genre,int length,int releaseYear,String casts,double imdbRating){
        super(genre,length,releaseYear,casts,imdbRating);
    }

    @Override
    public void display(String MovieName) {
        super.display("Wish");
    }
}
class TheCreator extends Hollywood{
    public TheCreator(String genre,int length,int releaseYear,String casts,double imdbRating){
        super(genre,length,releaseYear,casts,imdbRating);

    }
    public void display(String MovieName) {
        super.display("TheCreator");
    }
}
public class MovieWebsite{
    public static void main(String[] args){
        Nun_2 nun2=new Nun_2("Horror",90,2022,"Rakin,Mohit",7.5);
        Wish wish=new Wish("Horror",120,2019,"Sama,Sourav",8.5);
        TheCreator theCreator=new TheCreator("Horror",120,2016,"Jami,Rayhan",7.5);
        nun2.display("Nun 2");
        System.out.println();
        wish.display("Wish");
        System.out.println();
        theCreator.display("TheCreator");
        System.out.println();
    }
}