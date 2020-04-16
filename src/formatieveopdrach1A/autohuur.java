package formatieveopdrach1A;

public class autohuur {

    public int aantalDagen;
    public static void main(String[] args) {

        Klant Klant1 = new Klant();
        auto auto = new auto("caddelac", 200.00);



        Klant1.setNaam("henk");
        System.out.println(Klant1.getNaam());
    }


    public void setAantalDagen(int aantalDagen){
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(auto){
        this.auto = auto;
    }



}





