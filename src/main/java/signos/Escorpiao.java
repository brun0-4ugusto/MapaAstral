package signos;

import signos.enums.Signos;

import java.time.Month;
import java.time.MonthDay;

public class Escorpiao extends Signo {
    private final MonthDay dataInicial = MonthDay.of(Month.OCTOBER, 23);
    private final MonthDay dataFinal = MonthDay.of(Month.NOVEMBER, 21);

    @Override
    protected String getSignoName() {
        return "Escorpiao";
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
        return Signos.ESCORPIAO.getIdentificador();
    }
}
