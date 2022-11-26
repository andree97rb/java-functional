package functional.java9;

import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> list = List.of("one", "two", "three");

        list.forEach(System.out::println);
    }
}
