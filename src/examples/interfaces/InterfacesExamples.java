package examples.interfaces;

public class InterfacesExamples {

    public static void main(String[] args) {

        RainbowColors r = new ImplementationClass();
        r.BaseColorMethod2();
        System.out.println("Rainbow Color Green : " + RainbowColors.GREEN);
        System.out.println("Base Color Green : " + BaseColors.GREEN);
        //ImplementationClass can directly called but based upon its visibility
        ImplementationClass c = new ImplementationClass();
        c.BaseColorMethod1();
        //anonymous  class implementing an interface
        RainbowColors r2 = new RainbowColors() {

            @Override
            public void RainbowColorMethod() {
                System.out.println("Anonymous Interfaces implementation");
            }

            @Override
            public void BaseColorMethod2() {
                System.out.println("Anonymous Interfaces implementation");
            }

            @Override
            public void BaseColorMethod1() {
                System.out.println("Anonymous Interfaces implementation");
            }
        };
        r2.BaseColorMethod1();


    }
}
