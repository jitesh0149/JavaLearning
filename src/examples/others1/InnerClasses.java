package examples.others1;

public class InnerClasses {

    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.nonstaticinnerClass nons = o.new nonstaticinnerClass();
        nons.print();
        OuterClass.staticinnerClass.print();
    }
}
//public class OuterClass - gives error as the Class as File Name can be public

class OuterClass {

    public class nonstaticinnerClass {

        public nonstaticinnerClass() {
        }

        public void print() {
            System.out.println("Printed from nonstaticInnerClass");
        }
    }

    public static class staticinnerClass {

        public static void print() {
            System.out.println("Printed from staticInnerClass");
        }
    }
}
