package formatieveopdrach1A;

public class Autohuur {

    private int aantalDagen;
    private Auto gehuurdeauto;
    private Klant huurder;


    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeauto = gA;
    }

    public Auto getGehuurdeauto() {
        return gehuurdeauto;
    }

    public void setHuurder(Klant K){
        huurder = K;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(Auto auto){
        double totaalPrijs = auto.getPrijsPerDag() * aantalDagen;
        double korting = totaalPrijs * (100 - huurder.getKorting())/100;
        return korting;
    }

    @Override
    public String toString() {
        return "Autohuur{" +
                "aantalDagen=" + aantalDagen +
                ", gehuurdeauto=" + gehuurdeauto +
                ", huurder=" + huurder +
                '}';
    }
}








