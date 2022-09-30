package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Aquario extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.JANUARY, 21);
    private final MonthDay dataFinal = MonthDay.of(Month.FEBRUARY, 19);

    @Override
    protected String getSignoName() {
        return "Aquario";
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
        return Signos.AQUARIO.getIdentificador();
    }
}
