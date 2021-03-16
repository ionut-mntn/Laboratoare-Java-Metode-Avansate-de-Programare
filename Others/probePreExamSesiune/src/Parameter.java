public class Parameter {
    static void exchange(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main(String[] args) {
        int x=2, y=4;
        System.out.println("x=" + x +" y=" + y);
        exchange(x,y);
        System.out.println("x=" + x +" y=" + y);
    }

}
