package lab3.controller;//package src.lab3.repository.KursRepository;
// package src.lab3.repository;

//package src.*

//package lab3.repository.KursRepository


import lab3.model.Kurs;
import lab3.model.Student;
import lab3.model.Teacher;
import lab3.repository.KursRepository;
import lab3.repository.StudentRepository;
import lab3.repository.TeacherRepository;
/*
import lab3.view.KursRepositoryView;
import lab3.view.StudentRepositoryView;
*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    KursRepository kr;
    StudentRepository sr;
    TeacherRepository tr;
    /*
    KursRepositoryView krv;
    StudentRepositoryView srv;
*/

    public Controller(KursRepository kr, StudentRepository sr, TeacherRepository tr) {

        //this.tr = tr

        this.sr = sr;
        this.kr = kr;
        this.tr = tr;

    }

/*

    public KursRepository getKr() {
        return kr;
    }

    public void setKr(KursRepository kr) {
        this.kr = kr;
    }

    public StudentRepository getSr() {
        return sr;
    }

    public void setSr(StudentRepository sr) {
        this.sr = sr;
    }

    public KursRepositoryView getKrv() {
        return krv;
    }

    public void setKrv(KursRepositoryView krv) {
        this.krv = krv;
    }

    public StudentRepositoryView getSrv() {
        return srv;
    }

    public void setSrv(StudentRepositoryView srv) {
        this.srv = srv;
    }

    public void updateView(){
        srv.printStudentRepositoryDetails(sr);
        krv.printKursRepositoryDetails(kr);
    }

    public void addKurs(Kurs k){
        kr.save(k);
    }

    public void deleteKurs(Kurs k){
        kr.delete(k.getId());
    }

    public void updateKurs(Kurs k){
        kr.update(k);
    }

    public void addStud(Student s){
        sr.save(s);
    }

    public void deleteStud(Student s){
        sr.delete(s.getStudentID());
    }

    public void updateStud(Student s){
        sr.update(s);
    }
*/
    public List<Student> getAllStudents(){return sr.findAll();} //returneaza toti studentii
    public List<Kurs> getAllCourses(){return kr.findAll();} //returneaza toate cursurile
    public List<Teacher> getAllTeachers(){return tr.findAll();} //returneaza toti profesorii

    public Kurs findOneKurs(Long id){return kr.findOne(id);} //returneaqza cursul cu id-ul dat
    public Student findOneStudent(Long id){return sr.findOne(id);} //returneaqza studentul cu id-ul dat

    public Kurs deleteCourse(Long idK){ //sterge cursul cu Id-ul dat
        return kr.delete(idK);
    }

    public List<Kurs> getKursListTeacher(Long id){return tr.findOne(id).getKursList();} //returneaza cursurile unui profesor

    public List<Kurs> sortKurs(){ //sorteaza cursurile dupa nume, iar daca au numele la fel, le sorteaza dupa nr de locuri libere
        List<Kurs> aux_k=new ArrayList<>(kr.findAll());

        aux_k.sort( (Kurs aux_k1, Kurs aux_k2) ->
        {
            /*
            if (s1.getFirstName().equals(s2.getFirstName()))
                return s1.getLastName() < s2.getLastName();
            return s1.getFirstName() < s2.getFirstName();
            */

            if (aux_k1.getName().compareTo(aux_k2.getName()) == 0) // sau .equals aici
                return aux_k1.getMaxNoStudents()-aux_k1.getEnrolledStudents().size()-aux_k2.getMaxNoStudents()-aux_k2.getEnrolledStudents().size();
            return aux_k1.getName().compareTo(aux_k2.getName());
        } );

    return aux_k;
    }

    public List<Kurs> filterKurs(){ //afiseaza cursurile cu locuri libere
        List<Kurs> aux_k=new ArrayList<>(kr.findAll());
        aux_k = aux_k.stream()
                .filter( (Kurs k) -> // explict > implicit
                        //k.getName().equals("Algebra")) // n-avem nevoie de paranteze rotunde daca funtia primeste un singur argument!
                        k.getMaxNoStudents()-k.getEnrolledStudents().size()>0) // n-avem nevoie de paranteze rotunde daca funtia primeste un singur argument!
                .collect(Collectors.toList());
        return aux_k;
    }

}

