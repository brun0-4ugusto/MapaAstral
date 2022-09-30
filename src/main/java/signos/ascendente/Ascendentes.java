package signos.ascendente;

import signos.enums.Horas;
import signos.enums.Signos;

public abstract class Ascendentes {
    public static int[][] ascendentes = new int[12][12];
    
    static  {
        for (Signos signos : Signos.values()) {
        int countSignos = signos.getIdentificador();
            for (Horas horas : Horas.values()) {
                if (countSignos < 12) {
                    ascendentes[signos.getIdentificador()][horas.getIdentificador()] = countSignos;
                }else {
                    ascendentes[signos.getIdentificador()][horas.getIdentificador()] = (countSignos % 12 );
                }

                countSignos++;
            }
        }
    }

    //Baseado na tabelinha de ascendentes
    // https://www.horoscopovirtual.com.br/imagem/artigos/interno/images/Descubra%20o%20seu%20Ascendente%20(1)(12).jpg
}
