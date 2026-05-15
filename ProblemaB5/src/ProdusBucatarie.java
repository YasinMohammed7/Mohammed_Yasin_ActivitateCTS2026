public class ProdusBucatarie implements ProdusFactura {
    @Override
    public void descriere() {
        System.out.println("Acest produs este de la bucatarie");
    }

    @Override
    public void printeaza() {
        System.out.println("A fost printata factura pentru un produs de la bucatarie");
    }
}