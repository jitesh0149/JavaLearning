
package test;
 
public class BubbleSort {
 
       public static void main(String[] args) {
              int a[] = { 3, 4, 99, 6, 1, 2, 88 };
              int size = a.length;
              int temp;
              
              printList(a, "This is initial list: ");
 
              for (int i = 0; i < size; i++) {
                     for (int j = 0; j < size - i - 1; j++) {
                           if (a[j] > a[j + 1]) {
                                  temp = a[j];
                                  a[j] = a[j + 1];
                                  a[j + 1] = temp;
                           }
                     }
              }
 
              printList(a, "This is final list: ");
 
       }
 
       public static void printList(int[] a, String message) {
              System.out.println(message);
              for (int i = 0; i < a.length; i++) {
                     System.out.print(" " + a[i]);
              }
              System.out.println("");
       }
}
