package Niveau3_persistens;

import Niveau2_logik.TerminalInput;

import java.sql.*;

public class KundeMapper
{

    public static void opretKunde() throws SQLException
    {
        String sql = "INSERT INTO LånerTabel (Navn, Adresse, Postnummer) VALUES (?, ?, ?)";

        try (Connection con = ConnectionConfig.getConnection();

             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {

            ps.setString(1, TerminalInput.getString("Indtast navn: "));
            ps.setString(2, TerminalInput.getString("Indtast adresse: "));
            ps.setInt(3, TerminalInput.getInt("Indtast postnummer: "));

            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);

            System.out.println("Kunde med " + id + " er nu oprettet");

        }
    }

    public static void udskrivKunder() throws SQLException
    {
        String sql = "select * from LånerTabel";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idLånerTabel");
                String navn = resultSet.getString("Navn");
                String adresse = resultSet.getString("Adresse");
                int postnummer = resultSet.getInt("Postnummer");

                System.out.println("ID: " + id + " Navn: " + navn + " Adresse: " + adresse + " Postnummer: " + postnummer);
            }
        }
    }

    public static void findKunde() throws SQLException
    {
        String sql = "select * from LånerTabel where Navn like ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, "%" + TerminalInput.getString("Indtast del af navn: ") + "%");

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idLånerTabel");
                String navn = resultSet.getString("Navn");
                String adresse = resultSet.getString("Adresse");
                int postnummer = resultSet.getInt("Postnummer");

                System.out.println("ID: " + id + " Navn: " + navn + " Adresse: " + adresse + " Postnummer: " + postnummer);
            }
        }
    }

    public static void opdaterKunde() throws SQLException
    {
        String sql = "update LånerTabel set Navn = ?, Adresse = ?, Postnummer = ? where idLåner = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, TerminalInput.getString("Indtast navn: "));
            ps.setString(2, TerminalInput.getString("Indtast adresse: "));
            ps.setInt(3, TerminalInput.getInt("Indtast postnummer: "));
            ps.setInt(4, TerminalInput.getInt("Indtast id: "));

            ps.executeUpdate();

            System.out.println("Kunde er opdateret");
        }
    }

    public static void sletKunde() throws SQLException
    {
        String sql = "delete from LånerTabel where iDLånerTabel like ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            udskrivKunder();
            System.out.println("----------------------");
            ps.setInt(1, TerminalInput.getInt("Indtast id på den kunde du vil slette: "));

            ps.executeUpdate();

            System.out.println("Kunde er slettet");
        }
    }
}
