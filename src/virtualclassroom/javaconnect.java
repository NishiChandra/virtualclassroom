/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualclassroom;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Nishi
 */
public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb() {
        //To change body of generated methods, choose Tools | Templates.
        try{
            Class.forName("com.mysql.jdbc.Driver");
             System.out.println("Connecting to database..");
            String URL="jdbc:mysql://localhost/virtualclassroom";
            String user="root";
            String password="nishi";
            Connection conn = DriverManager.getConnection(URL,user,password);
            System.out.println("Connected..");
            return conn;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
