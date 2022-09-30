package signos.helpers;

import signos.Signo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public abstract class Helpers {
    private static boolean isWithinRange(LocalDate dataDeNascimento, LocalDate dataInicial, LocalDate dataFinal) {
        return !(dataDeNascimento.isBefore(dataInicial) || dataDeNascimento.isAfter(dataFinal));
    }

    private static boolean isWithinRange(LocalTime horaDeNascimento, LocalTime horaInicial, LocalTime horaFinal) {
        return !(horaDeNascimento.isBefore(horaInicial) || horaDeNascimento.isAfter(horaFinal));
    }

    public static boolean compararDatas(Signo signo, LocalDate localDate) {

        LocalDate dataInicial = LocalDate.of(localDate.getYear(), signo.getDataInicial().getMonth(), signo.getDataInicial().getDayOfMonth());
        LocalDate dataFinal = LocalDate.of(localDate.getYear(), signo.getDataFinal().getMonth(), signo.getDataFinal().getDayOfMonth());

        if (isCapricornio(signo)) {
            if (localDate.getMonth().equals(Month.DECEMBER)) {
                dataFinal = dataFinal.plusYears(1);
            } else if (localDate.getMonth().equals(Month.JANUARY)) {
                dataInicial = dataInicial.minusYears(1);
            }
        }
        return isWithinRange(localDate, dataInicial, dataFinal);
    }

    public static boolean compararHoras(LocalTime horaDeNascimento, HoraInicialEFinal localTime){
        return isWithinRange(horaDeNascimento,localTime.getHoraInicial(),localTime.getHoraFinal());
    }
    private static boolean isCapricornio(Signo signo) {
        return signo.getClass().getSimpleName().equals("Capricornio");
    }

}
