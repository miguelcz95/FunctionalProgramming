import service.FunctionTest;

public class Main {

    public static void main(String[] args) {
        FunctionTest functionTest = () -> System.out.println("Hola Mundo");

        functionTest.saludar();

        Main main = new Main();
        main.MiMetodo(functionTest);

    }

    public void MiMetodo(FunctionTest parametro) {
        parametro.saludar();
    }
}
