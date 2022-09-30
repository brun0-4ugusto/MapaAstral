import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Main {
    public static void main(String[] args) {

        MapaAstral mapaAstral = new MapaAstral(LocalDateTime.of(1968, Month.DECEMBER, 16, 10, 10), "São Paulo");
        mapaAstral.getSol();
        mapaAstral.getAscendente();
        mapaAstral.getIdade();
        mapaAstral.isAnoBissexto();
        mapaAstral.getTimeZone();
        mapaAstral.getSignoLunar();
    }
}
