package lab3;

import lab3.model.Kurs;
import lab3.model.Student;
import lab3.model.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



class RegistrationSystemTest {

    Student s1 = new Student("Ionut", "Muntean", 1L);
    Student s2 = new Student("Tudor", "Muntean", 2L);

    Teacher t1 = new Teacher("Mihai", "Oancea", 1L);
    Teacher t2 = new Teacher("Calin", "Nemes", 2L);

    Kurs k1 = new Kurs("Algebra",
            t1,
            100,
            new ArrayList<>(),
            6,
            1L);
    Kurs k2 = new Kurs("Geometrie",
            t2,
            0,
            new ArrayList<>(),
            6,
            2L);

    List<Kurs> listaKurs = Arrays.asList(k1,k2);
    List<Student> listaStudent = Arrays.asList(s1,s2);
    List<Teacher> listaTeacher= Arrays.asList(t1,t2);
    RegistrationSystem rs = new RegistrationSystem(listaKurs, listaStudent,listaTeacher);


    @Test
    void register() {

        assert(!k1.getEnrolledStudents().contains(s1));
        assert(rs.register(k1,s1));
        assert(k1.getEnrolledStudents().contains(s1));


        assert(!k2.getEnrolledStudents().contains(s1));
        assert(!rs.register(k2,s1));
        assert(!k2.getEnrolledStudents().contains(s1));

    }

    @Test
    void retrieveCoursesWithFreePlaces() {
        assert(rs.retrieveCoursesWithFreePlaces().size()==1);

    }

    @Test
    void retrieveStudentsEnrolledForACourse() {
        rs.register(k1,s1);
        assert(rs.retrieveStudentsEnrolledForACourse(k1).size()==1);
        assert(rs.retrieveStudentsEnrolledForACourse(k2).size()==0);
    }

    @Test
    void getAllCourses() {
        assert(rs.getAllCourses().size()==2);
    }
}