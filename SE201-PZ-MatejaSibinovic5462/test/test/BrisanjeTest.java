/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package test;

import entiteti.Biljka;
import exceptions.NevalidanDatumEx;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.BiljkaCRUD;
import util.DatabaseConnector;
import static util.DatabaseConnector.con;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class BrisanjeTest {

    @Test
    public void brisanjeTest() throws NevalidanDatumEx, SQLException {
        int biljkaID = 10;
        DatabaseConnector.openConnection();
        Biljka zalfija = new Biljka(10, 4, "Salvia apiana", "Bela zalfija", 513, "2024-10-25");

        BiljkaCRUD.dodajBiljku(zalfija);
        DatabaseConnector.openConnection();
        PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT id_biljke FROM biljna_vrsta WHERE id_biljke = 10");
        ResultSet resultSet = st.executeQuery();

        PreparedStatement dt = DatabaseConnector.con.prepareStatement("DELETE FROM biljna_vrsta WHERE id_biljke = ?");
        dt.setInt(1, biljkaID);
        int rowsAffected = dt.executeUpdate();
        assertTrue(rowsAffected > 0);
        dt.execute();
        con.close();

    }
}
