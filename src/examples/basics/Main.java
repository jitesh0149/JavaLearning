package examples.basics;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import java.util.HashMap;

public class Main {

    Main m;

    //Following statement will give java.lang.StackOverflow Error
    //Main m1=new Main();

    public static void main(String[] args) {
        new Main();
        System.out.println("" + StaticInitializationBlocksEx.i);
        ConstructorTest t = new ConstructorTest();
        System.out.println("Before StaticInitBlock");
        StaticInitializationBlocksEx staticInitializationBlocksEx = new StaticInitializationBlocksEx();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
        staticInitializationBlocksEx.testMethod();
    }
}
