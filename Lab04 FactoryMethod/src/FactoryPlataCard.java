public class FactoryPlataCard implements Factory {
    @Override
    public Plata createPlata() {
        return new PlataCard();
    }
}
