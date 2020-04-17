package formatieveopdrach1A;

public class Klant {

    private String naam;
    private double kortingPercentage;

    public Klant(String nm) {
        naam = nm;
    }

    public void setKorting(double kP){
        this.kortingPercentage = kP;
    }

    public double getKorting(){
        return kortingPercentage;
    }
}
















