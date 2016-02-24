package examples.interfaces;

public class ImplementationClass implements RainbowColors {

    @Override
    public void RainbowColorMethod() {
        System.out.println("Rainbow Color Method");
    }

    @Override
    public void BaseColorMethod1() {
        System.out.println("Base Color Method 1");
    }

    @Override
    public void BaseColorMethod2() {
        System.out.println("Base Color Method 2");
    }
}
