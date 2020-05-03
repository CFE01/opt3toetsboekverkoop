import sun.awt.image.IntegerInterleavedRaster;

public class Boek extends Artikel {
    private String title;
    private Integer isbn;
    private String genre;

    public Boek(String artikelcode, Integer prijs, String title, Integer isbn,String genre) {
        super(artikelcode, prijs);
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

}
