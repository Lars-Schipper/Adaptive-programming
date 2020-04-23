package summatieveopdr1;

import java.sql.ClientInfoStatus;
import java.util.List;

public class WinkelWagen {

    private int WinkelWagenId;
    private int productId;
    private int aantal;

    public WinkelWagen(int winkelWagenId) {
        WinkelWagenId = winkelWagenId;

    }

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

    }

    public void betalen(){

    }

}
