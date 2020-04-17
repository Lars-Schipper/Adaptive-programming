package formatieveopdrach1A;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String type, double prijsPerDag){
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag(double prPd){
        prijsPerDag = prPd;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public String toString() {
        return "autotye: " + type + " met de prijs per dag: "  + prijsPerDag;
    }
}

