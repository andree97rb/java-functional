package functional.function;

import java.time.LocalDate;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        var chain = new StringBuilder("Usando Interfaz");
        Function<StringBuilder, String> stringBuilderStringFunction = a -> a.append("Function")
                        .toString();

        System.out.println(usingFunction(stringBuilderStringFunction, chain));

    }

    private static <T,R> R usingFunction(Function<T,R> fn, T value){
        return fn.apply(value);
    }

}
