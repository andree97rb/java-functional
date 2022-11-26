package functional.foreach;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person("Richard", "Ramos", LocalDate.of(1997,2,15),"Masculino");
        Person person2 = new Person("Andreee", "Ramos", LocalDate.of(1987,4,1),"Masculino");
        Person person3 = new Person("Rafael", "Ramirez", LocalDate.of(1990,10,21),"Masculino");
        Person person4 = new Person("Juan", "Galvez", LocalDate.of(2000,8,30),"Masculino");
        Person person5 = new Person("Mariana", "Cruz", LocalDate.of(2004,7,16),"Masculino");
        Person person6 = new Person("Carlos", "Carlo", LocalDate.of(1995,2,17),"Masculino");
        Person person7 = new Person("María", "Santos", LocalDate.of(1993,1,1),"Masculino");
        Person person8 = new Person("Ana", "Alburqueque", LocalDate.of(1994,11,3),"Masculino");

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);

        //personList.forEach(System.out::println);
        var array= personList.toArray();
        Arrays.asList(array).forEach(System.out::println);

        Stream.of(personList).forEach(System.out::println);

        personList.stream().forEach(System.out::println);

    }
}