public class FactoryPlataCash implements Factory {
    @Override
    public Plata createPlata() {
        return new PlataCash();
    }
}
