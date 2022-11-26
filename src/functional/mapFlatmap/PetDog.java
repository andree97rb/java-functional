package functional.mapFlatmap;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PetDog {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Firulais",5,"Chihuahua");
        Dog dog2 = new Dog("Juancho",5,"Gran Danés");
        Dog dog3 = new Dog("Mesi",3,"Galgo");
        Dog dog4 = new Dog("Claudio",8,"Restriever");
        Dog dog5 = new Dog("Alan",5,"Chihuahua");
        Dog dog6 = new Dog("Pepetris",2,"Pastor Alemán");
        Dog dog7 = new Dog("Stiff",1,"Restriever");
        Dog dog8 = new Dog("Atom",2,"Shar Pei");
        Dog dog9 = new Dog("Carlota",6,"Fox Terrier");
        Dog dog10 = new Dog("Alain",7,"Sabueso");
        Dog dog11 = new Dog("Clous",4,"Bulldog");
        Dog dog12 = new Dog("Cliford",6,"Chihuahua");
        Dog dog13 = new Dog("Petrus",9,"Chihuahua");
        Dog dog14 = new Dog("Clotous",4,"Bulldog");
        Dog dog15 = new Dog("Clis",3,"Bulldog");
        Dog dog16 = new Dog("Andrew",1,"Bulldog");
        Dog dog17 = new Dog("Ross",3,"Bulldog");
        Dog dog18 = new Dog("Clas",3,"Pug");
        Dog dog19 = new Dog("Yiu",4,"San Bernardo");
        Dog dog20 = new Dog("Class",6,"Pinscher");
        Dog dog21 = new Dog("Song",5,"Galgo");
        Dog dog22 = new Dog("Aler",1,"Bulldog");
        Dog dog23 = new Dog("Nebra",2,"Shar Pei");
        Dog dog24 = new Dog("Balan",2,"Shar Pein");
        Dog dog25 = new Dog("Clu",2,"Pdenco");


        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(dog1);
        dogList1.add(dog2);
        dogList1.add(dog3);
        dogList1.add(dog4);
        dogList1.add(dog21);

        List<Dog> dogList2 = new ArrayList<>();
        dogList2.add(dog5);
        dogList2.add(dog6);
        dogList2.add(dog7);
        dogList2.add(dog8);
        dogList2.add(dog22);


        List<Dog> dogList3 = new ArrayList<>();
        dogList3.add(dog9);
        dogList3.add(dog10);
        dogList3.add(dog11);
        dogList3.add(dog12);
        dogList3.add(dog23);


        List<Dog> dogList4 = new ArrayList<>();
        dogList4.add(dog13);
        dogList4.add(dog14);
        dogList4.add(dog15);
        dogList4.add(dog16);
        dogList4.add(dog24);


        List<Dog> dogList5 = new ArrayList<>();
        dogList5.add(dog17);
        dogList5.add(dog18);
        dogList5.add(dog19);
        dogList5.add(dog20);
        dogList5.add(dog25);

        Person person1 = new Person("Richard","Ramos",25, dogList1);
        Person person2 = new Person("Juana","Alabés",17, dogList2);
        Person person3 = new Person("Rafael","Ramirez",30, dogList3);
        Person person4 = new Person("Anabel","Asturias",18, dogList4);
        Person person5 = new Person("Anabel","Ramos",14, dogList5);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        personList.forEach(System.out::println);
        System.out.println("****************************************************");
        personList.stream().forEach(System.out::println);
        System.out.println("****************************************************");
        var count = personList.stream()
                .flatMap(person -> person.getDogList().stream())
                .count();
        System.out.println(count);
        System.out.println("****************************************************");
        personList.stream()
                .flatMap(person -> person.getDogList().stream())
                .filter(dog -> dog.getBreed().equalsIgnoreCase("Chihuahua"))
                .forEach(System.out::println);
        System.out.println("****************************************************");

        Comparator<Person> comparator = Comparator.comparing(Person::getName);

        personList.stream()
                .sorted(comparator.reversed())
                .forEach(System.out::println);
    }
}
