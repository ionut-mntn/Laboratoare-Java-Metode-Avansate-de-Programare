/*
Markus will ein USB Laufwerk und eine Tastatur kaufen. Der Elektronik-Shop hat verschiedene USB Laufwerke und Tastaturen mit verschiedene Preise.
Schreiben Sie eine Methode, die die billigste Tastatur zurückgibt.
z.B. [40 35 70 15 45] => 15
Schreiben Sie eine Methode, die die teuerste Gegenstand zurückgibt.
z.B. Tastatur = [15 20 10 35], USB = [20, 15, 40 15] => 40
Schreiben Sie eine Methode, die die teuerste USB Laufwerk, die Markus kaufen kann, zurückgibt.
z.B. Preise = [15 45 20], Budget = 30 => 20
Finden Sie, anhand des Markus Budget und der Preislisten für die Tastaturen und USB-Laufwerke, den Geldbetrag Markus ausgeben wird. Wenn er nicht genug für beide hat, geben Sie stattdessen -1 zurück. Er kauft nur die zwei benötigten Gegenstände.
z.B. b=60, tastaturen = [40 50 60] und usb Laufwerke = [8 12] => 50 + 8 = 58
 */

import java.util.Arrays;

public class Aufgabe_4 {
    public static int maxx(int[] arr)
            throws IndexOutOfBoundsException
    {
        if(arr.length == 0) throw new IndexOutOfBoundsException("NICIUN ELEMENT IN ARRAY!!");
        int maxx = arr[0];
        int l = arr.length;
        for (int j : arr) if (j > maxx) maxx = j;
        return maxx;
    }

    public static int most_expensive(int []arr1, int[]arr2){
        int maxx1 = maxx(arr1);
        int maxx2 = maxx(arr2);
        return maxx1 > maxx2 ? maxx1 : maxx2;
    }

    public static int in_budget(int []produse, int budget){

//        int de_scazut = 0;
//        int l = produse.length;
        int max = maxx(produse);
        if(budget >= max) return max;
        else
        {
            do{
                final int aux = max; // de ce toata invarteala asta? daca puneam in lambda-ul de mai jos direct 'max' in loc de aux
                // imi dadea eroare "local variables referenced from a lambda expression must be final or effectively final"
                // cumva are sens, tho..
                produse = Arrays.stream(produse)
                        .filter(val -> val != aux)
                        .toArray();
                try
                {
                    max = maxx(produse);
                }
                catch(IndexOutOfBoundsException e)
                {
                    System.out.println("arunc mai departe");
                    throw(e);
                }

            }while(budget < max);
        }

        return max;
    }

    public static int[] ex4(int buget, int[] tastaturi, int[] usb)
    {
        // obs: puteam refolosi in_budgt aici
        int sum;
        for(int i = tastaturi.length - 1; i >= 0; i--)
            for(int j = usb.length - 1; j >= 0; j --)
            {
                sum = tastaturi[i] + usb[j];
                if (sum <= buget) return new int[] {tastaturi[i], usb[i]};
            }
        return new int[]{-1, -1};
    }

}
