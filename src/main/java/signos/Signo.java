package signos;

import signos.interfaces.PrintableAscendente;
import signos.interfaces.PrintableSigno;

import java.time.MonthDay;

public abstract class Signo implements PrintableSigno, PrintableAscendente {
    @Override
    public final void imprimirSigno() {
        System.out.println("Seu signo é " + getSignoName());
    }
    @Override
    public final void imprimirAscendente() {
        System.out.println("Seu ascendente é " + getSignoName());
    }

    protected abstract String getSignoName();

    public abstract MonthDay getDataInicial();

    public abstract MonthDay getDataFinal();

    public abstract int getIdentificador();
}
