public class q8 {
    static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int i = 0; i < 20; i = i+2 ) {
                    synchronized (lock) {
                        System.out.print(" " + i);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int i = 1; i < 20; i = i+2) {
                    synchronized (lock) {
                        System.out.print(" " + i);
                        try {
                            lock.notify();
                            if(i==50)
                                break;
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        try {
            t1.start();
            t2.start();
            //t1.join();
            //t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }
    }
}