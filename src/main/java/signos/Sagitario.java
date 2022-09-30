package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Sagitario extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.NOVEMBER, 22);
    private final MonthDay dataFinal = MonthDay.of(Month.DECEMBER, 21);

    @Override
    protected String getSignoName() {
        return "Sagitario";
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
        return Signos.SAGITARIO.getIdentificador();
    }
}
