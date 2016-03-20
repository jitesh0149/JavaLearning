package examples.basics;

public class SubStringExample {

    public static void main(String[] args) {
        //Substring example
        String a = "Jitesh";
        System.out.println("a.substring(0) : " + a.substring(0));
        System.out.println("a.substring(2) : " + a.substring(2));
        System.out.println("a.substring(0,2) : " + a.substring(0, 2));
        System.out.println("a.substring(2,2) : " + a.substring(2, 2));
        //Following Statement will give runtime error:  java.lang.StringIndexOutOfBoundsException: String index out of range: -1
        //System.out.println("a.substring(3,2) : " + a.substring(3, 2));
        //Following Statement will give runtime error:  java.lang.StringIndexOutOfBoundsException: String index out of range: -2
        //System.out.println("a.substring(3,2) : " + a.substring(4, 2));
        
        
    }

}
