abstract class Artikel {
    private String artikelcode;
    private Integer prijs;


    public Artikel(String artikelcode, Integer prijs){
        this.artikelcode = artikelcode;
        this.prijs= prijs;
    }

    public void setArtikelcode(String artikelcode) {
        this.artikelcode = artikelcode;
    }

    public void setPrijs(Integer prijs) {
        this.prijs = prijs;
    }

    public Integer getPrijs() {
        return prijs;
    }

    public String getArtikelcode() {
        return artikelcode;
    }
}
