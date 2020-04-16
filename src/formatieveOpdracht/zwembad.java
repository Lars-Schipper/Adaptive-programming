package formatieveOpdracht;

public class zwembad {

    public static void main(String[] args){


        double inhoudZwembad1;

        afmetingen afmeting1 = new afmetingen(2.0, 5.5, 1.5);

        inhoudZwembad1 = afmeting1.lengte * afmeting1.breete * afmeting1.diepte;
        System.out.println("de inhoud van zwembad 1 is " + inhoudZwembad1 + " kubike meter");
    }
}
