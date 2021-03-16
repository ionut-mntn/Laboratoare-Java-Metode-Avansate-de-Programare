public class probaFinally {

    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            System.out.println("proba");
            return 0;   // ???
        }
        finally {   // atunci atentie mare la chestii de genul !!
            System.out.println("finally trumps return.");
        }
    }

}
