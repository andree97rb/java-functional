package functional.filter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person1 = new Employee("Richard","Ramos","72841548","971254796",12000);
        Person person2 = new Client("Richard","Ramos","72841548","971254796",600);
        Person person3 = new Client("Juana","Gson","72841548","971254796",50);


        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
       /* var count = personList.stream()
                .filter(person -> person instanceof Client)
                .peek((a)-> System.out.println(a + "------------------------------"))
                .filter(client -> ((Client) client).getCrdit()>500)
                .peek((a)-> System.out.println(a + "****************************"))
                        .count();*/

        var bool = personList.stream()
                .filter(person -> person instanceof Client)
                .allMatch(person -> ((Client) person).getCrdit()>500);

        System.out.println(bool);
    }
















}
