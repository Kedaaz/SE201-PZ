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
import static org.junit.jupiter.api.Assertions.assertTrue;
import util.BiljkaCRUD;
import util.DatabaseConnector;

/**
 *
 * @author Admin
 */
public class DodajBiljkuTest {
    
   
     @Test
     public void dodajBiljku() throws SQLException, NevalidanDatumEx {
        DatabaseConnector.openConnection();
        Biljka zalfija = new Biljka(10,4,"Salvia apiana","Bela zalfija",513,"2024-10-25");

        BiljkaCRUD.dodajBiljku(zalfija);
        DatabaseConnector.openConnection();
        PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT id_biljke FROM biljna_vrsta WHERE id_biljke = 10");
        ResultSet resultSet = st.executeQuery();

        assertTrue(resultSet.next());

        DatabaseConnector.closeConnection();
     }
}
