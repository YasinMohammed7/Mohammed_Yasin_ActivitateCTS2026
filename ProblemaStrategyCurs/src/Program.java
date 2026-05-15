public class Program {
    public static void main(String[] args) {
    Cetatean cetatean = new Cetatean("Clooney");

    cetatean.setModVerificare(new CetateanAmerican());
    cetatean.scanare("viza");
    }
}
