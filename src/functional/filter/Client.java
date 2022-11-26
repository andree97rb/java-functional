package functional.filter;

public class Client extends Person{
    private int crdit;
    public Client(String name, String lasname, String dni, String phone, int credit) {
        super(name, lasname, dni, phone);
        this.crdit=credit;
    }

    public int getCrdit() {
        return crdit;
    }

    public void setCrdit(int crdit) {
        this.crdit = crdit;
    }

    @Override
    public String toString() {
        return "{" +
                super.toString() +
                "crdit=" + crdit +
                '}';
    }
}
