package metodaPlata;

public class MetodaPlata {
    private String denumire;
    private double suma;

    public MetodaPlata(String denumire, double suma) {
        this.denumire = denumire;
        this.suma = suma;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getSuma() {
        return suma;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "MetodaPlata{" +
                "denumire='" + denumire + '\'' +
                ", suma=" + suma +
                '}';
    }
}
