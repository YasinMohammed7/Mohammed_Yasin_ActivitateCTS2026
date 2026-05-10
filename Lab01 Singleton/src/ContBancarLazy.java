public class ContBancarLazy {
    private String iban;
    private float sold;
    private static ContBancarLazy instanta = null;

    private ContBancarLazy(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public static ContBancarLazy getInstanta() {
        if (instanta == null) {
            instanta = new ContBancarLazy("RO BRD3746376", 50);
        }
        return instanta;
    }
}
