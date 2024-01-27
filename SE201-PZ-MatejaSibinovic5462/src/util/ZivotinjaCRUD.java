/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import entiteti.Zivotinja;
import static util.DatabaseConnector.con;

/**
 *
 * @author Admin
 */
public class ZivotinjaCRUD {

    public static void dodajZivotinju(Zivotinja zivotinja) {
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("INSERT INTO `zivotinja`(`BR_PRSTENA`, `Redni_broj`, `ID_oblasti`, `LATINSKI_NAZIV`, `LOKALNI_NAZIV`, `STANISTE`)" + " VALUES (?,?,?,?,?,?)");
            st.setInt(1, zivotinja.getBrojPrstena());
            st.setInt(2, zivotinja.getRedniBr());
            st.setInt(3, zivotinja.getOblastId());
            st.setString(4, zivotinja.getLatinskiNaziv());
            st.setString(5, zivotinja.getLokalniNaziv());
            st.setString(6, zivotinja.getStaniste());
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Dodavanje uspesno!");
            } else {
                System.out.println("Dodavanje neuspesno.");
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ispisZivotinje() throws SQLException {
        ResultSet resultSet = null;
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT * FROM zivotinja");

            resultSet = st.executeQuery();
            while (resultSet.next()) {
                int br_prstena = resultSet.getInt("br_prstena");
                int redniBr = resultSet.getInt("redni_broj");
                int oblastID = resultSet.getInt("id_oblasti");
                String latNaziv = resultSet.getString("latinski_naziv");
                String lokNaziv = resultSet.getString("lokalni_naziv");
                String staniste = resultSet.getString("staniste");

                System.out.println("Broj prstena: " + br_prstena + " , Redni broj: " + redniBr + " , Oblast: " + oblastID + " , Latinski naziv: " + latNaziv + " , Lokalni naziv: " + lokNaziv + " , Staniste: " + staniste);

            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void obrisiZivotinju(int brPrstena) throws SQLException {
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("DELETE FROM zivotinja WHERE br_prstena = ?");
            st.setInt(1, brPrstena);
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Brisanje uspesno!");
            } else {
                System.out.println("Nema podataka za brisanje.");
            }
            st.execute();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
