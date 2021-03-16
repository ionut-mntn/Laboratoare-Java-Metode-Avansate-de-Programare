/**
 * Was ist ein Singleton ?
 * Erzeuge genau eine Instanz eines Objektes für diese Klasse eines Klassenladers (Sofern nicht durch Reflection erzeugt).
 * source https://de.wikibooks.org/wiki/Muster:_Java:_Singleton
 *
 * Reflektion wird spater diskutiert
 *
 * Singletons sind einzig fur jedes Projekt und JVM.
 *
 * Singleton Klassen konnen entweder lazy oder eager initializier
 * Eager initialization hat ein Hinderniss namlich : ein Singleton Objekt wird immer erzeugt auch wenn wir es nicht
 * verwenden. Ihr konnt euch vorstellen dass dieser Singleton ein grosses Teil der Anwendung vorbringt oder dass
 * man einen DatenBank Verbindung  oder einen Service verwendet anhand dieser Erzeugung.
 /// Das Osterhase beispiel is lazy initializiert
 *
 * Singleton konnen auch thread safe, reflektion un serialization safe sein
 */

public class Osterhase {

    private static Osterhase einzigeInstantz;

    //privat Konstruktor (muss !)
    private Osterhase(){

    }

    public static Osterhase getInstance() {
        if(einzigeInstantz == null){ // Wenn kein anders Instanz gibt dann erzeuge eine Neue
            einzigeInstantz =  new Osterhase();
        }
        return einzigeInstantz;
    }
}


/**
 * Lazy Initialization Beispiel
 public class Osterhase {

 private static Osterhase einzigeInstantz;

 //privat Konstruktor (muss !)
 private Osterhase(){

 }

 public static Osterhase getInstance() {
 return einzigeInstantz;
 }

 }
 **/