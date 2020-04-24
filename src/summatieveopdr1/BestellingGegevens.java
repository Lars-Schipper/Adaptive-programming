package summatieveopdr1;

public class BestellingGegevens {

    private int bestellingId;
    private int productId;
    private int aantal;

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

    @Override
    public String toString() {

        return "uw order nummer is: " + bestellingId + ", Deze bevat " + aantal + "x het product: " + productId;
    }
}
