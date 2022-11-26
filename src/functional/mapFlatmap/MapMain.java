package functional.mapFlatmap;

import java.util.stream.Stream;

public class MapMain {
    public static void main(String[] args) {
        Stream.of('1','2','3')
                .map(String::valueOf)
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
