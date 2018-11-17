/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.model;

import java.util.Date;

/**
 *
 * @author Korisnik
 */
public class Operater {
    private String sifra;
    private String email;
    private String ime;
    private String prezime;
    private String uloga;
    private Date datumprijave;

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }

    public Date getDatumprijave() {
        return datumprijave;
    }

    public void setDatumprijave(Date datumprijave) {
        this.datumprijave = datumprijave;
    }

 
 
}
