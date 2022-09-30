package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Libra extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.SEPTEMBER, 23);
    private final MonthDay dataFinal = MonthDay.of(Month.OCTOBER, 22);

    @Override
    protected String getSignoName() {
        return "Libra";
    }

    @Override
    public MonthDay getDataInicial() {
        return dataInicial;
    }

    @Override
    public MonthDay getDataFinal() {
        return dataFinal;
    }

    @Override
    public int getIdentificador() {
        return Signos.LIBRA.getIdentificador();
    }
}
