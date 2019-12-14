package Ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio2 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio2.class.getName());

    public static void main(String[] args) {
        Ejercicio2FunctionTest functionTest = (num1, num2) -> LOGGER.log(Level.INFO, num1 + " + " + num2 + " = " + (num1 + num2));
        functionTest.ImprimirSuma(1, 2);

        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.MiMetodo(functionTest, 1, 6);
    }

    public void MiMetodo(Ejercicio2FunctionTest functionTest, int num1, int num2) {
        functionTest.ImprimirSuma(num1, num2);
    }
}
