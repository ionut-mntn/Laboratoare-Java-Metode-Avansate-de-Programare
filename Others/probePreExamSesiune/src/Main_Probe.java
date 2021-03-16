import java.io.*;

public class Main_Probe {

    static void metodaProba(A obiect){
        System.out.println(obiect.getClass().getSimpleName()); // upcasting implicit prolly
        System.out.println(obiect.getAtr1());
        System.out.println();

//        obiect = (B) obiect; //
        //System.out.println(((B)  obiect).getAttr2());   // aici ii spun sa faca casting-ul la B; la compile time ma lasa
        // dar la run time s-ar putea sa dau de eroare !! Deci cumva daca fac asa ceva inseamna ca eu -chit ca am zis ca
        // parametrul este de tip A- mereu ii voi da n obiect de tip subclasa a lui A ( deci B sau orice alt tip ce
        // mosteneste din A). De exemplu, in main, la "metodaProba(a);" o sa dea eroare !!
//        ((B) obiect).getAttr2();

        System.out.println("aici=");
        obiect.metodaVirtualaProba();
        System.out.println("pana aici");
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException { // FileNotFundException de la serializare,
        // IOException e de la serializare
        // ClassNotFoundException e de la "ObjectInputStream.readObject()"
/*
        A a = new A(1); // ce se intampla cand apelez cu constructorul din B?
        B b = new B(1, 2);

        A a2 = new B(3, 4);
        B b2 = (B) a2;
        System.out.println(b2.getAttr2());

        metodaProba(a);
        metodaProba(b);

        //////

        int x=2, y=4;
        Parameter.exchange(x,y);
        System.out.println("x=" + x +" y=" + y);

        ///////

       C c = new C(3);

       ////////////

//        Curs3_Slide31 aux = new Curs3_Slide31();
//        Box<Curs3_Slide31.Fruit> bf = aux.

        //////////////

        System.out.println();
        System.out.println("BOB LOB");
        Person bob = new Person(1.80, "bob");
        Person lob = new Person(1.90, "lob");
        System.out.println(bob.compareTo(lob));

        System.out.println(lob.getSize());
        lob.grow(0.10);
        Grow g = lob;   // g = o referinta la un obiect ce implementeaza interfat Grow
        System.out.println(((Person) g).getSize());
        Comparable<Person> cp = bob;

        /////////////////

        //in Main_Probe-Methode
        A2 a2innerClasses = new A2();
        A2.B2 ab2 = new A2.B2();
        A2.B2.C2 abc2 = new A2.B2().new C2(); // asa se instantiaza a non-static inner class ! (deci nu nested class )


        a2innerClasses.getClass().getSimpleName();
        ab2.m();
        abc2.m();
        //////////////

        System.out.println();
        TestLocalClassExample2.main();

        /////////////

        //SERIALIZABLE
        // ATENTIE! Interfata Serializable e o interfata goala! Practic, este doar pentru a identifica obiectele care
        // sunt serializable. Tot practic, eu imi definesc cum o sa se fac serializarea; in cazul de mai jos, prin
        // obiectele astea de tip Input/Output-Stream si Input/Output-Object !!

        System.out.println();

        // scriere serializable
        StudentSerializable ss = new StudentSerializable(1,"bobi","ub_bobi");
        FileOutputStream fos = new FileOutputStream("datei");
        ObjectOutput ou = new ObjectOutputStream(fos);
        ou.writeObject(3);
        ou.writeObject("Text_proba");
//        ou.writeObject("\n\n\n");
        ou.writeObject(ss);
        ou.flush();     // grija la flush ul asta.. nuj ce face aici dar poate prin alte parti are treaba!!

        // citire serializable
        FileInputStream fis = new FileInputStream("datei");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Integer i = (Integer) ois.readObject();
        String str = (String) ois.readObject();
        StudentSerializable ss2 = (StudentSerializable) ois.readObject();

        System.out.println(i);
        System.out.println(str);
        System.out.println(ss2);
*/
        ///////////

//        int i;
//        System.out.println(i);
//        System.out.println(i=20);
//        System.out.println(i);
        int i = (i = 20); // asta merge cred ca din urmatorul motiv: declar spatiu pentru i si ii atribui lui valoarea
        // returnata de (atribuirea valorii 20 lui i) adica 20;
        // "atribuirea valorii 20 lui i" poate avea loc deoarece deja e declarat i-ul
        Integer a = i;
        System.out.println(a);
//        System.out.println((int i = (i = 20));
//         var i = (i = 20); //Kompilierzeitfehler



    }

}
