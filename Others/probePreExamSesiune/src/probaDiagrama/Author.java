package probaDiagrama;

public class Author extends Person {

    private String lastName;


    public Author(int amount, String firstName, String address, String lastName) {
        super(amount, firstName, address);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
