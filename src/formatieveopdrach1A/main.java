package formatieveopdrach1A;

public class main {
    public static void main(String[] args) {

        Autohuur ah1 = new Autohuur();
        System.out.println("Eerste autohuur: " + ah1.toString());
        System.out.println();

        Klant K = new Klant("Mijnheer de Vries");
        K.setKorting(10.0);
        ah1.setHuurder(K);
        System.out.println("Eerste autohuur: " + ah1.toString());
        System.out.println();

        Auto a1 = new Auto("peugot 207", 50.00);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
        System.out.println("Eerste autohuur: " + ah1.toString());
        System.out.println();

        Autohuur ah2 = new Autohuur();
        Auto a2 = new Auto("Ferrari", 3500.00);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(K);
        ah2.setAantalDagen(1);
        System.out.println("Tweede autohuur: " + ah2.toString());
        System.out.println();





    }

}
