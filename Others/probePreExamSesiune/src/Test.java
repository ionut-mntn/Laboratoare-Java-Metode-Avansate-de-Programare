import org.w3c.dom.Text;

class Test {
    static int i;
    int j;
    // start of static block

    public Test(){
        System.out.println("Constructor apelat");
    }

    static {
        System.out.println("static block called: i=" + i);
        System.out.println(i);
        i = 10;
        System.out.println("static block ended: i=" + i);
    }
// end of static block

    public static void main(String[] args){
        System.out.println("Main_Probe apelat");
        Test t = new Test();
    }

}