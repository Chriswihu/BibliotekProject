import java.util.Scanner;
import java.sql.*;

public class Main
{
    public static void main(String[] args)
    {
        String input;

        while (true)
        {
            input = getString("Velkommen, hvad ønsker du at gøre?");

            switch (input)
            {
                case "opret":

            }
        }
    }

    public static String getString(String s)
    {
        System.out.println(s + " : ");
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static void opret()
    {
        String sql = "INSERT INTO lånere (";
    }
}