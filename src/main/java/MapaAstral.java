import signos.Signo;
import signos.Verificador.Verificador;

import java.text.Normalizer;
import java.time.*;
import java.util.Set;
import java.util.TimeZone;

public class MapaAstral {
    private final LocalDateTime dataEHoraNascimento;
    private final Verificador verificador = new Verificador();
    private final String localDeNascimento;
    private Signo signo;

    public MapaAstral(LocalDateTime localDateTime, String localDeNascimento) {
        this.dataEHoraNascimento = localDateTime;
        this.localDeNascimento = formatarLocalDeNascimento(localDeNascimento);
    }

    public void getSol() {
        signo = verificador.descobrirSigno(LocalDate.of(dataEHoraNascimento.getYear(), dataEHoraNascimento.getMonth(), dataEHoraNascimento.getDayOfMonth()));
        signo.imprimirSigno();
    }

    public void getAscendente() {
        Signo ascendente = verificador.descobrirAscendente(this.signo, LocalTime.of(dataEHoraNascimento.getHour(), dataEHoraNascimento.getMinute()));
        ascendente.imprimirAscendente();
    }

    public void getIdade() {
        Period period = Period.between(dataEHoraNascimento.toLocalDate(), LocalDate.now());
        System.out.println("Sua idade é " + period.getYears());
    }

    public void isAnoBissexto() {
        int anoDeNascimento = dataEHoraNascimento.getYear();
        if (Year.isLeap(anoDeNascimento)){
            System.out.println("Ano Bissexto");
        }else {
            System.out.println("Ano Não Bissexto");
        }
    }

    public void getTimeZone() {
        Set<String> zones = ZoneId.getAvailableZoneIds();
        for (String zone : zones) {
            if (zone.contains(localDeNascimento)) {
                ZoneId zoneId = ZoneId.of(zone);
                System.out.println(TimeZone.getTimeZone(zoneId).getDisplayName());
            }
        }
    }

    public void getSignoLunar() {
        LocalDateTime dataDeNascimentoAoMeioDia = LocalDateTime.of(dataEHoraNascimento.toLocalDate(), LocalTime.of(12, 0));
        if ("Recife".equals(localDeNascimento) && dataEHoraNascimento.isAfter(dataDeNascimentoAoMeioDia)) {
            System.out.println("Casimiro");
        } else if ("Cuiaba".equals(localDeNascimento) && dataEHoraNascimento.isBefore(dataDeNascimentoAoMeioDia)) {
            System.out.println("Odin");
        } else if ("Sao_Paulo".equals(localDeNascimento)) {
            System.out.println("Gandalf");
        } else {
            System.out.println("Em construção");
        }
    }

    private static String formatarLocalDeNascimento(String localDeNascimento) {
        String localDeNascimentoSemAcento = Normalizer.normalize(localDeNascimento, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        return localDeNascimentoSemAcento.replaceAll(" ", "_");
    }
}
