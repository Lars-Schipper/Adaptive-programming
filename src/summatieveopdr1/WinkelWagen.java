package summatieveopdr1;

import java.sql.ClientInfoStatus;
import java.util.List;

public class WinkelWagen {

    private int WinkelWagenId;
    private int productId;
    private int aantal;
    private List winkelMand;

    public List<String> winkelMand(){
        System.out.print("product x\n");
        System.out.print("product y");

        return winkelMand;
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

    public void betalen(){

    }

    @Override
    public String toString() {
        String WinkelWagenIdString;
        String ProductIdString;
        String AantalString;
        if(WinkelWagenId == 0){
            WinkelWagenIdString = "u heeft een geen winkelmandje";
            return WinkelWagenIdString;
        }
        else{
            WinkelWagenIdString = "Uw winkel wagen ID is: " + WinkelWagenId;

            if(productId == 0){
                ProductIdString = "uw winkelmandje is momenteel leeg";
                return ProductIdString;
            }

            else{
                ProductIdString = ", het product in uw winkelmandje is: " + productId;
                return "hallo " + WinkelWagenIdString + ProductIdString + " en het aantal is: " + aantal;
            }

        }







    }
}
