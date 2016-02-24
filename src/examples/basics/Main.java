package examples.basics;

public class Main {

    public static void main(String[] args) {
        System.out.println("" + StaticInitializationBlocksEx.i);
        ConstructorTest t = new ConstructorTest();
        System.out.println("Before StaticInitBlock");
        StaticInitializationBlocksEx staticInitializationBlocksEx = new StaticInitializationBlocksEx();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
    }
}
