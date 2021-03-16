import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] note={0,10,23,30,40,53,60,70,84,90,100};


        for(int e : Aufgabe_1.abgerundet(note))
            System.out.println(e);

        System.out.print("Sal");

        for(int e : Aufgabe_1.nichtAusreichend(note))
            System.out.println(e);

        System.out.println(Aufgabe_1.durchschnitt(note));

        System.out.println(Aufgabe_1.maxAbgerundet(note));

        int[] n1={1,9,1};
        int[] n2={2,2,2};
        int[]numere1={1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[]numere2={8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(Aufgabe_3.summeZahlen(n1,n2)));

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // PANA AICI PARTEA LUI MIHAI
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        int[] t1 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
//        int[] t2 = {8, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] t1 = {1, 0, 7, 2}; // t1 de dat mereu cel mai mare!
        int[] t2 = {0, 9, 0, 1};

        System.out.print("t1 is: ");
        System.out.println(Arrays.toString(t1));
        System.out.println();
        System.out.print("t2 is: ");
        System.out.println(Arrays.toString(t2));
        System.out.println();

        System.out.print("t1 + t2 = ");
        System.out.println(Arrays.toString(Aufgabe_3.sum(t1, t2)));
        System.out.println();

        System.out.print("t1 - t2 = ");
        System.out.println(Arrays.toString(Aufgabe_3.diff(t1, t2)));
        System.out.println();

        System.out.println("t1 = " + Arrays.toString(t1));


        //Problem3.mul( new int[]{1,3,4,5}, myInt);
        int f = 2;
        System.out.printf("t1 * %d = ", f);
        System.out.println(Arrays.toString(Aufgabe_3.mul(t1, f)));
        System.out.println();

//      Problem3.divv( new int[]{1,3,4,5}, myInt);
        int i = 2;
        System.out.printf("t1 / %d = ", i);
        System.out.println(Arrays.toString(Aufgabe_3.divv(t1, f)));
        System.out.println();

        System.out.println("Maximul din t1 este: ");
//        System.out.println(maxx(new int[]{2,3,5}));
        System.out.println(Aufgabe_4.maxx(t1));

        System.out.println();

        System.out.println("Cea mai mare valoare din [40, 50, 60] si [5 12] este:");
//        System.out.println(Problem4.most_expensive(t1, t2));
        System.out.println(Aufgabe_4.most_expensive(new int[]{40, 50, 60}, new int[]{5, 12}));

        System.out.println();

        int buget = 50;
        int rez = (Aufgabe_4.in_budget(new int[]{15,45,20}, buget));
        System.out.printf("Dintr-un buget de %d lei, si tastaturi cu preturile [15, 45, 20] se va cumpara tastatura cu pretul: %d", buget, rez);

        System.out.println();
        System.out.println();
//        try
//        {
//            System.out.println(Problem4.in_budget(new int[]{15,45,20}, 10));
//        }
//        catch(IndexOutOfBoundsException variabila_exceptie)
//        {
//            System.out.println("printez trace:");
//            variabila_exceptie.printStackTrace();       // de ce nu continua ?
//            // System.out.println("si merg mai departe");
//        }
//         System.out.println("dc intai afiseaza asta si abia la finalul executiei programului trace ul din catch??");


        System.out.print("Preturi tastaturi: ");
        System.out.print(Arrays.toString(new int[] {40, 50, 60}));
        System.out.println();
        System.out.print("Preturi usb: ");
        System.out.println(Arrays.toString(new int[]{8, 9, 12}));

        int[] res = Aufgabe_4.ex4(60, new int[] {40, 50, 60}, new int[]{8, 9, 12});
        System.out.printf("Dintre tastaturi si usb-ri se vor cumpara:\n" +
                        "tastatura cu pretul: %d\n" +
                        "usb-ul cu pretul: %d\n" +
                        "%d + %d = %d",
                res[0], res[1], res[0], res[1], res[0] + res[1]);
        //        Problem4.ex4(60, new int[] {40, 45, 60}, new int[]{8, 9, 12});

        System.out.println();
    }
}
