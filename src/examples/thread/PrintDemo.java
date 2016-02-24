package examples.thread;

class PrintDemo {

    public void printCount(String threadName) {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Counter of "+threadName+"  ---   " + i);
            }
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
}
