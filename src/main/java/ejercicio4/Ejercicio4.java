package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        //Forma 1
        engine((int x, int y) -> x + y);

        engine((long x, long y) -> x - y);

        //Forma2
        engine((CalculadoraLong) (x, y) -> x + y);

        //Forma3
        CalculadoraInt calInt = (x, y) -> x + y;
        engine(calInt);

        CalculadoraInt calLong = (x, y) -> x + y;
        engine(calLong);
    }

    public static void engine(CalculadoraInt cal) {
        cal.calculate(5, 6);
    }

    public static void engine(CalculadoraLong cal) {
        cal.calculate(4, 5);
    }

}
