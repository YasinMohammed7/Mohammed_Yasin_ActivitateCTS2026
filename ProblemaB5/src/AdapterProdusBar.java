public class AdapterProdusBar implements ProdusFactura{
    private ProdusBarComandat produsBarComandat;

    public AdapterProdusBar(ProdusBarComandat produsBarComandat) {
        this.produsBarComandat = produsBarComandat;
    }

    @Override
    public void descriere() {
        System.out.println(this.produsBarComandat.toString());
    }

    @Override
    public void printeaza() {
        this.produsBarComandat.comandaProdusBar();
    }
}
