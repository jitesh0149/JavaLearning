package examples.problems;

public class ElephantProblem1 {

    public static void main(String[] args) {
        String s = "TELEPHONE";
        char[] arrChar = s.toCharArray();
        int[] val = new int[s.length()];
        int i = 0;
        for (char c : arrChar) {
            val[i] = (c - 'A') + 1;
            i++;
        }
        for (int z : val) {
            System.out.print(z);
        }
        System.out.println("");
        System.out.println("The value of 'C' - 'A' is " + ('C'-'A'));
    }

}
/*
Output

20512516815145
The value of 'C' - 'A' is 2
*/