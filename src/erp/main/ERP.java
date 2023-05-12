/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package erp.main;

import WelcomeScreen.WcScr;
import com.formdev.flatlaf.FlatLightLaf;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Muneeb Ahmad
 */
public class ERP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        //FlatLightLaf.setup();
        WcScr obj = new WcScr();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println("Error: " + e.getMessage());
        }
        obj.main();
    }
    
}
