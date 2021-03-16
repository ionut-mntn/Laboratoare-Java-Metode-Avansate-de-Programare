//public class Main { // de asta nu mergea initial!!
/*
    Deci: ca sa ne folosim de toata puterea pc-ului, folosim thread-uri pt ca ele lucreaza simultan la rezolvarea unui
task. Sunt 2 variante predefinite de a folosi threaduri in Java:

    1) extindem Thread si suprascriem "public void run()"
( varianta asta de fapt tot implementeaza Runnable, cumva; asta, daca nu ma insel (check Thread class; ctrl+f and
search for "run(")

    2) implementam Runnable

 */
public class Main extends Thread{

    Runner runner;
    public Main(Runner run) { runner = run; }
    public void run(){
        runner.doit();      // dc mai apare si clasa Main? Practic, am 2 obiect de tip "Main" care efectueaza niste
        // - fiecare pt el - task-ul "doit()". Deoarece acestea extind Thread, se poate apela la concurenta!
    }

    public static void main(String[] args){

        Runner runner = new Runner();
        Main foo = new Main(runner);
        Main bar = new Main(runner);

        // Si ATENTIE!! [obiectRunnable / obiectCeExtindeThread].start() porneste thread-urile !!!
        foo.start();
        bar.start();

        /*
        OBS: NU se poate comenta aia de mai sus din main si observa asta de jos, deoarece asta de jos nu contine
        niciun obiect ce extine thread... practic eu imi modelez situatia si mai creez un "taskManager" - care in cazul
        nostru este clasa Main - iar acest taskManager se foloseste de concurenta !!
        */
        /*
        Runner r2 = new Runner("adam");
        Runner r3 = new Runner("eva");

        r2.doit();
        r3.doit();
        */
/*
        Schleife 0
        Schleife 1
        Schleife 0
        Schleife 2
        Schleife 1
        Schleife 3
        Schleife 2
        Schleife 4
        Schleife 3
        Schleife 5
        Schleife 4
        Schleife 5
        Schleife 6
        Schleife 6
*/

    }


}
