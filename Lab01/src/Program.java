public class Program {
    public static void main(String[] args) {
        ContBancar c1 = ContBancar.getInstanta();
        ContBancar c2 = ContBancar.getInstanta();

        c2.setIban("RO5656REV");
        System.out.println(c1.getIban());
    }
}
