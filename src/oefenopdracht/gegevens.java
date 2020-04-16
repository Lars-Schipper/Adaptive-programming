package oefenopdracht;

public class gegevens {

    public static void main(String[] args){

        student student1 = new student("lars", 18, 3, "geen" );

        System.out.println("NAAM: " + student1.naam);
        System.out.println("LEEFTIJD: " + student1.leeftijd);
        System.out.println("CIJFERS: "+ student1.cijferlijst);
        System.out.println("HUISDIER " + student1.huisdier);

    }
}
