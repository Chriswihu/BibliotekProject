package Niveau3_persistens;

import java.sql.*;

import Niveau2_logik.TerminalInput;

public class UdlånsMapper
{
    public static void opretUdlån() throws SQLException
    {
        String sql = "INSERT INTO UdlånsTabel (LånerID, BogID, Udlånsdato, Afleveringsdato) VALUES (?, ?, ?, ?)";
        String sql2 = "UPDATE BogTabel SET Status = Status - 1 WHERE idBogTabel = ?";
        String sql3 = "UPDATE BogTabel SET AntalUdlån = AntalUdlån + 1 WHERE idBogTabel = ?";

        try (Connection con = ConnectionConfig.getConnection();

             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement ps2 = con.prepareStatement(sql2);
             PreparedStatement ps3 = con.prepareStatement(sql3);
        ) {

            KundeMapper.udskrivKunder();
            System.out.println("-----------------------------");
            ps.setInt(1, TerminalInput.getInt("Indtast lånerID: "));
            BogMapper.udskrivBøger();
            System.out.println("-----------------------------");
            ps.setInt(2, TerminalInput.getInt("Indtast bogID: "));
            ps.setDate(3, TerminalInput.getDate("Indtast udlånsdato: "));
            ps.setDate(4, TerminalInput.getDate("Indtast afleveringsdato: "));
            ps2.setInt(1, TerminalInput.getInt("Indtast bogID for at registrere status: "));
            ps3.setInt(1, TerminalInput.getInt("Indtast bogID for at registrere antal udlån: "));

            ps.executeUpdate();
            ps2.executeUpdate();
            ps3.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);

            System.out.println("Udlån med id nummer " + id + " er nu oprettet");


        }
    }

    public static void registrerRetur() throws SQLException
    {
        String sql = "DELETE FROM UdlånsTabel WHERE idUdlånsTabel = ?";
        String sql2 = "UPDATE BogTabel SET Status = Status + 1 WHERE idBogTabel = ?";

        try (Connection con = ConnectionConfig.getConnection();

             PreparedStatement ps = con.prepareStatement(sql);
             PreparedStatement ps2 = con.prepareStatement(sql2);
        ) {

            UdlånsMapper.udskrivUdlån();
            System.out.println("-----------------------------");
            ps.setInt(2, TerminalInput.getInt("Indtast udlånsID: "));
            ps2.setInt(1, TerminalInput.getInt("Indtast bogID: "));

            ps.executeUpdate();
            ps2.executeUpdate();

            System.out.println("Bog er nu afleveret");

        }
    }

    public static void udskrivUdlån() {
        String sql = "select * from UdlånsTabel";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idUdlånsTabel");
                int lånerID = resultSet.getInt("LånerID");
                int bogID = resultSet.getInt("BogID");
                Date udlånsdato = resultSet.getDate("Udlånsdato");
                Date afleveringsdato = resultSet.getDate("Afleveringsdato");

                System.out.println("Udlåns ID: " + id + " Låner ID: " + lånerID +
                        " Bog ID: " + bogID + " Udlånsdato: " + udlånsdato +
                        " Afleveringsdato: " + afleveringsdato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void visUdlånForEnKunde() {
        String sql = "select * from UdlånsTabel where LånerID = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, TerminalInput.getInt("Indtast låner ID: "));

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idUdlånsTabel");
                int lånerID = resultSet.getInt("LånerID");
                int bogID = resultSet.getInt("BogID");
                Date udlånsdato = resultSet.getDate("Udlånsdato");
                Date afleveringsdato = resultSet.getDate("Afleveringsdato");

                System.out.println("ID: " + id + " Låner ID: " + lånerID +
                        " Bog ID: " + bogID + " Udlånsdato: " + udlånsdato +
                        " Afleveringsdato: " + afleveringsdato);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}