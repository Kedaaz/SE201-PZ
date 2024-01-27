/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.*;
import entiteti.*;
import exceptions.*;
import java.sql.SQLException;
import util.*;

/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NevalidanDatumEx, SQLException {
        DatabaseConnector.getConnection();

        boolean exit = false;
        while (!exit) {

            System.out.println("Izaberite opciju:");
            System.out.println("1. Dodavanje nove zivotinje: ");
            System.out.println("2. Dodavanje nove biljke: ");
            System.out.println("3. Prikaz zivotinja: ");
            System.out.println("4. Prikaz biljaka:  ");
            System.out.println("5. Brisanje zivotinja:  ");
            System.out.println("6. Brisanje biljaka: ");
            System.out.println("7. Sortiranje");
            System.out.println("8. Brute Force napad");
            System.out.println("9. Izlaz iz programa");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Unesi broj prstena:");
                    int brPrstena = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Unesi redni broj:");
                    int redniBr = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Unesi ID oblasti:");
                    int oblastId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Unesi latinski naziv zivotinje:");
                    String latNaziv = scanner.nextLine();
                    System.out.println("Unesi lokalni naziv zivotinje:");
                    String lokNaziv = scanner.nextLine();
                    System.out.println("Unesi staniste zivotinje:");
                    String staniste = scanner.nextLine();

                    Zivotinja zivotinja = new Zivotinja(brPrstena, redniBr, oblastId, latNaziv, lokNaziv, staniste);

                    ZivotinjaCRUD.dodajZivotinju(zivotinja);

                    break;

                case 2:
                    System.out.println("Unesi ID biljke:");
                    int biljkaId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Unesi ID oblasti:");
                    int oblastid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Unesi latinski naziv biljke:");
                    String latNazivBiljke = scanner.nextLine();

                    System.out.println("Unesi lokalni naziv biljke:");
                    String lokNazivBiljke = scanner.nextLine();

                    System.out.println("Unesi broj odluke:");
                    int brOdluke = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Unesi datum :");
                    String datum = scanner.nextLine();

                    Biljka biljka = new Biljka(biljkaId, oblastid, latNazivBiljke, lokNazivBiljke, brOdluke, datum);

                    BiljkaCRUD.dodajBiljku(biljka);

                    break;
                case 3:
                    ZivotinjaCRUD.ispisZivotinje();
                    break;
                case 4:
                    BiljkaCRUD.ispisBiljke();
                    break;
                case 5:

                    System.out.println("Unesite redni broj prstena zivotinje koju hocete da obrisete:");
                    int brPrstenaBris = scanner.nextInt();
                    scanner.nextLine();

                    ZivotinjaCRUD.obrisiZivotinju(brPrstenaBris);

                    break;
                case 6:
                    System.out.println("Unesite ID biljke koju hocete da obrisete:");
                    int biljkaIdBris = scanner.nextInt();
                    scanner.nextLine();

                    BiljkaCRUD.obrisiBiljku(biljkaIdBris);

                    break;
                case 7:
                    System.out.println("Unesite tabelu koju sortirate");
                    String tabela = scanner.nextLine();
                  
                    System.out.println("Unesite kolonu po kojoj sortirate");
                    String kolona = scanner.nextLine();

                    System.out.println("Unesite nacin na koji sortirate (ASC ili DESC)");
                    String nacin = scanner.nextLine();
                    
                    System.out.println("Sortirana tabela je: ");
                    SortiranjeBaze.sortTable(tabela, kolona, nacin);

                    break;
                case 8:
                    String targetPassword = "root";
                    String characterSet = "abcdefghijklmnopqrstuvwxyz0123456789";
                    int maxLength = 4;
                    BruteForce.bruteForceAttack(targetPassword, characterSet, maxLength);
                    break;
                case 9:
                    exit = true;
                    break;
                default:
                    System.out.println("Nevažeći izbor. Molimo unesite ponovo.");
            }
        }
    }
}
