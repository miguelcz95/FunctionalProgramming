package ejerciciofunction;

import java.util.Objects;
import java.util.function.IntFunction;
import java.util.logging.Logger;

public class TestFunction {

    private static final Logger LOGGER = Logger.getLogger(TestFunction.class.getName());

    public static void main(String[] args) {
        IntFunction<String> convertidor = Objects::toString;

        LOGGER.info(Integer.toString(convertidor.apply(45456456).length()));

    }
}
