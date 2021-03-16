/*
----------------------------------------------------------------------------------------------------------------
Problem 2:
----------------------------------------------------------------------------------------------------------------
Es gibt eine Array mit n positive Zahlen.
Finden Sie die maximale Zahl.
Finden Sie die minimale Zahl.
Finden Sie die maximale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 10 + 17 = 39
Finden Sie die minimale Summe von n-1 Zahlen.
z.B. [4, 8, 3, 10, 17] => 4 + 8 + 3 + 10 = 25
 */

public class Aufgabe_2 {
    public static int max(int[] a){
        int max=a[0];
        for(int e : a) if(e>max) max = e;
        return max;
    }
    public static int min(int[] a){
        int min=a[0];
        for(int e : a) if(e<min) min = e;
        return min;
    }

    private static int sum(int[] a){
        int s=0;
        for(int e : a) s=s+e;
        return s;
    }

    public static int maxsum(int[] a){
        return sum(a)-min(a);
    }

    public static int minsum(int[] a){
        return sum(a)-max(a);
    }

}
