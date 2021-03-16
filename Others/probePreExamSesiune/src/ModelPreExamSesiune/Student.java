package ModelPreExamSesiune;

public class Student {

    private int note;
    private String kurs;
    public Student(int note, String kurs){
        this.note = note;
        this.kurs = kurs;
    }

    public int get_note(){
        return note;
    }

    public String get_kurs(){
        return kurs;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "note=" + note +
                ", kurs='" + kurs + '\'' +
                '}';
    }
}
