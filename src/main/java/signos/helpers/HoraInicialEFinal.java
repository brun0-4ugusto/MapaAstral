package signos.helpers;

import java.time.LocalTime;

public class HoraInicialEFinal {
    private LocalTime horaInicial;
    private LocalTime horaFinal;

    public HoraInicialEFinal(LocalTime horaInicial, LocalTime horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }
}
