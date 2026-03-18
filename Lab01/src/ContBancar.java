public class ContBancar {
    private String iban;
    private float sold;
    private static ContBancar instanta = null;

    public ContBancar(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public static synchronized ContBancar getInstanta() {
        if (instanta == null) {
            instanta = new ContBancar("RO BRD3746376", 50);
        }
        return instanta;
    }
}
