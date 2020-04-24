package summatieveopdr1;

public class BestellingGegevens {

    private int bestellingId;
    private int productId;
    private int aantal;
    private int totaalPrijs;
    private String trackAndTrace;

    public int getBestellingId() {
        return bestellingId;
    }

    public void setBestellingId(int bestellingId) {
        this.bestellingId = bestellingId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public int getTotaalPrijs() {
        return totaalPrijs;
    }

    public void setTotaalPrijs(int totaalPrijs) {
        this.totaalPrijs = totaalPrijs;
    }

    public void totaalPrijs(){
    return;
    }
}
