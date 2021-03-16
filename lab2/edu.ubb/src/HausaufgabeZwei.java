import java.util.ArrayList;
import java.util.List;

/**
 *     TODO Install JUnit org.junit.jupiter:junit-jupiter:5.4.2
 *     Link https://www.jetbrains.com/help/idea/testing.html
 *     Alt Enter auf Klass Name
 */

public class HausaufgabeZwei {

    public static void main(String[] args) {

        Sport s2;
        s2 = new Sport(){
            // asta e o interfata noua,nu ? pt ca efectiv facem override la ceea ce trebuia implementat. Deci cumva, nici macar nu mai e o interfata
            @Override
            public double kalkuliereZeit() {
                return 0;
            }
        };

        List<Sport> sportList = new ArrayList<Sport>();
        Basketball b = new Basketball();
        Fussball f = new Fussball();
        Hindernislauf hin = new Hindernislauf();
        Hochsprung h = new Hochsprung();

        sportList.add(b);
        sportList.add(f);
        sportList.add(hin);
        sportList.add(h);

        for(Sport s: sportList)
            System.out.println(s.kalkuliereZeit());

        Benutzer ben = new Benutzer("Mishu","Smekerie", sportList);
        System.out.println(ben);

        System.out.println(ben.kalkuliereZeit());
        System.out.println(ben.kalkuliereDurschnittszeit());

        System.out.println(ben.kalkuliereZeitSport(b));
        System.out.println(ben.kalkuliereZeitSport(f));
        System.out.println(ben.kalkuliereZeitSport(hin));
        System.out.println(ben.kalkuliereZeitSport(h));

    }
}
