import metodaPlata.InitializarePlata;
import metodaPlata.MetodaPlata;

public class Program {
    public static void main(String[] args) {
        MetodaPlata metodaPlata = new MetodaPlata("card", 233.4);
        InitializarePlata plataInitializata = new InitializarePlata(metodaPlata);

        System.out.println(plataInitializata.toString());
        plataInitializata.initializarePlata();

        MetodaPlata metodaPlata1 = new MetodaPlata("online stripe", 245.3);
        AdaptorPlata adaptorPlata = new AdaptorPlata(metodaPlata1);

        adaptorPlata.descriere();
        adaptorPlata.plateste();
    }
}
