public class Drukboek extends Boek {
    Integer blz;
    String typekaft;

    public Drukboek(String artikelcode, Integer prijs, String title, Integer isbn, String genre, Integer blz, String typekaft) {
        super(artikelcode, prijs, title, isbn, genre);
        this.blz = blz;
        this.typekaft = typekaft;
    }

    public Integer getBlz() {
        return blz;
    }

    public String getTypekaft() {
        return typekaft;
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }
}
