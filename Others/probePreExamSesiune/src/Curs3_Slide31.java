public class Curs3_Slide31 {

    public class Fruit {
        @Override
        public String toString() {
            // return super.toString();
            return "fruit";
        }
    }
    public class Apple extends Fruit{
        @Override
        public String toString() {
            // return super.toString();
            return "apple";
        }
    }
    public class Box <T extends Fruit> {}

    public static void print_box(Box<Fruit> f) {
        System.out.println(f);
    }

    public static void main(String[] args){
//        print_box(new Box<Fruit>(new Apple()));
    }

}
