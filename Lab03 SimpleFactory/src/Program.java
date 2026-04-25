public class Program {
    public static void main(String[] args) {
        PlataFactory plataFactory = new PlataFactory();
        Plata plata = null;

        try {
            plata = plataFactory.createPlata(MetodaPlata.PlataOnline);
        } catch (Exception e) {
            e.printStackTrace();
        }

        plata.descriere();
    }
}
