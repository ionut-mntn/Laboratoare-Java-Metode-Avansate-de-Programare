public class GenericsProba {

    public <T> void print(T x){
        // System.out.println(x);
        System.out.println("nume clasa = " + x.getClass().getSimpleName());
        System.out.println(x.toString());
        // x.toString(); // asa nu returneaza nimic, clar
    }

    static public void  main(String[] args){
        GenericsProba gp = new GenericsProba();
        gp.print(23);
        gp.print("Ana");
        gp.print(new A(40));
        // System.out.println(Integer.toString(2));
    }

}
