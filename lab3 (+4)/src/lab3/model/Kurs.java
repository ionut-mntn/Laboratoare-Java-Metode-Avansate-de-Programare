package lab3.model;

import java.util.List;

// class lab3.model.Kurs implement Comparable{
public class Kurs {

    private String name;
    private Teacher teacher;
    private int maxNoStudents;
    private List<Student> enrolledStudents;
    private int noCredits;

    private Long id;


    public Kurs(String name, Teacher teacher, int maxNoStudents, List<Student> enrolledStudents, int noCredits, long id) {
        this.name = name;
        this.teacher = teacher;
        this.maxNoStudents = maxNoStudents;
        this.enrolledStudents = enrolledStudents;
        this.noCredits = noCredits;
        this.id=id;


        List<Kurs> aux = this.teacher.getKursList();
        aux.add(this);
        this.teacher.setKursList(aux);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMaxNoStudents() {
        return maxNoStudents;
    }

    public void setMaxNoStudents(int maxNoStudents) {
        this.maxNoStudents = maxNoStudents;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getNoCredits() {
        return noCredits;
    }

    public void setNoCredits(int noCredits) {
        this.noCredits = noCredits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher.getFirstName() + " " + teacher.getLastName() + ", KursNr=" +teacher.getKursList().size() +
                ", maxNoStudents=" + maxNoStudents +
                ", NrenrolledStudents=" + enrolledStudents.size() +
                ", noCredits=" + noCredits +
                ", id=" + id +
                '}';

    }
}