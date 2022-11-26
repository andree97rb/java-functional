package functional.conumerBiconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerMain {

    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Hello world");
        list.add(2020);
        list.add(true);
        list.add(48.8f);
        usingConusmer("Soy un genérico", a-> System.out.println(a+" x "), list::add, ConsumerMain::print);
    }

    private static <T> void print(T vaule) {
        System.out.println("Impreso desde la funcion print " + vaule);
        list.forEach(System.out::println);
    }

    private static <T> void usingConusmer(T value, Consumer<T> consumer, Consumer<T> consumer2, Consumer<T> consumer3) {
        var consumerCompleted= consumer.andThen(consumer2)
                .andThen(consumer3);
        consumerCompleted.accept(value);
    }
}
