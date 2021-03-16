/*
Obs: daca face figuri de genul " ceva version 5 not supported " tre sa faci in Maven (adik in pom.xml) chestia aia cu
"<properties>
    <jackson.version>2.10.0</jackson.version>
    <maven.compiler.source>1.8</maven.compiler.source>
    <maven.compiler.target>1.8</maven.compiler.target>
</properties>"
Eventual prima data sa adaugi support pt Maven:
click-dreapta modulul cu numele proiectului -> Add Framework Support -> Scroll in bara din stanga, bifezi Maven si de
acolo mai departe te descurci.. next-next tot asa
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException { // FileNotFundException de la serializare,
        // IOException e de la serializare
        // ClassNotFoundException e de la "ObjectInputStream.readObject()"

        //SERIALIZABLE

        /* ATENTIE! Interfata Serializable e o interfata goala! Practic, este doar pentru a identifica obiectele care
        sunt serializable. Tot practic, eu imi definesc cum o sa se fac serializarea; in cazul de mai jos, prin
        obiectele astea de tip Input/Output-Stream si Input/Output-Object !!
        */

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
    }

}
