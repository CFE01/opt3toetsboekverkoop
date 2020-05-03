import java.util.ArrayList;
import java.util.Date;

public abstract class Klant {

    private String voornaam;
    private String achternaam;
    private String adres;
    private Date gebdatum;
    private Integer klantnummer;

    private ArrayList<Artikel> Koopt = new ArrayList<>();



    public Klant(String voornaam, String achternaam, String adres, Date gebdatum, Integer klantnummer){
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.adres = adres;
        this.gebdatum = gebdatum;
        this.klantnummer = klantnummer;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getAdres() {
        return adres;
    }

    public Date getGebdatum() {
        return gebdatum;
    }

    public Integer getKlantnummer() {
        return klantnummer;
    }

    public void addArtikel (Artikel artikel){

    }
    public ArrayList<Artikel> getKoopt(){
        return Koopt;
    }

}
