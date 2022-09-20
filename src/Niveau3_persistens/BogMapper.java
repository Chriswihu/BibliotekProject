package Niveau3_persistens;

import Niveau2_logik.Bog;

public class BogMapper
{
    public static void create(Bog bog)
    {
        System.out.println("BogMapper.create");
    }

    public static void slet(Bog bog)
    {
        System.out.println("BogMapper.slet");
    }

    public static void update(Bog bog)
    {
        System.out.println("BogMapper.update");
    }

    public static void udskrivNavne()
    {
        System.out.println("BogMapper.udskrivNavne");
    }
}
