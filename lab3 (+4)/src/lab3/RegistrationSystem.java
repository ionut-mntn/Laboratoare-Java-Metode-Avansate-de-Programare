package lab3;

import lab3.controller.Controller;
import lab3.model.Kurs;
import lab3.model.Student;
import lab3.model.Teacher;
import lab3.repository.KursRepository;
import lab3.repository.StudentRepository;
import lab3.repository.TeacherRepository;

import java.util.ArrayList;
import java.util.List;

public class RegistrationSystem {

    private KursRepository kurseRepo;
    private StudentRepository studentRepo;
    private TeacherRepository teacherRepo;
    Controller c;

    public Controller getC() {
        return c;
    }

    public void setC(Controller c) {
        this.c = c;
    }

    public KursRepository getKurseRepo() {
        return kurseRepo;
    }

    public void setKurseRepo(KursRepository kurseRepo) {
        this.kurseRepo = kurseRepo;
    }

    public StudentRepository getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }

    public RegistrationSystem(List<Kurs> kursList, List<Student> studentList, List<Teacher> teacherRepo){
        this.kurseRepo = new KursRepository(kursList);
        this.studentRepo = new StudentRepository(studentList);
        this.teacherRepo=new TeacherRepository(teacherRepo);

        c=new Controller(this.kurseRepo, this.studentRepo, this.teacherRepo);
    }


    public boolean register(Kurs k, Student s) {
        if(k.getMaxNoStudents() - k.getEnrolledStudents().size()>=1){       // daca nr maxim de studenti inscrisi la un curs nu a fost atins inca atunci:
            if(s.getEnrolledClassesCreditNumber() + k.getNoCredits()<=30){  // daca nr actual de credite al studentului + nr de credite al cursului de adaugat in lista sa de cursuri nu depaseste 30


                List<Kurs> temp = s.getEnrolledClassList();
                temp.add(k);
                //s.setEnrolledClassList(temp);


                List<Student> aux=k.getEnrolledStudents();
                aux.add(s);
                //k.setEnrolledStudents(aux);


                kurseRepo.update(k);
                studentRepo.update(s);

                return true;
            }
            else{
                System.out.println("Prea multe credite!");
                return false;
            }

        }
        else{
            System.out.println("Nu sunt locuri disponibile!");
            return false;
        }


    }

    public List<Kurs> retrieveCoursesWithFreePlaces(){
        List<Kurs> temp=new ArrayList<>();
        for (Kurs k: kurseRepo.findAll()) {
            if(k.getMaxNoStudents()-k.getEnrolledStudents().size()>=1)
                temp.add(k);
        }
        return temp;
    }

    public List<Student> retrieveStudentsEnrolledForACourse(Kurs k){
        return k.getEnrolledStudents();

    }

    public List<Kurs> getAllCourses(){
        return kurseRepo.findAll();

    }



}
