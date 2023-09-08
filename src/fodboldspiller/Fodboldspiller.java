package fodboldspiller;

import java.util.Scanner;

public class Fodboldspiller {
    private String fornavn;
    private String efternavn;
    private String klub;
    private double højde;
    private int vægt;

    //Konstruktør metode
    public Fodboldspiller(String fornavn, String efternavn, String klub, double højde, int vægt) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.klub = klub;
        this.højde = højde;
        this.vægt = vægt;
    }
    // get metode
    public String getFornavn() {
        return fornavn;
    }
    public String getEfternavn() {
        return efternavn;
    }
    public String getKlub() {
        return klub;
    }
    public double getHøjde() {
        return højde;
    }
    public int getVægt() {
        return vægt;
    }
}
