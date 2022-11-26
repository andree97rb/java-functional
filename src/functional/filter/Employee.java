package functional.filter;

public class Employee extends Person{
    private int salary;
    public Employee(String name, String lasname, String dni, String phone,int salary) {
        super(name, lasname, dni, phone);
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "salary=" + salary +
                '}';
    }
}
