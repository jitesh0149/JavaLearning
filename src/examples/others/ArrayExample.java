package examples.others;

public class ArrayExample {
    
    public static void main(String[] args) {
        //For primitive types:
        int[] myIntArray1 = new int[3];
        int[] myIntArray2 = {1, 2, 3};
        int[] myIntArray3 = new int[]{1, 2, 3};
        int myIntArray4[] = new int[3];
        int myIntArray5[] = {1, 2, 3};
        int myIntArray6[] = new int[]{1, 2, 3};

        //For classes, for example String, it's the same:
        String[] myStringArray1 = new String[3];
        String[] myStringArray2 = {"a", "b", "c"};
        String[] myStringArray3 = new String[]{"a", "b", "c"};
        String s = "abcd";
        System.out.println("" + s.substring(0, 4));
    }
}
