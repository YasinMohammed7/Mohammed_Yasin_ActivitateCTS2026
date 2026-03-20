public class ContBancarStaticBlock {
    private String iban;
    private float sold;
    private static ContBancarStaticBlock instanta;

    static {
        try {
            instanta = new ContBancarStaticBlock("RO648758", 79);
        } catch (Exception e) {
            System.out.println("Contul bancar nu poate fi creat");
        }
    }

    public ContBancarStaticBlock(String iban, float sold) {
        this.iban = iban;
        this.sold = sold;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public static ContBancarStaticBlock getInstanta() {
        return instanta;
    }
}
