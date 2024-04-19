package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("Hello World", 3);
        printMessage("Java", 4);
        printMessage("Hi", 5);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
