package examples.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThread {

    public static void main(String args[]) {

        PrintDemo PD = new PrintDemo();

        ThreadDemo T1 = new ThreadDemo("Thread - 1 ", PD);
        ThreadDemo T2 = new ThreadDemo("Thread - 2 ", PD);
        T1.start();
        T2.start();
//        try {
//            T1.join(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
//     
//
//        T2.start();
//         try {
//            T1.join(10000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Check cases by uncommenting below statements one by one
        //T1.start();
        //T1.start();
        //T1.run();
        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
