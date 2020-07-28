class q5 extends Thread{  
 public void run(){  
   System.out.println("Task number one");
   for(int g=1;g<20;g++)
    {
     System.out.println(g);
    }
   System.out.println("Task  number two");
   for(int h=20;h<30;h++)
     {
      System.out.println(h);
     }
   System.out.println("Task number three");
   for(int k=30;k<40;k++)
      {
    System.out.println(k);
      }
 }  
 public static void main(String args[]){  
  q5 q1=new q5();  
  
  q1.start();  
  
 }  
}