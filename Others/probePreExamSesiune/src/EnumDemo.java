public class EnumDemo {

    public enum Food {
        HAMBURGER(7), FRIES(2), HOTODOG(3), ARTICHOKE(4);

    Food(int price){
        this.price = price;
    }

    private final int price;

        /**
         *  ca sa creezi these "javadoc stubs" scrii "/**" si apesi enter !!
         * @return
         */
    public int getPrice() {
        return price;
    }

    }

    public static void main(String[] args){
        for(Food f: Food.values()){
            System.out.println();
            System.out.println("Food: " + f + ", ");

            if(f.getPrice() >= 4) System.out.print("Expensive, ");
            else System.out.print("Affordable, ");

            switch (f){
                case HAMBURGER:
                    System.out.println("Tasty");
                    continue;  // sa sara la urmatoarea iteratie din for
                case ARTICHOKE:
                    System.out.println("Delicious");
                    continue; // sa sara la urmatoarea iteratie din for
                default:
                    System.out.println("ok");
            }
            // System.out.println();

        }
    }

}
