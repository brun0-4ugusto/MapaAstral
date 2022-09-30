package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Capricornio extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.DECEMBER, 22);
    private final MonthDay dataFinal = MonthDay.of(Month.JANUARY, 20);

    @Override
    protected String getSignoName() {
        return "Capricórnio";
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
        return Signos.CAPRICORNIO.getIdentificador();
    }
}
