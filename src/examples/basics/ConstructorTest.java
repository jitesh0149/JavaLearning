package examples.basics;

public class ConstructorTest {

    OtherClass c = new OtherClass();

    //public ConstructorTest()  - Constructor can not have a return type if class having constructor with return type it will assumed as method
    protected ConstructorTest() {
        System.out.println("Called...");
        StaticInitializationBlocksEx staticInitializationBlocksEx = new StaticInitializationBlocksEx();
        staticInitializationBlocksEx.testMethod();
    }

    public void method1() {
    }

    public String method1(Integer p_integer) {
        return null;
    }

    {
        System.out.println("Hi");
    }
//    Below Method will be invalid
//    public void method1(Integer p_integer) {
//        return null;
//    }
}
