package signos.enums;

import signos.*;

public enum Signos {
    ARIES(0,new Aries()),
    TOURO(1,new Touro()),
    GEMEOS(2,new Gemeos()),
    CANCER(3,new Cancer()),
    LEAO(4,new Leao()),
    VIRGEM(5,new Virgem()),
    LIBRA(6,new Libra()),
    ESCORPIAO(7,new Escorpiao()),
    SAGITARIO(8,new Sagitario()),
    CAPRICORNIO(9,new Capricornio()),
    AQUARIO(10,new Aquario()),
    PEIXES(11,new Peixes());


    private final Signo instance;
    private final int identificador;
    private Signos(int identificador, Signo signo) {
        this.instance = signo;
        this.identificador = identificador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Signo getInstance() {
        return instance;
    }


}
