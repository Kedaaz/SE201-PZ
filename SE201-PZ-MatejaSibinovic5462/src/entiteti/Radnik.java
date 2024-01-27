/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiteti;

import exceptions.JmbgEx;

/**
 *
 * @author Admin
 */
public class Radnik {

    private String adresa;
    private int oblastId;
    private String ime;
    private String prezime;
    private String jmbg;

    public Radnik(String adresa, int oblastId, String ime, String prezime, String jmbg) throws JmbgEx {
        this.adresa = adresa;
        this.oblastId = oblastId;
        this.ime = ime;
        this.prezime = prezime;
        setJmbg(jmbg);
    }
    
    
    
    public String getAdresa() {
        return adresa;
    }
    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setJmbg(String jmbg) throws JmbgEx {
        if (jmbg.length() == 13) {
            this.jmbg = jmbg;
        }else{
            throw new JmbgEx("JMBG treba da ima tacno 13 cifara!");
        }
    }
    
    public static boolean jeValidanJMBG(String jmbg){
        return jmbg.length()==13;
    }

    @Override
    public String toString() {
        return "Radnik{" + "adresa=" + adresa + ", oblastId=" + oblastId + ", ime=" + ime + ", prezime=" + prezime + ", jmbg=" + jmbg + '}';
    }

    public int getOblastId() {
        return oblastId;
    }

    public void setOblastId(int oblastId) {
        this.oblastId = oblastId;
    }
    
    
    
}
