public class Program {
    public static void main(String[] args) {
        PachetFarmacie pachetFarmacie = PachetFarmacie.builder().setHasCrema(true).setHasComprimate(true).build();
        System.out.println(pachetFarmacie.isHasComprimate());
    }
}
