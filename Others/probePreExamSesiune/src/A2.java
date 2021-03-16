public class A2 {
    static int i = 4711;
    static String a = "A";
    String b = "B";
    public static class B2 {
        int my_i = i;

        void m(){
            System.out.println(a);
        }

        public class C2 {

            void m(){
                System.out.println(a);
            }

        }//end of class C

    }// end of class B
}// end of class C