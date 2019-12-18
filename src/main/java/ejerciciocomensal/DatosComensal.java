package ejerciciocomensal;

import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatosComensal {

    static final Logger LOGGER = Logger.getLogger(DatosComensal.class.getName());

    public static void main(String[] args) {
        Comensal comensal = new Comensal("Miguel", 123, 4);
        LOGGER.log(Level.FINE,"Datos del comensal"
                + getDatoComensal(comensal, Comensal::getNombre) + "\n"
                + getDatoComensal(comensal, Comensal::getMontoPedido) + "\n"
                + getDatoComensal(comensal, Comensal::getMesa));
    }

    public static Object getDatoComensal(Comensal comensal, Function<Comensal, Object> function) {
        return function.apply(comensal);
    }

}
