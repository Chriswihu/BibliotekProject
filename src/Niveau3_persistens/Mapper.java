package Niveau3_persistens;

import Niveau2_logik.TerminalInput;
import Niveau3_persistens.ConnectionConfig;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Mapper {
    //Opdaterer kunden i databasen
    static void update()
    {
        udskrivNavne();

        String sql = "update Navne set navne = ? where idNavne = ?";



        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);) {

            String kundeNavn = TerminalInput.getString("What is the new name?");

            ps.setString(1, kundeNavn);

            // det er det her jeg søger på.
            ps.setInt(2, TerminalInput.getInt("What is the id of the name you want to update?"));


            int res = ps.executeUpdate();    //https://javaconceptoftheday.com/difference-between-executequery-executeupdate-execute-in-jdbc/

            if (res > 0) {

                System.out.println("Kunden med navnet " + "\"" + kundeNavn + "\"" + " er nu blevet opdateret");
            }
            else {
                System.out.println("en kunde med det nummer fandtes ikke i listen ");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        udskrivNavne();

    }

    //Sletter en person fra databasen
    static void slet() {
        udskrivNavne();

        String sql = "delete from navne where navne = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);) {

            String kundeNavn = TerminalInput.getString("What is the name of the customer you want to delete?");

            ps.setString(1, kundeNavn);


            int res = ps.executeUpdate();       //https://javaconceptoftheday.com/difference-between-executequery-executeupdate-execute-in-jdbc/

            if (res > 0) {

                System.out.println("Kunden med navnet " + "\"" + kundeNavn + "\"" + " er nu blevet slettet");
            }
            else {
                System.out.println("Kunden med navnet " + "\"" + kundeNavn + "\"" + " findes ikke");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        udskrivNavne();
    }

    //Modtag et raekkenummer og udskriv navnet paa personen paa det raekkenummer
    static void create() {
        String sql = "INSERT INTO Navne (navne ) VALUES (?)";


        // se lige try-with-resources f.eks. her  https://www.baeldung.com/java-try-with-resources
        try (Connection con = ConnectionConfig.getConnection();  // får en connection

             // se evt. https://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {

            // her klargøres mit prepared statement ved at min parametre indsættes.
            ps.setString(1, TerminalInput.getString("Indtast navn: "));


            ps.executeUpdate();    //https://javaconceptoftheday.com/difference-between-executequery-executeupdate-execute-in-jdbc/

            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);



            System.out.println("Vi er naet til raekke : " + id);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Udskriv og opret
    static void udskrivNavne() {
        List<String> kundeList = new ArrayList<>();

        String sql = "select * from Navne ";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {           // https://en.wikipedia.org/wiki/Prepared_statement


            ResultSet resultSet = ps.executeQuery();   //https://javaconceptoftheday.com/difference-between-executequery-executeupdate-execute-in-jdbc/

            while (resultSet.next()) {
                int id = resultSet.getInt("idNavne");
                String navn = resultSet.getString("navne");

                kundeList.add(id + " : " + navn);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        for (String s : kundeList)
        {
            System.out.println(s);

        }
    }
}
