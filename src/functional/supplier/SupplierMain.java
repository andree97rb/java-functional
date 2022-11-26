package functional.supplier;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<LocalDate> localDateSupplier = LocalDate::now;
        Random random = new Random();
        Supplier<Integer> randomInt = random::nextInt;
        usingSupplier(localDateSupplier);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
        usingSupplier(randomInt);
    }

    static <T> void usingSupplier(Supplier<T> supplier){
        System.out.println("Ejecutando código...");
        System.out.println("Se obtiene: " + supplier.get());
    }
}
