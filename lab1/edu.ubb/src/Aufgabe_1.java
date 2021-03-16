public class Aufgabe_1 {

    /*
     ----------------------------------------------------------------------------------------------------------------
    Die Java Universität hat die folgenden Benotung Regel:
    Jeder Student bekommt eine Note zwischen 0 und 100.
    Eine Note weniger als 40 ist eine nicht ausreichende Note.
    Der Professor rundet die Note mit die folgenden Regel ab:
    Ob die Differenz zwischen die Note und die nächste multipel von 5 weniger als 3 ist, dann wird die Note zu die nächste multipel von 5 abgerundet.
    Ob die Note weniger als 38 ist, wird die Note nicht abgerundet.
    z.B. 84 => 85
         29 => 29

    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode ein Array mit nicht ausreichende Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode den Durchschnittswert liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode eine Array mit die abgerundete Note liefern.
    Schreiben Sie eine Methode, die ein Array von Noten bekommen soll. Als die Rückgabewert soll die Methode die maximale abgerundete Note liefern.

     */
    public static int[] nichtAusreichend(int[] grades){
        int[] g=new int[grades.length];
        int ct=0;
        for(int v : grades)
            if(v<40)
                g[ct++]=v;
        int[] f=new int[ct];

        for(int i=0;i<ct;i++)
            f[i]=g[i];
        return f;
    }

    public static float durchschnitt(int[] grades){
        float d=0;
        for(float e : grades)
            d+=e;
        return d/grades.length;
    }

    private static int runden(int e){
        int mult=(int)Math.ceil(e*1.0/5)*5;
        if(mult-e<3
                && e>=38)
            e=mult;

        return e;
    }
    public static int[] abgerundet(int[] grades){
        int mult=0;
        int[] g=new int[grades.length];
        for(int i=0;i<grades.length;i++){
            g[i]=runden(grades[i]);
        }
        return g;
    }

    public static int maxAbgerundet(int[] grades){

        int max=grades[0], x;
        for(int e : grades){
            x=runden(e);
            if(e!=x)
                if(x>max)
                    max=x;
        }
        return max;
    }

}
