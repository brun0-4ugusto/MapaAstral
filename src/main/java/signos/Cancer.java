package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Cancer extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.JUNE, 21);
    private final MonthDay dataFinal = MonthDay.of(Month.JULY, 21);

    @Override
    protected String getSignoName() {
        return "Cancer";
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
        return Signos.CANCER.getIdentificador();
    }
}
