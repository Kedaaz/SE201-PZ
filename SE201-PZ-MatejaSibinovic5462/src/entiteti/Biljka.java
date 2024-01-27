/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiteti;

import exceptions.NevalidanDatumEx;

/**
 *
 * @author Admin
 */
public class Biljka {

    private int biljkaID;
    private int oblastId;
    private String latinskiNaziv;
    private String lokalniNaziv;
    private int brojOdluke;
    private String datumZastite;
    private static final String DATUM_PATTERN = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";

    public Biljka(int biljkaID, int oblastId, String latinskiNaziv, String lokalniNaziv, int brojOdluke, String datumZastite) throws NevalidanDatumEx {
        this.biljkaID = biljkaID;
        this.oblastId = oblastId;
        this.latinskiNaziv = latinskiNaziv;
        this.lokalniNaziv = lokalniNaziv;
        this.brojOdluke = brojOdluke;
        setDatumZastite(datumZastite);
    }

    public int getBiljkaID() {
        return biljkaID;
    }

    public int getOblastId() {
        return oblastId;
    }

    public String getLatinskiNaziv() {
        return latinskiNaziv;
    }

    public String getLokalniNaziv() {
        return lokalniNaziv;
    }

    public int getBrojOdluke() {
        return brojOdluke;
    }

    public String getDatumZastite() {
        return datumZastite;
    }

    public void setBiljkaID(int biljkaID) {
        this.biljkaID = biljkaID;
    }

    public void setOblastId(int oblastId) {
        this.oblastId = oblastId;
    }

    public void setLatinskiNaziv(String latinskiNaziv) {
        this.latinskiNaziv = latinskiNaziv;
    }

    public void setLokalniNaziv(String lokalniNaziv) {
        this.lokalniNaziv = lokalniNaziv;
    }

    public void setBrojOdluke(int brojOdluke) {
        this.brojOdluke = brojOdluke;
    }

    public static boolean jeValidanDatum(String datum) {
        return datum != null && datum.matches(DATUM_PATTERN);
    }

    public void setDatumZastite(String datumZastite) throws NevalidanDatumEx {
        if (datumZastite.matches(DATUM_PATTERN)) {
            this.datumZastite = datumZastite;
        } else {
            throw new NevalidanDatumEx("Datum nije u validnom formatu!");
        }
    }

    @Override
    public String toString() {
        return "Biljka{" + "biljkaID=" + biljkaID + ", oblastId=" + oblastId + ", latinskiNaziv=" + latinskiNaziv + ", lokalniNaziv=" + lokalniNaziv + ", brojOdluke=" + brojOdluke + ", datumZastite=" + datumZastite + '}';
    }

}
