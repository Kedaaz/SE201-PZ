/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import entiteti.Biljka;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static util.DatabaseConnector.con;

/**
 *
 * @author Admin
 */
public class BiljkaCRUD {

    public static void dodajBiljku(Biljka biljka) {
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("INSERT INTO `biljna_vrsta`(`ID_biljke`, `ID_oblast`, `LATINSKI_NAZIV`, `LOKALNI_NAZIV`, `broj_odluke`, `Datum_zastite`)" + " VALUES (?,?,?,?,?,?)");
            st.setInt(1, biljka.getBiljkaID());
            st.setInt(2, biljka.getOblastId());
            st.setString(3, biljka.getLatinskiNaziv());
            st.setString(4, biljka.getLokalniNaziv());
            st.setInt(5, biljka.getBrojOdluke());
            st.setString(6, biljka.getDatumZastite());
           
            int rowsAffected = st.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Dodavanje uspesno!");
            } else {
                System.out.println("Dodavanje neuspesno.");
            }
            st.execute();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void ispisBiljke() throws SQLException {
        ResultSet resultSet = null;
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT * FROM biljna_vrsta");

            resultSet = st.executeQuery();
            while (resultSet.next()) {
                int idBiljke = resultSet.getInt("id_biljke");
                int oblastID = resultSet.getInt("id_oblast");
                String latNaziv = resultSet.getString("latinski_naziv");
                String lokNaziv = resultSet.getString("lokalni_naziv");
                String brOdluke = resultSet.getString("broj_odluke");
                String datZastite = resultSet.getString("datum_zastite");

                System.out.println("ID biljke : " + idBiljke + " , Oblast: " + oblastID + " , Latinski naziv: " + latNaziv + " , Lokalni naziv: " + lokNaziv + " , Broj odluke : " + brOdluke + " , Datum zastite : " + datZastite);

            }
            
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void obrisiBiljku(int biljkaId) throws SQLException {
        try {
            DatabaseConnector.getConnection();
            PreparedStatement st = DatabaseConnector.con.prepareStatement("DELETE FROM biljna_vrsta WHERE id_biljke = ?");
            st.setInt(1, biljkaId);
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
