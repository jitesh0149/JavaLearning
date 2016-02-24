package examples.equals;

public class EqualHashCodeTests {

    public static void main(String[] args) {
        //Returns a hash code for this string. 
        //The hash code for a String object is computed as
        //s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
        String s1 = "1";//String s3 = new String("1") both are same
        String s2 = "2";
        String s3 = "3";
        String sA = "A";
        String sB = "B";
        String sAB = "AB";
        String sAa = "Aa";
        String sBB = "BB";
        //ASCII character code
        System.out.println("s1.hashCode() : " + s1.hashCode());
        System.out.println("s2.hashCode() : " + s2.hashCode());
        System.out.println("s3.hashCode() : " + s3.hashCode());
        System.out.println("sA.hashCode() : " + sA.hashCode());
        System.out.println("sB.hashCode() : " + sB.hashCode());
        System.out.println("sAB.hashCode() : " + sAB.hashCode());
        System.out.println("sAa.hashCode() : " + sAa.hashCode());
        System.out.println("sBB.hashCode() : " + sBB.hashCode());
        Integer i1 = 1;
        Integer i2 = 2;
        Integer i3 = 3;
        System.out.println("i1.hashCode() : " + i1.hashCode());
        System.out.println("i2.hashCode() : " + i2.hashCode());
        System.out.println("i3.hashCode() : " + i3.hashCode());
        //Object hasCode returns garbage value
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        System.out.println("o1.hashCode() : " + o1.hashCode());
        System.out.println("o2.hashCode() : " + o2.hashCode());
        System.out.println("o3.hashCode() : " + o3.hashCode());
    }
}
