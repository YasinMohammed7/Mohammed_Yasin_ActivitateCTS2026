public class Program {
    public static void main(String[] args) {
        ProdusFactura produsBucatarie = new ProdusBucatarie();
        produsBucatarie.descriere();
        produsBucatarie.printeaza();

        ProdusBar produsBar = new ProdusBar("Tequila", 23.4);
        ProdusBarComandat produsBarComandat = new ProdusBarComandat(produsBar);

        System.out.println(produsBarComandat.toString());
        produsBarComandat.comandaProdusBar();

        ProdusBar produsBar1 = new ProdusBar("Gin", 67.5);
        ProdusBarComandat produsBarComandat1 = new ProdusBarComandat(produsBar1);

        ProdusFactura adapterProdusBar = new AdapterProdusBar(produsBarComandat1);
        adapterProdusBar.descriere();
        adapterProdusBar.printeaza();
    }
}
