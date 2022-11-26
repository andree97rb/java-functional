package functional.optional;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        var optional = Optional.ofNullable("rr").orElse("nada");

        System.out.println(optional);
    }
}
