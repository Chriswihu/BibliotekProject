package Niveau3_persistens;

public class Facade
{

    static MinListe minListe = new MinListe();
    public static void create()
    {
        minListe.create();

        //Mapper.create();
    }

    public static void slet()
    {
        minListe.slet();
        //Mapper.slet();
    }

    public static void update()
    {
        minListe.update();
        //Mapper.update();
    }

    public static void udskrivNavne()
    {
        minListe.udskrivNavne();
        //Mapper.udskrivNavne();
    }

}
