package summatieveopdr1;

public class Main {

    public static void main(String[] args) {

    Klant K1 = new Klant();
    WinkelWagen cart1 = new WinkelWagen();


    K1.setNaam("Lars");
    K1.setAdres("breukelen");
    K1.setBetaalGegevens("ING");
    K1.setEmail("hello");
    String mail = K1.getEmail();
    K1.setUserId(1);
    K1.login(mail);
    cart1.bekijkWinkleWagentje();




    }
}
