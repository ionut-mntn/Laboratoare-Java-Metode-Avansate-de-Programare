package lab3;

import lab3.model.Kurs;
import lab3.model.Student;
import lab3.model.Teacher;
import lab3.repository.TeacherRepository;
import lab3.utility.CSVReader;

import java.util.ArrayList;

import java.util.List;

/**
 * lab3.Main class where program starts.
 */
public class StartApp {

    /**
     * Start point of the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Start point");
        //Teacher t1 = new Teacher("Mihai", "Oancea", 1L);
        //Teacher t2 = new Teacher("Gica", "Petrescu", 2L);
        List<Student> studentList=new ArrayList<>();
        List<Kurs> kursList=new ArrayList<>();
        List<Teacher> teacherList=new ArrayList<>();
        List<List<String>> ls = CSVReader.readFile("src/lab3/Studenti");
        List<List<String>> lk = CSVReader.readFile("src/lab3/Cursuri");
        List<List<String>> lt = CSVReader.readFile("src/lab3/Profesori");


        for(List<String> line: lt) {
            Teacher t = new Teacher(line.get(0), line.get(1), Long.parseLong(line.get(2)));
            teacherList.add(t);
        }
        //System.out.println(teacherList);
        TeacherRepository tr = new TeacherRepository(teacherList);
        for(List<String> line: lk) {
            Teacher t = tr.findOne(Long.parseLong(line.get(1)));
            Kurs k = new Kurs(line.get(0), t, Integer.parseInt(line.get(2)), new ArrayList<>(), Integer.parseInt(line.get(3)), Long.parseLong(line.get(4)));
            kursList.add(k);

        }

        for(List<String> line: ls) {
           Student s= new Student(line.get(0), line.get(1), Long.parseLong(line.get(2)));
            studentList.add(s);
        }



        RegistrationSystem rs = new RegistrationSystem(kursList, studentList,teacherList);
        Consola consola=new Consola(rs);
        consola.run();
    }
}
