import metodaPlata.InitializarePlata;
import metodaPlata.MetodaPlata;

public class AdaptorPlata extends InitializarePlata implements ProcesatorPlata {


    public AdaptorPlata(MetodaPlata metodaPlata) {
        super(metodaPlata);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void plateste() {
        super.initializarePlata();
    }
}
