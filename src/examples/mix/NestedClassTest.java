package examples.mix;

public class NestedClassTest {

    public static String s1 = "Hi Anu";

    public static void main(String[] args) {
        OuterClass t = new OuterClass();
        OuterClass.Subclass s = t.new Subclass();
        s.getValues();
    }

    static void getValues() {
        System.out.println("I'm Called");
    }
}

class OuterClass {

    class Subclass {

        public void getValues() {
            System.out.println(" This is Subclass getValues()");
        }

        public Subclass() {
        }
    }

    public void getValues() {
        System.out.println(" This is Subclass getValues..............()");
    }
}
