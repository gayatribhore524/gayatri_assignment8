public class q10 extends Thread {
   public void run() {
      for (int i = 0; i < 5; i++) {
         System.out.println(" Thread  " + Thread.currentThread().getName());
      }
   }
   public static void main(String[] args) {
      q10  q1 = new q10 ();
      q1.setName("Main Thread");
      q1.start();
      Thread t2 = currentThread();
      t2.setName("Current Thread");
      for (int i = 0; i < 5; i++) {
         System.out.println(" Thread  " + q1.currentThread().getName());
      }
   }
}