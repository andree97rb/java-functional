package functional.conumerBiconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerMain {
    static List<Object> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("Hello world");
        list.add(2020);
        list.add(true);
        list.add(48.8f);
        //usingBiCosumer(4, 3, (a,b)-> System.out.println(a+b));

        usingBiCosumer2(
                4,
                3,
                list::add,
                (a,b)-> System.out.println(a+b),
                (b,c)-> System.out.println(c+b)
        );
    }

    private static <T,U> void usingBiCosumer2(T value1, U value2, BiConsumer<T,U> biConsumer, BiConsumer<T,U> biConsumer2, BiConsumer<T,U> biConsumer3) {
        biConsumer.andThen(biConsumer2).andThen(biConsumer3)
                .accept(value1,value2);
    }

    private static <T,U> void usingBiCosumer(T value1, U value2, BiConsumer<T,U> biConsumer) {
        biConsumer.accept(value1, value2);
        list.forEach(System.out::println);
    }


}
