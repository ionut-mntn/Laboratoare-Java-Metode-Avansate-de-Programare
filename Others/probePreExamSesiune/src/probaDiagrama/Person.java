package probaDiagrama;

public class Person {

    private int amount;
    private String firstName;
    private String Address;

    public Person(int amount, String firstName, String address) {
        this.amount = amount;
        this.firstName = firstName;
        this.Address = address;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void subscribeZeitung(Zeitung z){
        z.subscribe(this);
    }

}
