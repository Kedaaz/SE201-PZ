/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entiteti;

import enumi.TipZastite;
import exceptions.NevalidnaPovrsinaEx;

/**
 *
 * @author Admin
 */
public class Oblast {

    public Oblast(int OblastID, String Ime, double Povrsina, String Selo, TipZastite NivoZastite) throws NevalidnaPovrsinaEx {
        this.oblastID = OblastID;
        this.ime = Ime;
        setPovrsina(povrsina);
        this.selo = Selo;
        this.nivoZastite = NivoZastite;
    }

    private int oblastID;
    private String ime;
    private double povrsina;
    private String selo;
    private TipZastite nivoZastite;

    public int getOblastID() {
        return oblastID;
    }

    public String getIme() {
        return ime;
    }

    public double getPovrsina() {
        return povrsina;
    }

    public String getSelo() {
        return selo;
    }

    public TipZastite getNivoZastite() {
        return nivoZastite;
    }

    public void setOblastID(int OblastID) {
        this.oblastID = OblastID;
    }

    public void setIme(String Ime) {
        this.ime = Ime;
    }

    public void setPovrsina(double Povrsina) throws NevalidnaPovrsinaEx {
        if (povrsina != 0) {
            this.povrsina = Povrsina;
        }else{
            throw new NevalidnaPovrsinaEx("Povrsina ne sme biti manja od 0!");
        }

    }

    public void setSelo(String Selo) {
        this.selo = Selo;
    }

    public void setNivoZastite(TipZastite NivoZastite) {
        this.nivoZastite = NivoZastite;
    }

    @Override
    public String toString() {
        return "Oblast{" + "OblastID=" + oblastID + ", Ime=" + ime + ", Povrsina=" + povrsina + ", Selo=" + selo + ", NivoZastite=" + nivoZastite + '}';
    }

}
