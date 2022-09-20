package Niveau3_persistens;

import Niveau2_logik.TerminalInput;

import java.sql.*;

public class KundeMapper {
//    public static void opretKunde() {
//        Connection connection = ConnectionConfig.getConnection();
//        try {
//            String sql = "INSERT INTO LånerTabel (Navn, Adresse, Postnummer) VALUES (?, ?, ?)";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, TerminalInput.getString("Navn: "));
//            preparedStatement.setString(2, TerminalInput.getString("Adresse: "));
//            preparedStatement.setInt(3, TerminalInput.getInt("Postnummer: "));
//            preparedStatement.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//
//    }


    public static void opretKunde() throws SQLException {
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

            System.out.println("Vi er naet til raekke : " + id);

        }


    }
}
