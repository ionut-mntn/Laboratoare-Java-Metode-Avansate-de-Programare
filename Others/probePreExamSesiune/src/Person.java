public class Person implements Comparable<Person>, Grow {

    private double size;
    private String name;

    public Person (double size, String name) {
        this.size = size; this.name = name;
    }

    public int compareTo (Person o) {
        if (size < o.size) return 1;
        else if (size == o.size) return 0;
        else return -1;
    }

    public double getSize(){
        return size;
    }

    @Override
    public void grow(double x) {
        size += x;
    }
}