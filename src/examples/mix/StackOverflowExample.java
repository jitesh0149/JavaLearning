package examples.mix;

public class StackOverflowExample extends SOInnerClass {

    public static void main(String[] args) {
        System.out.println("This");
        SOInnerClass aaa = new SOInnerClass("xyz");
        System.out.println("Output is :" + aaa.o);
    }

    public StackOverflowExample(String a) {
        super(a);
    }
}

class SOInnerClass {

    String xyz;
    SOInnerClass o = new SOInnerClass("Print this");

    protected SOInnerClass(String a) {
        xyz = a;
    }

}
