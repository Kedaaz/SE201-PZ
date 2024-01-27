/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiteti;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Park {
    private String naziv;
    private List<Zivotinja> zivotinje;
    private List<Biljka> biljke;
    private List<Hraniliste> hranilista;
    private List<Radnik> radnici;
    private List<Oblast> oblasti;

    public Park(String naziv) {
        this.naziv = naziv;
    }

    public Park() {
    }
    

    public String getNaziv() {
        return naziv;
    }

    public List<Zivotinja> getZivotinje() {
        return zivotinje;
    }

    public List<Biljka> getBiljke() {
        return biljke;
    }

    public List<Hraniliste> getHranilista() {
        return hranilista;
    }

    public List<Radnik> getRadnici() {
        return radnici;
    }

    public List<Oblast> getOblasti() {
        return oblasti;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setZivotinje(List<Zivotinja> zivotinje) {
        this.zivotinje = zivotinje;
    }

    public void setBiljke(List<Biljka> biljke) {
        this.biljke = biljke;
    }

    public void setHranilista(List<Hraniliste> hranilista) {
        this.hranilista = hranilista;
    }

    public void setRadnici(List<Radnik> radnici) {
        this.radnici = radnici;
    }

    public void setOblasti(List<Oblast> oblasti) {
        this.oblasti = oblasti;
    }
    
     public void dodajZivotinju(Zivotinja zivotinja) {
        if (zivotinje == null) {
            zivotinje = new ArrayList<>();
        }
        zivotinje.add(zivotinja);
    }
     public void dodajRadnika(Radnik radnik) {
        if (radnici == null) {
            radnici = new ArrayList<>();
        }
        radnici.add(radnik);
    }
     public void dodajBiljku(Biljka biljka) {
        if (biljke == null) {
            biljke = new ArrayList<>();
        }
        biljke.add(biljka);
    }
     public void dodajHraniliste(Hraniliste hraniliste) {
        if (hranilista == null) {
            hranilista = new ArrayList<>();
        }
        hranilista.add(hraniliste);
    }
     public void dodajOblast(Oblast oblast) {
        if (oblasti == null) {
            oblasti = new ArrayList<>();
        }
        oblasti.add(oblast);
    }

    @Override
    public String toString() {
        return "Park{" + "naziv=" + naziv + ", zivotinje=" + zivotinje + ", biljke=" + biljke + ", hranilista=" + hranilista + ", radnici=" + radnici + ", oblasti=" + oblasti + '}';
    }
    
    
}
