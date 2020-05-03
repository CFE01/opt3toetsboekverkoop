public class Ebook extends Boek {

    private String qr_code;

    public Ebook(String artikelcode, Integer prijs, String title, Integer isbn, String genre, String qr_code) {
        super(artikelcode, prijs, title, isbn, genre);
        this.qr_code = qr_code;
    }

    public String getQr_code() {
        return qr_code;
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }
}
