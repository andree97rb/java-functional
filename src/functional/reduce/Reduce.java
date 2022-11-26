package functional.reduce;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);

        int number =
                numbers.stream()
                .reduce(0,(acumulator, element)-> acumulator+element);
        System.out.println(number);
    }
}
