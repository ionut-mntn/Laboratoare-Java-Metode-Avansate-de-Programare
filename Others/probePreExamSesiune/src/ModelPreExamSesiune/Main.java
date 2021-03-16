//package ModelPreExamSesiune;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//
//    public static void main(String[] args){ //main cu m mic!!
//
//        System.out.println(7.5 % 7);
//        System.out.println((int) 7.5);
///*
//        float nr2 = 24.04f;      // float-urile sunt cu f la final!!
//        double nr = 24.04;      // float-urile sunt cu f la final!!
//        int intPart = (int) nr;
//        System.out.println(intPart);
//        System.out.println(nr % (int) nr); // asa nu e bun!! si nici cu modulo!!
//        System.out.println(nr - intPart); // asa nu e bun!! si nici cu modulo!!
//
//        Student s = new Student(23,"proba");
//        // var referintaNotaStudent = s.get_note();
//        s.get_note() = 10;
//*/
//        // void start(){
//
//        }
//        Student s1 = new Student(10,"SDA");
//        Student s2 = new Student(9,"SDA");
//        Student s3 = new Student(10,"SDA");
//        Student s4 = new Student(8,"SDA");
//        Student s5 = new Student(7,"SDA");
//        Student s6 = new Student(8,"BD");
//        Student s7 = new Student(8,"BD");
//        Student s8 = new Student(9,"BD");
//        Student s9 = new Student(9,"BD");
//
////        List<Student> studentList = new ArrayList<>(s1,s2,s3,s4,s5,s6,s7,s8,s9);
//        List<Student> studentList = new ArrayList<>(){{
//            add(s1);
//            add(s2);
//            add(s3);
//            add(s4);
//            add(s5);
//            add(s6);
//            add(s7);
//            add(s8);
//            add(s9);
//        }};
//
////        System.out.println(studentList);
//
////        studentList
////                .stream()
//////                .filter(s -> (int) s.get_note() > 0.40) // !! atentie !! se face cu sageata nu cu =>
//////                .filter(s -> s.get_note() % 10 > 0.40) // !! atentie !! se face cu sageata nu cu =>
////                // !! Cu forEach aduc ce schimbari vreau eu asupra datelor
////        .forEach(s -> {
////            int parteIntreaga = (int) s.get_note();
////            float parteFractionara = s.get_note() - parteIntreaga; // sau "float parteFractionara = s.get_note() % parteIntreaga" ar fi mers la fel de bine
////            if(parteFractionara >= 0.40)
////                s.setNote(parteIntreaga + 1);
////        });
//
////        List<String> listaStringuri = new ArrayList<>(){{"Bob # 5", "Dob % 4", "Lob # 10", "Fob # 7", "Andrei # 10"}};
//        List<String> listaStringuri = Arrays.asList("Bob # 5", "Dob % 4", "Lob # 10", "Fob # 7", "Andrei # 10");
//
//        List<String> listaStringuriNoua = listaStringuri
//                .stream()
//                .filter(str ->{
////                .forEach(str ->{
//                    List<String> entities = Arrays.asList(str.split(" "));
//                    return 5 < Integer.parseInt(entities.get(2)) && Integer.parseInt(entities.get(2)) < 8;
//                })
//                .collect(Collectors.toList());
////                .filter
////                .forEach();
//
////        System.out.println(listaStringuriNoua);
////
////        listaStringuriNoua
////                .stream()
////                .map(e -> new String(e.split(" ")[0]))
//////                .collect(Collectors.toList());
////                  .forEach(System.out::println);
//
//    }
//
//
//}
