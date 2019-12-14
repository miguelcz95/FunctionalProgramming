package Ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio1.class.getName());


    public static void main(String[] args) {
        Ejercicio1FunctionTest ejercicio1FunctionTest = () -> LOGGER.log(Level.INFO, "Hola Mundo");

        ejercicio1FunctionTest.saludar();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.miMetodo(ejercicio1FunctionTest);

    }

    public void miMetodo(Ejercicio1FunctionTest parametro) {
        parametro.saludar();
    }
}
