public class Outer {
    public class Inner {
        public void hello() {
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        Outer u = new Outer();
        Inner in = u.new Inner();
        in.hello();
    }
}
