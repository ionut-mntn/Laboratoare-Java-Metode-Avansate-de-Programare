class S {
    public static void main(String[] args) {
        String a = new String("abc");
        if (a == "abc") {
            System.out.println("egal");
        } else {
            System.out.println("nu e");
        }

        if (a.equals("abc")) {
            System.out.println("egal");
        } else {
            System.out.println("nu e");
        }

        String b = "abc";
        if (b == "abc") {
            System.out.println("egal");
        } else {
            System.out.println("nu e");
        }

        if (b.equals("abc")) {
            System.out.println("egal");
        } else {
            System.out.println("nu e");
        }

    }
}