public class Problem2 {
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
