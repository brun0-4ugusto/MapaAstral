package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Aries extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.MARCH, 21);
    private final MonthDay dataFinal = MonthDay.of(Month.APRIL, 20);

    @Override
    protected String getSignoName() {
        return "Aries";
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
        return Signos.ARIES.getIdentificador();
    }
}
