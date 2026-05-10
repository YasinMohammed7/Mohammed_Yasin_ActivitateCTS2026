public class Program {
    public static void main(String[] args) {
        ContBancarLazy c1 = ContBancarLazy.getInstanta();
        ContBancarLazy c2 = ContBancarLazy.getInstanta();

        c2.setIban("RO5656REV");
        System.out.println(c1.getIban());

        ContBancarStaticBlock c3 = ContBancarStaticBlock.getInstanta();
        ContBancarStaticBlock c4 = ContBancarStaticBlock.getInstanta();
        c4.setIban("ROBCR");

        System.out.println(c3.getIban());
        System.out.println(c4.getIban());

        System.out.println(c1 == c2);
    }
}
