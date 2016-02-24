package examples.mix;

public class JavaApplication1 {

    public static String s1 = "Hi ..";

    public static void main(String[] args) {
        Float a = new Float("0.33");
        Float b = new Float("0.22");
        System.out.println("" + (a + b));
//        System.out.println(""+Float.NaN);
//        //System.out.println("nuu"+(null==null));
//        System.out.println(""+Float.NaN);
//        System.out.println("fdfd"+(Float.NaN==Float.NaN));
//        System.out.println("Also"+(Float.NaN==Float.intBitsToFloat(0x7fc00000)));
//        Integer a=1;
//        if(a instanceof Integer){
//            System.out.println("Done");
//        }
//        
//        test1 t = new test1();
//        test1.subclass s = t.new subclass();
//        s.getValues();
    }

    static void getValues() {
        System.out.println("I'm Called");
    }
}

class test1 {

    class subclass {

        public void getValues() {
            System.out.println(" This is subclass getValues()");
        }

        public subclass() {
        }
    }

    public void getValues() {
        System.out.println(" This is subclass getValues..............()");
    }
}
