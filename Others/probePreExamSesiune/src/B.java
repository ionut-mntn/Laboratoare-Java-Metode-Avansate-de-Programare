public class B extends A{

    private int attr2;

    public B(int attr1, int attr2) {
        // System.out.println("Se apeleaza constructor din B"); // daca lasam instructiunea asta prima, primeam eroarea:
        // "java: call to super must be first statement in constructor"
        super(attr1);
        System.out.println("Se apeleaza constructor din B");
        this.attr2 = attr2;
    }

    public int getAttr2() {
        return attr2;
    }

    public void setAttr2(int attr2) {
        this.attr2 = attr2;
    }

    public void metodaVirtualaProba(){
        System.out.println("B");
    }

    @Override
    public String toString() {
        return "B{" +
                "attr1=" + attr2 +
                '}';
    }

}
