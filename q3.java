class X extends Thread { 
  
    
    public void run() 
    { 
        for (int i = 1; i <= 4; i++) { 
            try { 
                wait(); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            System.out.print(i + " "); 
        } 
    } 
} 
class Y extends Thread { 
  
    
    public void run() 
    {   System.out.println(Thread.currentThread().getName() + " in control"); 
        for (char i = 'p'; i <= 'q'; i++) { 
            try { 
                Thread.sleep(100); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            System.out.print(i + " ");
            
          
        } 
    } 
} 
class q3 extends Thread { 
  
    public static void main(String args[]) 
    { 
      
        X x1 = new X(); 
        Y y1 = new Y(); 
  
      
        x1.start(); 
        x1.setPriority(5);
        System.out.println(x1.isAlive()); 
        y1.start();
        try { 
            x1.join(); 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
  
       
    } 
} 