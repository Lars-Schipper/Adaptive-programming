package summatieveopdr1;

public class Klant {

    private String naam;
    private int userId;
    private String email;
    private String betaalGegevens;
    private String adres;


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public String setEmail(String email) {
        this.email = email;
        return email;
    }

    public String getBetaalGegevens() {
        return betaalGegevens;
    }

    public void setBetaalGegevens(String betaalGegevens) {
        this.betaalGegevens = betaalGegevens;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void login(String mail){
        if(mail == email){
            System.out.println("logging in.....");
            System.out.println("welkom terug " + naam + ", u bent nu ingelogd");

        }

        else{
            System.out.println("u heeft nog geen account. maak een account aan");
        }

    }

    public void registreer(){


    }

    public void acountInstellingen(){

    }
}
