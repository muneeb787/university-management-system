/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseConnectivity;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Muneeb Ahmad
 */
public class connectivity {
    public Connection myconn=null;
    public Statement mystmt = null;
    public int chk_conn=0;
    public connectivity()
    {
        try {
            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3310/erpsystem","root","root");
            mystmt = myconn.createStatement();
        } catch (SQLException ex) {
            //Logger.getLogger(connectivity.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Databaase Connection Error");
             chk_conn++;
        }
       
    }
    
        
}
