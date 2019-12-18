package ejerciciouno;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio1 {

    public static final Logger LOGGER = Logger.getLogger(Ejercicio1.class.getName());


    public static void main(String[] args) {
        SaludarFunctionTest saludarFunctionTest = () -> LOGGER.log(Level.INFO, "Hola Mundo");

        saludarFunctionTest.saludar();

        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.miMetodo(saludarFunctionTest);

    }

    public void miMetodo(SaludarFunctionTest parametro) {
        parametro.saludar();
    }
}
