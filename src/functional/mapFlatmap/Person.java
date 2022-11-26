package functional.mapFlatmap;

import java.util.List;

public class Person {
    private String name;
    private String lastname;
    private int year;
    private List<Dog> dogList;

    public Person(String name, String lastname, int year, List<Dog> dogList) {
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.dogList = dogList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", year=" + year +
                ", dogList=" + dogList +
                '}';
    }
}
