package summatieveopdr1;

public class Main {

    public static void main(String[] args) {



    Klant K1 = new Klant();
    Bestelling Order1 = new Bestelling();
    WinkelWagen cart1 = new WinkelWagen(98723466);


    K1.setNaam("Lars");
    K1.login();
    System.out.println(K1.getNaam());
    System.out.println(cart1.getWinkelWagenId());

    }
}
