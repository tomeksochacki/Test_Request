package request;

public class Main {
    public static void main(String[] args) {
        Request thing1 = new Request(250, "bicycle");
        Request thing2 = thing1;

        thing1.getPrice();
        thing1.getName();

        System.out.println(thing1.hashCode());
        System.out.println(thing1.toString());
        System.out.println(thing1.equals(thing2));
        System.out.println(thing1==thing2);
        System.out.println(thing2.hashCode());
        System.out.println(thing2.toString());
    }
}
