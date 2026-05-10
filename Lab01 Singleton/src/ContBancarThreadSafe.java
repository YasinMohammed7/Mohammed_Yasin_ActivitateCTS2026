public class ContBancarThreadSafe {
    private String iban;
    private float sold;
    private static ContBancarThreadSafe instanta = null;

    private ContBancarThreadSafe(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public static synchronized ContBancarThreadSafe getInstanta() {
        if (instanta == null) {
            instanta = new ContBancarThreadSafe("RO BRDthreadsafe", 50);
        }
        return instanta;
    }
}
