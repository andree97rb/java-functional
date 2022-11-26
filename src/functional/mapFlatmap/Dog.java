package functional.mapFlatmap;

public class Dog {
    private String name;
    private int years;
    private String breed;

    public Dog(String name, int years, String breed) {
        this.name = name;
        this.years = years;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", breed='" + breed + '\'' +
                '}';
    }
}
