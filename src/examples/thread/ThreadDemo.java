package examples.thread;

class ThreadDemo extends Thread {

    private Thread t;
    private String threadName;
    PrintDemo PD;

    ThreadDemo(String name, PrintDemo pd) {
        threadName = name;
        PD = pd;
    }

    @Override
    public void run() {
        PD.printCount(threadName);
        System.out.println("Thread " + threadName + " exiting.");
    }

    @Override
    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            //public Thread(Runnable target, String name)
            t = new Thread(this, threadName);
            t.start();
        }
        System.out.println("End of Start for " + Thread.currentThread().getName());
    }
}
