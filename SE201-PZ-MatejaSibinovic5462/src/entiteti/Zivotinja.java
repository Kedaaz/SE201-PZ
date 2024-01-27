/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiteti;

/**
 *
 * @author Admin
 */
public class Zivotinja {
    private int brojPrstena;
    private int redniBr;
    private int oblastId;
    private String latinskiNaziv;
    private String lokalniNaziv;
    private String staniste;

    public Zivotinja(int brojPrstena, int redniBr, int oblastId, String latinskiNaziv, String lokalniNaziv, String staniste) {
        this.brojPrstena = brojPrstena;
        this.redniBr = redniBr;
        this.oblastId = oblastId;
        this.latinskiNaziv = latinskiNaziv;
        this.lokalniNaziv = lokalniNaziv;
        this.staniste = staniste;
    }

    public int getBrojPrstena() {
        return brojPrstena;
    }

    public int getRedniBr() {
        return redniBr;
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

    public String getStaniste() {
        return staniste;
    }

    public void setBrojPrstena(int brojPrstena) {
        this.brojPrstena = brojPrstena;
    }

    public void setRedniBr(int redniBr) {
        this.redniBr = redniBr;
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

    public void setStaniste(String staniste) {
        this.staniste = staniste;
    }

    @Override
    public String toString() {
        return "Zivotinja{" + "brojPrstena=" + brojPrstena + ", redniBr=" + redniBr + ", oblastId=" + oblastId + ", latinskiNaziv=" + latinskiNaziv + ", lokalniNaziv=" + lokalniNaziv + ", staniste=" + staniste + '}';
    }
    
    
    
}
