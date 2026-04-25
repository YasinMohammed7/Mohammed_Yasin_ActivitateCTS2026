public class PlataFactory {
    public Plata createPlata(MetodaPlata metodaPlata) throws Exception {
        switch(metodaPlata) {
            case PlataCash:
                return new PlataCash();
            case PlataCard:
                return new PlataCard();
            case PlataOnline:
                return new PlataOnline();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}
