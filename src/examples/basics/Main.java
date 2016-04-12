package examples.basics;

public class Main {

    Main m;

    //Following statement will give java.lang.StackOverflow Error
    //Main m1=new Main();
    public static void main(String[] args) {
        //Following statement is fine        
        //new Main();
        //Following statement will give java.lang.StackOverflowError
        //Main.main(args);
        System.out.println("" + StaticInitializationBlocksEx.i);
        //Following code call the StaticInitilizationBlock from other's class constructor
        ConstructorTest t = new ConstructorTest();
        System.out.println("Before StaticInitBlock");
        StaticInitializationBlocksEx staticInitializationBlocksEx = new StaticInitializationBlocksEx();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
    }
}

/*
 Output

 StaticInitializationBlocksEx called(Static)
 12
 OtherClass
 Hi
 Called...
 StaticInitializationBlocksEx called(Non Static11)
 StaticInitializationBlocksEx called(Non Static)
 Constructor ........
 testMethod from StaticInitializationBlocksEx called
 Before StaticInitBlock
 StaticInitializationBlocksEx called(Non Static11)
 StaticInitializationBlocksEx called(Non Static)
 Constructor ........
 testMethod from StaticInitializationBlocksEx called
 testMethod from StaticInitializationBlocksEx called
 testMethod from StaticInitializationBlocksEx called
 */
