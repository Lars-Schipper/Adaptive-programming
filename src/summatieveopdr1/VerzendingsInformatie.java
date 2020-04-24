package summatieveopdr1;

public class VerzendingsInformatie {

    private int verzendingId;
    private String TraceerCode;
    private String Adres;
    private String naam;

    public int getVerzendingId() {
        return verzendingId;
    }

    public void setVerzendingId(int verzendingId) {
        this.verzendingId = verzendingId;
    }

    public String getTraceerCode() {
        return TraceerCode;
    }

    public void setTraceerCode(String traceerCode) {
        TraceerCode = traceerCode;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "hallo " + naam + ",\nuw pakket met de traceer code: " + TraceerCode + "wordt vezonden naar: " + Adres + ".\nuw verzendings ID is: " + verzendingId;
    }
}

