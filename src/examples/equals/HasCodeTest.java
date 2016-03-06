/*
 * The hash code for a String object is computed as:
 s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
 */
package examples.equals;

public class HasCodeTest {

    public static void main(String args[]) {
        String Str = "Anu";
        System.out.println("Hashcode for Str :" + Str.hashCode());
    }
}
