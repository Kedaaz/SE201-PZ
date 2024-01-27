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
public class Hraniliste {

    private int redniBr;
    private String pocetniMesec;
    private String krajnjiMesec;
    private static final String DATUM_PATTERN = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$";


    public Hraniliste(int RedniBr, String PocetniMesec, String KrajnjiMesec) throws NevalidanDatumEx {
        this.redniBr = RedniBr;
        setPocetniMesec(pocetniMesec);
        setKrajnjiMesec(krajnjiMesec);
    }

    public int getRedniBr() {
        return redniBr;
    }

    public String getPocetniMesec() {
        return pocetniMesec;
    }

    public String getKrajnjiMesec() {
        return krajnjiMesec;
    }

    public void setRedniBr(int RedniBr) {
        this.redniBr = RedniBr;
    }

    public void setPocetniMesec(String PocetniMesec) throws NevalidanDatumEx {
        if (pocetniMesec.matches(DATUM_PATTERN)) {
            this.pocetniMesec = PocetniMesec;
        } else {
            throw new NevalidanDatumEx("Datum nije u validnom formatu!");
        }

    }

    public void setKrajnjiMesec(String KrajnjiMesec) throws NevalidanDatumEx {
        if (krajnjiMesec.matches(DATUM_PATTERN)) {
            this.pocetniMesec = KrajnjiMesec;
        } else {
            throw new NevalidanDatumEx("Datum nije u validnom formatu!");
        }
    }

    @Override
    public String toString() {
        return "Hraniliste{" + "RedniBr=" + redniBr + ", PocetniMesec=" + pocetniMesec + ", KrajnjiMesec=" + krajnjiMesec + '}';
    }
}
