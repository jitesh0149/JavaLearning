package examples.abstract_classes;

public class Main {

    public static void main(String[] args) {
        Abstract_class1 d = new Abstract_impl();
        //Abstract Class must be extended - this is example initialising abstract class as anonymous class
        Abstract_class1 b = new Abstract_class1() {

            @Override
            public String method1() {
                return "Testing ....";
            }
        };
        System.out.println("" + b.method1());
        System.out.println("" + d.method1());
    }
}
