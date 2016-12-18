/*
 Given A = 1, B = 2, C = 3, D = 4 ?? Z = 26, write a java standalone
 program to encode the word ?ELEPHENT? into numbers. 
 */
package examples.problems;

class ElephantProblem {

    public static void main(String ar[]) {
        String enCodeWord = "ELEPHENT";
        String result = "";
        for (int i = 0; i < enCodeWord.length(); i++) {
            switch (enCodeWord.charAt(i)) {
                case 'A':
                    result = result + "1";
                    break;
                case 'B':
                    result = result + "2";
                    break;
                case 'C':
                    result = result + "3";
                    break;
                case 'D':
                    result = result + "4";
                    break;
                case 'E':
                    result = result + "5";
                    break;
                case 'F':
                    result = result + "6";
                    break;
                case 'G':
                    result = result + "7";
                    break;
                case 'H':
                    result = result + "8";
                    break;
                case 'I':
                    result = result + "9";
                    break;
                case 'J':
                    result = result + "10";
                    break;
                case 'K':
                    result = result + "11";
                    break;
                case 'L':
                    result = result + "12";
                    break;
                case 'M':
                    result = result + "13";
                    break;
                case 'N':
                    result = result + "14";
                    break;
                case 'O':
                    result = result + "15";
                    break;
                case 'P':
                    result = result + "16";
                    break;
                case 'Q':
                    result = result + "17";
                    break;
                case 'R':
                    result = result + "18";
                    break;
                case 'S':
                    result = result + "19";
                    break;
                case 'T':
                    result = result + "20";
                    break;
                case 'U':
                    result = result + "21";
                    break;
                case 'V':
                    result = result + "22";
                    break;
                case 'W':
                    result = result + "23";
                    break;
                case 'X':
                    result = result + "24";
                    break;
                case 'Y':
                    result = result + "25";
                    break;
                case 'Z':
                    result = result + "26";
                    break;
            }
        }
        System.out.println(result);
    }
}
/* 
Output:

512516851420
*/