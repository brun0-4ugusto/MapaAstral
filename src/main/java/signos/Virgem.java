package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Virgem extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.AUGUST, 23);
    private final MonthDay dataFinal = MonthDay.of(Month.SEPTEMBER, 22);

    @Override
    protected String getSignoName() {
        return "Virgem";
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
        return Signos.VIRGEM.getIdentificador();
    }
}
