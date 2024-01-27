/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.*;
import static util.DatabaseConnector.con;

/**
 *
 * @author Admin
 */
public class SortiranjeBaze {

    private static final String URL = "jdbc:mysql://localhost:3306/park_prirode";
    private static final String USER = "root";
    private static final String PASSWORD = "";

//    public static void sortiranjeBaze(String tabela, String kolona, String nacin) throws SQLException {
//        try {
//            DatabaseConnector.getConnection();
//            PreparedStatement st = DatabaseConnector.con.prepareStatement("SELECT * FROM " + tabela + " ORDER BY " + kolona + " " + nacin);
//            ResultSet resultSet = st.executeQuery();
//
//            while (resultSet.next()) {
//                int id = resultSet.getInt(tabela);
//                String sortiranaKolona = resultSet.getString(kolona);
//
//                System.out.println("Id: " + id + " " + kolona + ":" + sortiranaKolona);
//
//            }
//            con.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//    }
    public static void sortTable(String tableName, String columnName, String sortOrder) throws SQLException {
        // Povezivanje s bazom podataka
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // SQL upit za sortiranje tabele
            String sql = "SELECT * FROM " + tableName + " ORDER BY " + columnName + " " + sortOrder;

            // Priprema SQL upita
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                // Izvršavanje upita
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Prikaz rezultata
                    while (resultSet.next()) {
                        // Ovde možete raditi sa svakim redom rezultata prema potrebama
                        System.out.println(resultSet.getString(columnName));
                        // Zamijenite "column1" i "column2" sa stvarnim nazivima kolona u vašoj tabeli
                    }
                }
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
