package lab3.model;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person{

    private Long studentID;
    private List<Kurs> enrolledClassList;
    private int enrolledClassesCreditNumber;


//    private static Long lastIDgiven = 0;

    public Student(String firstName, String lastName, Long studentID, List<Kurs> enrolledClassList){
        super(firstName, lastName);
        this.studentID = studentID;
        this.enrolledClassList = enrolledClassList;
        this.enrolledClassesCreditNumber = this.calculateNoCredits();

//        this.ID = ++lastIDgiven;
    }

    public Student(String firstName, String lastName, Long studentID){
        super(firstName, lastName);
        this.studentID = studentID;
        this.enrolledClassList = new ArrayList<>();
        this.enrolledClassesCreditNumber = this.calculateNoCredits();

//        this.ID = ++lastIDgiven;
    }


    private int calculateNoCredits(){
        int sum = 0;
        for(Kurs k : enrolledClassList)
            sum += k.getNoCredits();
        return sum;
    }


    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public List<Kurs> getEnrolledClassList() {
        return enrolledClassList;
    }

    public void setEnrolledClassList(List<Kurs> enrolledClassList) {
        this.enrolledClassList = enrolledClassList;
    }

    public int getEnrolledClassesCreditNumber() {
        return enrolledClassesCreditNumber;
    }

    public void setEnrolledClassesCreditNumber(int enrolledClassesCreditNumber) {
        this.enrolledClassesCreditNumber = enrolledClassesCreditNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                "studentID='" + studentID + '\'' +
                ", nrEnrolledClassList=" + enrolledClassList.size() +
                ", enrolledClassesCreditNumber=" + enrolledClassesCreditNumber +
                "}\n";
    }

}