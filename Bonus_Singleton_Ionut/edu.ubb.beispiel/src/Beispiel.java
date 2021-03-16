public class Beispiel {
    /**
     * Alle Entwurfsmuster werden heute oft verwendet und sind lebensnotwendig wir gute Code.
     * Die werden von The Gang of Four in einem Buch aus 1994 gegrundet und sind uberall in OOP
     *
     * Das ist ein beispiel Singleton Tester fur unser Osterhase
     *
     * In Osterhase.java wird weitererklart was ein Singleton ist
     *
     * @param args Standard Input Parameters.
     */
    public static void main(String[] args) {
        //Erzeuge das Osterhase
        Osterhase instanzEins = Osterhase.getInstance();

        //Erzeuge nochmal das OsterHase
        Osterhase instantzZwei = Osterhase.getInstance();

        //Wir wissen dass es nun ein OsterHase existieren kann
        //In Java denken wir nach dass es der gleiche Objekt sein muss
        //Zwei Objekte sind gleich wenn sie diegleichen HashCode habben
        System.out.println("Osterhase Instanz 1 hash:" + instanzEins.hashCode());
        System.out.println("Osterhase Instanz 2 hash:" + instantzZwei.hashCode());

    }
}
