package examples.basics;

public class StaticInitializationBlocksEx {

    static int i = 12;

    public void testMethod() {
        System.out.println("testMethod from StaticInitializationBlocksEx called");
    }
//Non Static Initializer block

    {
        System.out.println("StaticInitializationBlocksEx called(Non Static11)");
    }
    MemberClassEx m = new MemberClassEx();

    {
        System.out.println("StaticInitializationBlocksEx called(Non Static)");
    }

    static {
        System.out.println("StaticInitializationBlocksEx called(Static)");
    }

    public StaticInitializationBlocksEx() {
        System.out.println("Constructor ........");
    }
}
