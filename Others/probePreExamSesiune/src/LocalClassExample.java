public class LocalClassExample {

    public void doSomething() {
        int i = 0;
        class X implements Runnable {
            public X() {}
            public void run() {}
        }
        new X().run();
    } // end of doSomething
}