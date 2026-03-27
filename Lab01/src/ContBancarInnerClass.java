public class ContBancarInnerClass {
    private String iban;
    private float sold;

    private static class ContBancarHelper {
        private static final ContBancarInnerClass instanta = new ContBancarInnerClass("ROhelperClass", 56);
    }

    public static ContBancarInnerClass getInstanta() {
        return ContBancarHelper.instanta;
    }

    private ContBancarInnerClass(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
