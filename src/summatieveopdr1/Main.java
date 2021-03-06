package summatieveopdr1;

public class Main {

    public static void main(String[] args) {

    Klant K1 = new Klant();
    WinkelWagen cart1 = new WinkelWagen();

    // inloggen met account
    K1.setNaam("Lars");
    K1.setAdres("breukelen");
    K1.setBetaalGegevens("ING");
    K1.setEmail("1234@gmail.com");
    String mail = K1.getEmail();
    K1.setUserId(1);
    K1.login(mail);
    System.out.println();

    //geen gegevens van het winkelwagentje
    System.out.println(cart1.toString());
    System.out.println();

    //wel een winkelwagentje geen product
    cart1.setWinkelWagenId(1);
    System.out.println(cart1.toString());
    System.out.println();

    // winkelmandje vullen met een product
    cart1.setWinkelWagenId(2);
    cart1.setProductId(20010);
    cart1.setAantal(2);
    System.out.println(cart1.toString());
    System.out.println();

    //Bestelling plaatsen zonder mailadres
    Bestelling order1 = new Bestelling();
    K1.setEmail(null);
    order1.setNaam(K1.getNaam());
    order1.setAdres(K1.getAdres());
    order1.setEmail(K1.getEmail());
    System.out.println(order1.toString());
    System.out.println();

    //correcte bestelling plaatsen
    K1.setEmail("2345@gmail.com");
    order1.setNaam(K1.getNaam());
    order1.setAdres(K1.getAdres());
    order1.setEmail(K1.getEmail());
    System.out.println(order1.toString());
    System.out.println();

    //bestelling gegevens genereren
    BestellingGegevens order1Info = new BestellingGegevens();
    order1Info.setBestellingId(10);
    order1Info.setProductId(cart1.getProductId());
    order1Info.setAantal(cart1.getAantal());
    System.out.println(order1Info.toString());
    System.out.println();

    VerzendingsInformatie shippingInfo1 = new VerzendingsInformatie();
    shippingInfo1.setVerzendingId(18985246);
    shippingInfo1.setTraceerCode("adskjfh874623965dsgfg4");
    shippingInfo1.setAdres(K1.getAdres());
    shippingInfo1.setNaam(K1.getNaam());
    System.out.println(shippingInfo1.toString());
    }
}
