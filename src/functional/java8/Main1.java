package functional.java8;

public class Main1 {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello world");
        runnable.run();
    }
}
