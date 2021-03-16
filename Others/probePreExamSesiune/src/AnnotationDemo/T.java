package AnnotationDemo;

@Copyright(author="cat", year=2018)
class T {



    public void f () {
        System.out.println("f() in T");
    }
    private void f (String x) {
        System.out.println(x + " -> f() in T");
    }
    private String x;
    public T (String x) {
        this.x = x;
    }
}