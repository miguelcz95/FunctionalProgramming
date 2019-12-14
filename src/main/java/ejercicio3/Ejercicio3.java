package ejercicio3;

import java.util.logging.Logger;

public class Ejercicio3 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio3.class.getName());

    public static void main(String[] args) {
        engine((x,y) -> x+y);
        engine((x,y) -> x-y);
        engine((x,y) -> x/y);
        engine((x,y) -> x*y);
    }

    private static void engine(Calculadora cal) {
        int x = 2, y = 4;
        int result = cal.calcular(x,y);
        LOGGER.info("Resultado: "+result);
    }
}
