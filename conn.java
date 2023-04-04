
package bank.management.system;
// conn is for connectivity in jdbc

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{
            //STEP 1 REGISTER DRIVER :
             // it  is static clss 
            Class.forName("com.mysql.jdbc.Driver");
            // STEP 2 CREATE CONNECTION 
            // drivemanager function and get connect //function driver ka 
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Uma@0852");    
            // STEP 3 CREATE STATEMENT :
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
