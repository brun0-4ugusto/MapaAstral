package signos.Verificador;

import signos.Signo;
import signos.ascendente.Ascendentes;
import signos.enums.Horas;
import signos.enums.Signos;

import java.time.LocalDate;
import java.time.LocalTime;

import static signos.helpers.Helpers.compararDatas;
import static signos.helpers.Helpers.compararHoras;

public class Verificador {
    public Signo descobrirSigno(LocalDate dataDeNascimento) {
        for (Signos signo : Signos.values()) {
            Signo signoInstance = signo.getInstance();
            if (compararDatas(signoInstance, dataDeNascimento)) {
                return signoInstance;
            }
        }
        throw new IllegalArgumentException("Signo nao existe ainda");
    }

    private Signo descobrirSigno(int identificador) {
        for (Signos signo : Signos.values()) {
            if (signo.getIdentificador() == identificador) {
                return signo.getInstance();
            }
        }
        throw new IllegalArgumentException("Signo não Existe");
    }
    public Signo descobrirAscendente(Signo signo, LocalTime horaDeNascimento) {
        for (Horas horas : Horas.values()) {
            if (compararHoras(horaDeNascimento, horas.getHoraInicialEFinal())) {
                int signoIdenficador = Ascendentes.ascendentes[signo.getIdentificador()][horas.getIdentificador()];
                return descobrirSigno(signoIdenficador);
            }
        }
        throw new IllegalArgumentException("Ascendente ainda nao existe");
    }



}
