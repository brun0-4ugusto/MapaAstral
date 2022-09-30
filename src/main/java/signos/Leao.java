package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Leao extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.JULY, 22);
    private final MonthDay dataFinal = MonthDay.of(Month.AUGUST, 22);

    @Override
    protected String getSignoName() {
        return "Leao";
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
        return Signos.LEAO.getIdentificador();
    }
}
