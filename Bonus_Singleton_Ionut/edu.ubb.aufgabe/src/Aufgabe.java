public class Aufgabe {
    /**
     * Aufgabe 1 :
     *
     * Es wird gegeben : 4 Studenten verwenden eine einzige Mensa Karte um taglich zu essen. Deswegen haben
     * sich entscheiden das Logger von der Uni: UniLogger zu benuntzen um denselben Mensa karte zu verwenden.
     * Sie sind zu den verstandnis gekommen denselben unser_mensa file zu verwenden um zu sehen wie viel Geld
     * jeder verwendet hat und wie viel Geld jeder eingezahlt hat.
     *
     * Das Uni system is ganz schlimm und die 4 konnen nicht weiter gehen und ausmachen wie viel Geld ein- und abgezahlt
     * wird. Deswegen haben sie die folgende Spezifikation gemeldet.
     *
     * AnforderungSpezifikation :
     *
     * Baue ein neues Logger Klasse mit das Singleton pattern dammit alle  Information korrekt gellogt sein wird.
     * Versuch dann die gleiche Transaktionen zu machen mit 3 neue Logger
     *
     * @param args Standard Input Parameters.
     */
    public static void main(String[] args) {

        UniLogger logger1 = new UniLogger();
        UniLogger logger2 = new UniLogger();
        UniLogger logger3 = new UniLogger();

        logger1.logEinzahlen("Mark", 100);
        logger2.logAbzahlen("Hanna", 30);
        logger1.logUberTragen("Mark", "Julius", 40);
        logger3.logEinzahlen("Tobi", 23.74);
        logger2.logAbzahlen("Julius", 5);

        // Neue SingletonLogger Umsetzung

        SingletonLogger logger = SingletonLogger.getInstance();
        logger.logEinzahlen("Mark", 100);
        logger.logAbzahlen("Hanna", 30);
        logger.logUberTragen("Mark", "Julius", 40);
        logger.logEinzahlen("Tobi", 23.74);
        logger.logAbzahlen("Julius", 5);
        System.out.println("trece");


    }
}


/** Aufagabe 2: Mit Laufe der Zeit wird der Uni auch eine Sportkarte und eine Buskarte haben. Die verwenden ein Logger
 * anhlich zu den angegene aber nicht gleich. Die Uni hat schon ein interface Logger gebaut, die andere Loggers
 * und das Uniburo Klasse die so funktioniert :
 *
 * UniBuro meinUniBuro = new UniBuro();
 * Logger = meinUniBuro.gibtLogger("SingletonLogger")
 * Logger = meinUniBuro.gibtLogger("BusLogger")
 *
 * Was fur eine Strategie kann man verwenden dazu ? Weiter Eklaren warum ? (Code is kein muss ;) )
 *
 * Folosim interfata Logger, iar BusLogger si SportLogger o sa implementeze aceasta interfata, dar o sa fie si clase singleton in acelasi timp.
 * Ne vom ajuta de un dictionar ( hashMap ) pentru a returna obiectele conform cu exemplele.
 */