package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Touro extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.APRIL, 21);
    private final MonthDay dataFinal = MonthDay.of(Month.MAY, 20);

    @Override
    protected String getSignoName() {
        return "Touro";
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
        return Signos.TOURO.getIdentificador();
    }
}
