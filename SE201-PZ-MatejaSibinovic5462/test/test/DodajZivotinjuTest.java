/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import entiteti.Zivotinja;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import util.DatabaseConnector;
import util.ZivotinjaCRUD;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class DodajZivotinjuTest {


    @Test
    public void dodajUListuTest() throws SQLException {

        DatabaseConnector.openConnection();
        Zivotinja lav = new Zivotinja(12,2,2, "Panthera leo", "Lav", "Savana");

        ZivotinjaCRUD.dodajZivotinju(lav);
        DatabaseConnector.openConnection();
        PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT br_prstena FROM zivotinja WHERE br_prstena = 12");
        ResultSet resultSet = st.executeQuery();

        assertTrue(resultSet.next());

        DatabaseConnector.closeConnection();
    }
}
