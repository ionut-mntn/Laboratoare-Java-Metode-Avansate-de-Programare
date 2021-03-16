package lab3.model;// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private List<Kurs> kursList; // dc nu tre sa pun lab3.model.Kurs aici?
    private Long id;

    public Teacher(String firstName, String lastName, List<Kurs> kursList) {
        super(firstName, lastName);
        this.kursList = kursList;
    }

    @Override
    public String toString() {
        return "Teacher{" + "Name="+ this.getFirstName()+ " " + this.getLastName()+
                ", kursList=" + kursList +
                ", id=" + id +
                '}';
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Teacher(String firstName, String lastName, Long id) {
        super(firstName, lastName);
        this.kursList = new ArrayList<>();
        this.id = id;
    }


    public List<Kurs> getKursList() {
        return kursList;
    }

    public void setKursList(List<Kurs> kursList) {
        this.kursList = kursList;
    }

}

