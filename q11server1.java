import java.io.*; 
import java.net.*; 
  
class q11server1 { 
  
    public static void main(String args[]) 
        throws Exception 
    { 
  
        
        ServerSocket ss = new ServerSocket(888); 
  
       
        Socket s = ss.accept(); 
        System.out.println("Connection established"); 
    PrintStream ps 
            = new PrintStream(s.getOutputStream()); 
  
      
        BufferedReader br 
            = new BufferedReader( 
                new InputStreamReader( 
                    s.getInputStream())); 
  
       
        BufferedReader kb 
            = new BufferedReader( 
                new InputStreamReader(System.in)); 
  
      
        while (true) { 
  
            String str, str1; 
  
            while ((str = br.readLine()) != null) { 
                System.out.println(str); 
                str1 = kb.readLine(); 
  
                // send to client 
                ps.println(str1); 
            } 
  
           
            ps.close(); 
            br.close(); 
            kb.close(); 
            ss.close(); 
            s.close(); 
  
           
            System.exit(0); 
  
        } 
    } 
} 
