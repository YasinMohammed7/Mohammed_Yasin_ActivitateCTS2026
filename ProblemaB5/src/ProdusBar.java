public class ProdusBar {
    private String denumire;
    private double pret;

    public ProdusBar(String denumire, double pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "ProdusBar{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
