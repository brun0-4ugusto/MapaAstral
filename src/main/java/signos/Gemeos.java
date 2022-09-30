package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Gemeos extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.MAY, 21);
    private final MonthDay dataFinal = MonthDay.of(Month.JUNE, 20);

    @Override
    protected String getSignoName() {
        return "Gemeos";
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
        return Signos.GEMEOS.getIdentificador();
    }
}
