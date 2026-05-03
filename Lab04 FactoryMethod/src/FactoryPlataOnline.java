public class FactoryPlataOnline implements Factory{
    @Override
    public Plata createPlata() {
        return new PlataOnline();
    }
}
