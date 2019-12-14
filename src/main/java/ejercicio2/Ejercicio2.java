package ejercicio2;

import java.util.logging.Logger;

public class Ejercicio2 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {
        OperacionesFunctionTest functionTest = (num1, num2) -> LOGGER.info(num1 + " + " + num2 + " = " + (num1 + num2));
        functionTest.ImprimirOperacion(1, 2);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.miMetodo((num1, num2) -> LOGGER.info("Hola"+num1+num2), 1, 6);
    }

    public void miMetodo(OperacionesFunctionTest functionTest, int num1, int num2) {
        functionTest.ImprimirOperacion(num1, num2);
    }
}
