public class ContBancar2 {
    private String iban;
    private float sold;
    private static ContBancar2 instanta = new ContBancar2("RO48785748", 40);

    public ContBancar2(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public static ContBancar2 getInstanta() {
        return instanta;
    }
}
