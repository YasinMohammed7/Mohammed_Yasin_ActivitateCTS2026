public class Program {
    public static void main(String[] args) {
        FactoryPlataCard factoryPlataCard = new FactoryPlataCard();
        Plata plataCard = factoryPlataCard.createPlata();
        plataCard.descriere();
    }
}
