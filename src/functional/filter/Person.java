package functional.filter;

public class Person {
    private String name;
    private String lasname;
    private String dni;
    private String phone;

    public Person(String name, String lasname, String dni, String phone) {
        this.name = name;
        this.lasname = lasname;
        this.dni = dni;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasname() {
        return lasname;
    }

    public void setLasname(String lasname) {
        this.lasname = lasname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lasname='" + lasname + '\'' +
                ", dni='" + dni + '\'' +
                ", phone='" + phone + '\''+
                ",";
    }
}
