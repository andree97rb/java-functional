package functional.optional;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        Optional<String> value = Optional.ofNullable(null);
        Runnable runnable = () -> System.out.println("No hay dato");
        value.ifPresentOrElse(System.out::println, runnable);
    }
}
