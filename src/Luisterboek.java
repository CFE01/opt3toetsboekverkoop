public class Luisterboek extends Boek {

    private Integer duur;
    private String stem;

    public Luisterboek(String artikelcode, Integer prijs, String title, Integer isbn, String genre, Integer duur, String stem) {
        super(artikelcode, prijs, title, isbn, genre);
        this.duur = duur;
        this.stem = stem;
    }

    public Integer getDuur() {
        return duur;
    }

    public String getStem() {
        return stem;
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }
}
