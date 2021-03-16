public class A {

    private int atr1;

    public A(int value){
        System.out.println("Se apeleaza constructor din A");
        atr1 = value;
    }

    public int getAtr1() {
        return atr1;
    }

    public void setAtr1(int atr1) {
        this.atr1 = atr1;
    }

    public void metodaVirtualaProba(){
        System.out.println("A");
    }

    @Override
    public String toString() {
        return "A{" +
                "atr1=" + atr1 +
                '}';
    }
}
