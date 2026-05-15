public class Cetatean {
    private String nume;
    private ModVerificare modVerificare;

    void scanare(String actDeIdentitate) {
        modVerificare.scanare(this.nume, actDeIdentitate);
    }

    public ModVerificare getModVerificare() {
        return modVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public Cetatean(String nume, ModVerificare modVerificare) {
        super();
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public Cetatean(String nume) {
        super();
        this.nume = nume;
        this.modVerificare = new CetateanNonUE();
    }
}
