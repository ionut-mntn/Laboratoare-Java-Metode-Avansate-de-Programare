public class LocalClassExample2 {
    String attr = "text";
    public void funcciones() {
        final String final_var = "in method";
        int var = 10;
        class U {
            void u() {
                System.out.println(attr + "(merge, e vizibila, pt ca attr1 e vizibil in 'funcciones' iar namespace ul asta - al metodei u - vede ce e in funcciones");
                System.out.println(final_var);
                System.out.println(var);
            }
        }
        U u = new U();
        u.u();
    }
}