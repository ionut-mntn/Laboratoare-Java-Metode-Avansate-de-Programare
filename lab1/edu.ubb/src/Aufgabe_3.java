import java.util.Arrays;

public class Aufgabe_3 {
    /*
        Es gibt 2 große Zahlen. Die Zahlen sind als Array dargestellt.
    Berechnen Sie die Summe. Die Zahlen haben die gleiche Anzahl an Ziffern.
    z.B. [1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = [1 0 0 0 0 0 0 0 0 0]
    Berechnen Sie die Differenz. Die Zahlen haben die gleiche Anzahl an Ziffern.
    z.B. [8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = [2 9 0 0 0 0 0 0 0]
    Berechnen Sie die Multiplikation. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    z.B. [2 3 6 0 0 0 0 0 0] * 2 = [4 7 2 0 0 0 0 0 0]
    Berechnen Sie die ganzzahlige Division. Erste Zahl ist ein große Zahl, der Zweite Zahl ist nur ein Ziffer.
    z.B. [2 3 6 0 0 0 0 0 0] / 2 = [1 1 8 0 0 0 0 0 0]

     */
    public static int[] summeZahlen(int[] zahlen1, int[] zahlen2)
    {

        int[] rezultat=new int[zahlen1.length+1];
        int rest=0;
        int d;


        for(int i=zahlen1.length-1;i>=0;i--)
        {
            d=zahlen1[i]+zahlen2[i]+rest;
            if(d>=10){
                rest=d/10;
                d=d%10;
            }else
                rest=0;

            rezultat[i+1]=d;
        }
        rezultat[0]=rest;




        if(rezultat[0]==0)
        {
            int[] temp=new int[rezultat.length-1];
            System.arraycopy(rezultat, 1, temp, 0, rezultat.length - 1);
            return temp;
        }
        return rezultat;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // PANA AICI PARTEA LUI MIHAI
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    static int[] sum(int[] t1, int[] t2) {
        int s[] = new int[t1.length + 1];

        int l = t1.length;
        if (l == 0) return new int[]{-1};   // semnifica eroarea ( puteam arunca exceptie, alternativ )
        int carry = 0;
        for (int i = l - 1; i >= 0; i--) {

            s[i] = t1[i] + t2[i] + carry;

            if (s[i] >= 10) carry = 1;
            else carry = 0;

            s[i] = s[i] % 10;

        }
        if (carry == 1) {
            for (int i = l; i > 0; i--)
                s[i] = s[i - 1];
            s[0] = 1;
            l++;
            return s;
        }

        return Arrays.copyOfRange(s,0,s.length - 1);

    }

    static int[] diff(int[] t1, int[] t2) {

        int []ct1 = Arrays.copyOf(t1, t1.length);
        int []ct2 = Arrays.copyOf(t2, t2.length);

        int d[] = new int[t1.length];

        int l = ct1.length;
        if (l == 0) return new int[]{-1};
        int carry= 0;
        for (int i = l - 1; i >= 1; i--) {
            if (ct1[i] < ct2[i]) {
                carry = 10;
                ct1[i - 1]--;
            } else carry = 0;

            d[i] = carry + ct1[i] - ct2[i];
        }
        d[0] = ct1[0] - ct2[0];

        return d;
    }

    static int[] mul(int[] f1, int f2) {

        int[] p = new int[f1.length + 1];

        int lf1 = f1.length;       // lungime factor 1
        System.out.println();
        int carry = 0;
        for (int i = lf1 - 1; i >= 0; i--) {

            p[i] = f1[i] * f2 + carry;
            carry = p[i] / 10;
            p[i] = p[i] % 10;
        }

        if (carry > 0) {
            for (int i = lf1; i > 0; i--)
                p[i] = p[i - 1];
            p[0] = carry; // sau 1, direct ( nu poate sa sara de 2 ori ordinul )
            lf1++;
            return p;
        }
        return Arrays.copyOfRange(p,0,p.length - 1);
    }

    public static int[] divv(int[] d, int impartitor) {
        int l = d.length;
        int[] r = new int[d.length];

        // if(l == 1) System.out.println(d[0] / impartitor);

        int deimpartit = d[0];
        int index_start = 0;
        if (deimpartit < impartitor) {
            deimpartit = deimpartit * 10 + d[1]; // banuiesc ca nu o sa se dea lista goala user-ul..
            index_start = 1;
        }

        for (int i = index_start; i < l - 1; i++) {
            r[index_start++] = deimpartit / impartitor;
            int de_scazut = r[index_start - 1] * impartitor;
            int rest = deimpartit - de_scazut;
            deimpartit = rest * 10 + d[index_start];
        }
        r[index_start] = deimpartit / impartitor;

        return r;
    }

}
