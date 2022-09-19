package Niveau3_persistens;

import Niveau2_logik.TerminalInput;

import java.util.LinkedList;
import java.util.List;

public class MinListe
{
    List<String> list = new LinkedList<>();

    public MinListe ()
    {
        list.add("Mads");
        list.add("Morten");
        list.add("Mikkel");
        list.add("Peter");
    }

    protected void create()
    {
        list.add(TerminalInput.getString("Skriv et navn"));
    }

    protected void slet()
    {
        list.remove(TerminalInput.getInt("Hvilket navn vil du slette?"));
    }

    protected void update()
    {
        list.set(TerminalInput.getInt("Hvilket navn vil du opdatere?"), TerminalInput.getString("Hvad vil du opdatere navnet til?"));
    }

    protected void udskrivNavne()
    {
        for (String s : list)
        {
            System.out.println(s);
        }
    }
}
