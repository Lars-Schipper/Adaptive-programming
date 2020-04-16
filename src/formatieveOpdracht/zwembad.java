package formatieveOpdracht;

public class zwembad {

    public static void main(String[] args){


        double inhoudZwembad1;
        double inhoudZwembad2;

        afmetingen afmeting1 = new afmetingen(2.0, 5.5, 1.5);
        afmetingen afmeting2 = new afmetingen(2.5, 100.0, 2.0);

        inhoudZwembad1 = afmeting1.lengte * afmeting1.breete * afmeting1.diepte;
        inhoudZwembad2 = afmeting2.lengte * afmeting2.breete * afmeting2.diepte;

        System.out.println("BREETE: " + afmeting1.breete);
        System.out.println("LENGTE: " + afmeting1.lengte);
        System.out.println("DIEPTE: " + afmeting1.diepte);
        System.out.println("BERKENEDE INHOUD: " + inhoudZwembad1);
        System.out.println("GEGEVENS ZWEMBAD: Dit zwembad heeft is " + afmeting2.breete + " meter breed, " + afmeting2.lengte + " meter lang, en " + afmeting2.diepte + " meter diep ");
        System.out.println("BERKENEDE INHOUD: " + inhoudZwembad2);


        }
}
