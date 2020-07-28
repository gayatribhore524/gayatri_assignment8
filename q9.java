import java.io.*;
public class q9 extends Thread  
{  
  public void run()  
    {    
    System.out.println("thread running...");    
    }    
    public static void main(String args[]) throws InterruptedException 
    {    
		q9 q1=new q9();  
Thread T=new Thread(q1);

          
        T.start();    
    
        T.run(); 
}   
    
}    