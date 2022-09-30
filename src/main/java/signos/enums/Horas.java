package signos.enums;

import signos.helpers.HoraInicialEFinal;

import java.time.LocalTime;

public enum Horas {
    SEIS31_OITO30(0,new HoraInicialEFinal(LocalTime.of(6,31),LocalTime.of(8,30))),
    OITO31_DEZ30(1,new HoraInicialEFinal(LocalTime.of(8,31),LocalTime.of(10,30))),
    DEZ31_DOZE30(2,new HoraInicialEFinal(LocalTime.of(10,31),LocalTime.of(12,30))),
    DOZE31_CATORZE30(3,new HoraInicialEFinal(LocalTime.of(12,31),LocalTime.of(14,30))),
    CATORZE31_DEZESSEIS30(4,new HoraInicialEFinal(LocalTime.of(14,31),LocalTime.of(16,30))),
    DEZESSEIS31_DEZOITO30(5,new HoraInicialEFinal(LocalTime.of(16,31),LocalTime.of(18,30))),
    DEZOITO31_VINTE30(6,new HoraInicialEFinal(LocalTime.of(18,31),LocalTime.of(20,30))),
    VINTE31_VINTEDOIS30(7,new HoraInicialEFinal(LocalTime.of(20,31),LocalTime.of(22,30))),
    VINTEDOIS31_ZERO30(8,new HoraInicialEFinal(LocalTime.of(22,31),LocalTime.of(0,30))),
    ZERO31_DUAS30(9,new HoraInicialEFinal(LocalTime.of(0,31),LocalTime.of(2,30))),
    DUAS31_QUATRO30(10,new HoraInicialEFinal(LocalTime.of(2,31),LocalTime.of(4,30))),
    QUATRO31_SEIS30(11,new HoraInicialEFinal(LocalTime.of(4,31),LocalTime.of(6,30)));

    private final HoraInicialEFinal horaInicialEFinal;
    private final int identificador;
    private Horas(int identificador, HoraInicialEFinal horaInicialEFinal){
        this.horaInicialEFinal = horaInicialEFinal;
        this.identificador = identificador;
    }

    public HoraInicialEFinal getHoraInicialEFinal() {
        return horaInicialEFinal;
    }

    public int getIdentificador() {
        return identificador;
    }
}
