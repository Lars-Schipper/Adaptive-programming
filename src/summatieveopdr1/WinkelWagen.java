package summatieveopdr1;

import java.util.List;

public class WinkelWagen {

    private int WinkelWagenId;
    private int productId;
    private int aantal;

    public int getWinkelWagenId() {
        return WinkelWagenId;
    }

    public void setWinkelWagenId(int winkelWagenId) {
        WinkelWagenId = winkelWagenId;
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

    public void voegProductToe(){

    }

    public void bekijkWinkleWagentje(){
        System.out.println("hey hallo dit is uw winkel wagentje");
    }

    public void betalen(){

    }

    @Override
    public String toString() {
        return "WinkelWagen{" +
                "WinkelWagenId=" + WinkelWagenId +
                ", productId=" + productId +
                ", aantal=" + aantal +
                '}';
    }
}
