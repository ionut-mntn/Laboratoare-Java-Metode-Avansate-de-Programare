import java.util.List;

public class Benutzer {

    private String vorName;
    private String nachName;
    private List<Sport> sportList;

    public Benutzer(String vorName, String nachName, List<Sport> sportList) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sportList = sportList;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getLs() {
        return sportList;
    }

    public void setLs(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @Override
    public String toString() {
        return "Benutzer{" +
                "vorName='" + vorName + '\'' +
                ", nachName='" + nachName + '\'' +
                ", sportList=" + sportList +
                '}';
    }

    public double kalkuliereZeit(){
        double sum = 0;
        for(Sport s: sportList)
            sum += s.kalkuliereZeit();
        return sum;
    }

//    public static double kalkuliereZeitSport(Sport s){ // e statica sau nu??

    public double kalkuliereZeitSport(Sport s){
        return s.kalkuliereZeit();
    }

    public double kalkuliereDurschnittszeit(){
        return this.kalkuliereZeit() / sportList.size();
    }

}
