import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        Vector field = new Vector();
        field.add("1");
        field.add("2");
        field.add("3");
        field.add("4");
        field.add("5");
        field.add("6");
        field.add("7");

        System.out.println(field);

        System.out.println(field.size());
        System.out.println(field.capacity());

    }
}
