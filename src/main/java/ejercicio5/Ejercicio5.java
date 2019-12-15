package ejercicio5;

import java.util.logging.Logger;

public class Ejercicio5 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio5.class.getName());

    public static void main(String[] args) {
        LOGGER.info((Long.toString(createInt().calculate(21, 7))));
        LOGGER.info((Long.toString(createLong().calculate(32, 6))));

    }

    public static CalculadoraLong createLong() {
        return ((x, y) -> x / y);
    }

    public static CalculadoraInt createInt() {
        return ((x, y) -> x * y);
    }
}
