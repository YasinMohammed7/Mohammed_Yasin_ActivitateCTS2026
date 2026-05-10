public class ContBancarEager {
    private String iban;
    private float sold;
    private static ContBancarEager instanta = new ContBancarEager("RO48785748", 40);

    public ContBancarEager(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public static ContBancarEager getInstanta() {
        return instanta;
    }
}
