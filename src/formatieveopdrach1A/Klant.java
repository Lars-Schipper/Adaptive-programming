package formatieveopdrach1A;

public class Klant {

    private String naam;
    private double kortingPercentage;

    public Klant naam(naam){
    this.naam = naam;
    }

    public void setKorting(double kortingPercentage){
        this.kortingPercentage = kortingPercentage;
    }

    public double getKorting(){
        return kortingPercentage;
    }

    public String toString(){
        return Klant(naam) + "" + setKorting(kortingPercentage) + "" + getKorting();
    }

}
















