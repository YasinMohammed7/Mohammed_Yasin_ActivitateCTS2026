public class ProdusBarComandat {
    private ProdusBar produsBar;

    public ProdusBarComandat(ProdusBar produsBar) {
        this.produsBar = produsBar;
    }

    void comandaProdusBar() {
        System.out.println("A fost comandata produsul de la bar " + produsBar.toString());
    }

    @Override
    public String toString() {
        return "ProdusBarComandat{" +
                "produsBar=" + produsBar +
                '}';
    }
}
