package Niveau3_persistens;

import Niveau2_logik.TerminalInput;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BogMapper {
    public static void opretBog() {
        String sql = "INSERT INTO BogTabel (Forfatter, Titel, Udgivelsesår) VALUES (?, ?, ?)";

        try (Connection con = ConnectionConfig.getConnection();

             PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ) {

            ps.setString(1, TerminalInput.getString("Indtast forfatter: "));
            ps.setString(2, TerminalInput.getString("Indtast titel: "));
            ps.setInt(3, TerminalInput.getInt("Indtast udgivelsesår: "));

            ps.executeUpdate();

            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);

            System.out.println("Vi er naet til raekke : " + id);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void udskrivBøger() {
        String sql = "select * from BogTabel";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idBog");
                String forfatter = resultSet.getString("Forfatter");
                String titel = resultSet.getString("Titel");
                int udgivelsesår = resultSet.getInt("Udgivelsesår");

                System.out.println(id + " : " + forfatter + " : " + titel + " : " + udgivelsesår);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void udskrivUdlånteBøger() {
        String sql = "select * from BogTabel where Udlånt = 1";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idBog");
                String forfatter = resultSet.getString("Forfatter");
                String titel = resultSet.getString("Titel");
                int udgivelsesår = resultSet.getInt("Udgivelsesår");

                System.out.println(id + " : " + forfatter + " : " + titel + " : " + udgivelsesår);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void udskrivTilgængeligeBøger()
    {
        String sql = "select * from BogTabel where Udlånt = 0";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idBog");
                String forfatter = resultSet.getString("Forfatter");
                String titel = resultSet.getString("Titel");
                int udgivelsesår = resultSet.getInt("Udgivelsesår");

                System.out.println(id + " : " + forfatter + " : " + titel + " : " + udgivelsesår);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findBog()
    {
        String sql = "select * from BogTabel where Titel = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, TerminalInput.getString("Indtast titel: "));

            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idBog");
                String forfatter = resultSet.getString("Forfatter");
                String titel = resultSet.getString("Titel");
                int udgivelsesår = resultSet.getInt("Udgivelsesår");

                System.out.println(id + " : " + forfatter + " : " + titel + " : " + udgivelsesår);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void opdaterBog()
    {
        String sql = "update BogTabel set Forfatter = ?, Titel = ?, Udgivelsesår = ? where idBog = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, TerminalInput.getString("Indtast forfatter: "));
            ps.setString(2, TerminalInput.getString("Indtast titel: "));
            ps.setInt(3, TerminalInput.getInt("Indtast udgivelsesår: "));
            ps.setInt(4, TerminalInput.getInt("Indtast id: "));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sletBog()
    {
        String sql = "delete from BogTabel where idBog = ?";

        try (Connection con = ConnectionConfig.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, TerminalInput.getInt("Indtast id: "));

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

