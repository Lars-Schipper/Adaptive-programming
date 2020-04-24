package summatieveopdr1;

public class Bestelling {



    private String naam;
    private String Adres;
    private String email;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return Adres;
    }

    public void setAdres(String adres) {
        Adres = adres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String naamString;
        String adresString;
        String emailString;

        if(naam == null){
            naamString = "voer eerst uw naam in";
            return naamString;
        }
        else{
            naamString = "hallo " + naam + ", uw bestelling wordt naar: ";
        }

        if(Adres == null){
            adresString = "voer eerst uw adres in";
            return adresString;
        }
        else{
            adresString = Adres + " verzonden. ";
        }
        if(email == null){
            emailString = "voer eerst uw email in";
            return emailString;
        }
        else{
            emailString = "u zult conformatie ontvangen op het emailadres: " + email;
        }

        if((naam != null) && (Adres != null) && (email != null)){
            return naamString + adresString + emailString;
        }

        return null;
    }
}
