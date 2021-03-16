//class C{
//    int val;
//    public C(int x){
//        this.val=x;
//    }
//    public String toString(){
//        return ""+val;
//    }
//    static void exchangeData(C x, C y){
//        C tmp = x;
//        x = y;
//        y = tmp;
//        System.out.println("[exchange B] x=" + x + " y=" + y);
//    }
//    public static void main(String[]
//                                    args) {
//        C bx= new C(2);
//        C by=new C(4);
//        System.out.println("bx=" + bx + " by=" + by);
//        exchangeData(bx,by);
//        System.out.println("bx=" + bx + " by=" + by);
//    }
//}

// dar asa:

class C{
    int val;
    static int probaStaticInt;
    public C(int x){
        this.val=x;
    }
    public String toString(){
        return ""+val;
    }
    static void exchangeData(C x, C y){
        int tmp=x.val;
        x.val=y.val;
        y.val=tmp;
        System.out.println("[exchangeData] x="+x+" y="+y);
    }
    public static void main(String[] args) {

        // this.toString(); // "this cannot be reference from static contexte

        C cx=new C(2);
        C cy=new C(4);
        System.out.println("cx="+cx+" cy="+cy);
                exchangeData(cx,cy);
        System.out.println("cx="+cx+" cy="+cy);

        System.out.println(cx.probaStaticInt);

    }
}
// !!! CONCLUZIE: Java e pass-by-value ALWAYS, fara nicio exceptie !!!
// in cazuri de genul: " a = b " stochez  o copie a referintei la b -> in variabila a