import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        MapaAstral mapaAstral = new MapaAstral(LocalDateTime.of(1968, Month.JANUARY, 16, 12, 10), "São Paulo");
        mapaAstral.getSol();
        mapaAstral.getAscendente();
        mapaAstral.getIdade();
        mapaAstral.isAnoBissexto();
        mapaAstral.getTimeZone();
        mapaAstral.getSignoLunar();
    }
}
