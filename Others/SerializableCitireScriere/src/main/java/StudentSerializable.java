import java.io.Serializable;

public class StudentSerializable implements Serializable {

    private int id;
    private String name;
    private String uni;


    public StudentSerializable(){

    }

    public StudentSerializable(int id, String name, String uni) {  // asta cred ca doar ar rezerva spatiu.. cam atat
        this.id = id;
        this.name = name;
        this.uni = uni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uni='" + uni + '\'' +
                '}';
    }
}