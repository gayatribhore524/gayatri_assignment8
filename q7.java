import java.util.logging.Level;
import java.util.logging.Logger;

 class thread1 extends Thread {

    Numbers p;
    int i = 1;

    public thread1(Numbers p) {
        this.p = p;
    }

 
    public void run() {

        int prev = 1;
        while (prev < 1111) {
            p.printOne(prev);
            prev = (int) (prev +  Math.pow(10, i));
            i = i + 1;
        }

    }
}
 class thread2 extends Thread {

    int i = 1;

    Numbers p;

    public thread2(Numbers p) {
        this.p = p;

    }

   
    public void run() {

        int prev = 2;
        while (prev < 2222) {
            p.printTwo(prev);
            prev = (int) (prev + 2 * Math.pow(10, i));
            i = i + 1;
        }
}
}
 class Three extends Thread {

    Numbers p;
    int i = 1;

    public Three(Numbers p) {
        this.p = p;
    }

 
    public void run() {

        int prev = 3;
        while (prev < 3333) {
            p.printThree(prev);
            prev = (int) (prev + 3 * Math.pow(10, i));
            i = i + 1;
}
}
}
 class Numbers {

    public enum status {
        A, B, C
    }
    status Y=status.B;
    status X = status.A;
    
    public synchronized void printOne(int number) {
       
        if (!X.equals(status.A) && !Y.equals(status.B)) {

            try {
                wait();

            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.B;
       notifyAll();

    }

    public synchronized void printTwo(int number) {
       
        if (!X.equals(status.B) && !Y.equals(status.C)) {

            try {
               
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.C;
notifyAll();

    }

    public synchronized void printThree(int number) {
        
         if (!X.equals(status.C) && !Y.equals(status.A)) {

            try {
              
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(PrintNumbers.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + number);
        X = status.A;
    notifyAll();

    }
   
}
 class q7 {

    public static void main(String[] args) {

        Numbers b = new Numbers();

        One firstThread = new One(b);
        Two secondThread = new Two(b);
        Three thirdThread = new Three(b);

        secondThread.setName("2nd: ");
        thirdThread.setName("3rd: ");
        firstThread.setName("1st: ");

        firstThread.start();
        secondThread.start();
        thirdThread.start();
    }
}