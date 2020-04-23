package summatieveopdr1;

public class Bestelling {

    private int bestellingsId;
    private int BestelDatum;
    private String naam;
    private int id;
    private String status;
    private String trackAndTrace;
    private String zendingInfo;

    public int getBestellingsId() {
        return bestellingsId;
    }

    public void setBestellingsId(int bestellingsId) {
        this.bestellingsId = bestellingsId;
    }

    public int getBestelDatum() {
        return BestelDatum;
    }

    public void setBestelDatum(int bestelDatum) {
        this.BestelDatum = bestelDatum;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
