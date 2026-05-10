package metodaPlata;

public class InitializarePlata {
    private MetodaPlata metodaPlata;

    public InitializarePlata(MetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void initializarePlata() {
        System.out.println("A fost initializata plata " + metodaPlata.toString());
    }

    @Override
    public String toString() {
        return "InitializarePlata{" +
                "metodaPlata=" + metodaPlata +
                '}';
    }
}
