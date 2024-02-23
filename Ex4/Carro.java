package Ex4;

import java.util.Calendar;

public class Carro {
    String modelo, cor;
    int ano;

    void exibeFicha() {
        System.out.println("***** Ficha técnica *****");
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("**************************");
    }

    int idade() {
        Calendar calendar = Calendar.getInstance();

        return calendar.get(Calendar.YEAR) - ano;
    }
}
