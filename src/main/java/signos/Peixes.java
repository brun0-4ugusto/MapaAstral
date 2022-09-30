package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Peixes extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.FEBRUARY, 20);
    private final MonthDay dataFinal = MonthDay.of(Month.MARCH, 20);

    @Override
    protected String getSignoName() {
        return "Peixes";
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
        return Signos.PEIXES.getIdentificador();
    }
}
