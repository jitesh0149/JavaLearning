package examples.mix;

public class InnerClasses {

    public static void main(String[] args) {
        OuterClass1 o = new OuterClass1();
        OuterClass1.nonstaticinnerClass nons = o.new nonstaticinnerClass();
        nons.print();
        OuterClass1.staticinnerClass.print();
    }
}

//public class OuterClass1 - gives error as the Class as File Name can be public
//if the name is OuterClass in place of OuterClass1 then also it will give error as
//OuteClass is already exist in NestedClassTest.java in same package
class OuterClass1 {

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
