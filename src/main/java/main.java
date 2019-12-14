import service.FunctionTest;

public class main {

    public static void main(String[] args) {
        FunctionTest functionTest = () -> System.out.println("Hola Mundo");

        functionTest.saludar();
    }
}
