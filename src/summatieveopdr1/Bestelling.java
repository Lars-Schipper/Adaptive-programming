package summatieveopdr1;

public class Bestelling {

    private int bestellingsId;
    private int bestelDatim;
    private Klant naam;
    private Klant id;
    private String status;
    private String trackAndTrace;
    private String zendingInfo;

    public int getBestellingsId() {
        return bestellingsId;
    }

    public void setBestellingsId(int bestellingsId) {
        this.bestellingsId = bestellingsId;
    }

    public int getBestelDatim() {
        return bestelDatim;
    }

    public void setBestelDatim(int bestelDatim) {
        this.bestelDatim = bestelDatim;
    }

    public Klant getNaam() {
        return naam;
    }

    public void setNaam(Klant naam) {
        this.naam = naam;
    }

    public Klant getId() {
        return id;
    }

    public void setId(Klant id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackAndTrace() {
        return trackAndTrace;
    }

    public void setTrackAndTrace(String trackAndTrace) {
        this.trackAndTrace = trackAndTrace;
    }

    public String getZendingInfo() {
        return zendingInfo;
    }

    public void setZendingInfo(String zendingInfo) {
        this.zendingInfo = zendingInfo;
    }

    public void plaatsBestelling(){

    }
}
