/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package erp.login;

import Admin_Dashboard.Main_Box;
import DatabaseConnectivity.connectivity;
import Faculity_Dashboard.Faculity_Main_Box;
import java.awt.Frame;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Muneeb Ahmad
 */
public class login extends javax.swing.JFrame {
    public ResultSet myres = null;
    connectivity conn;
    
    /**
     * Creates new form login
     */
    public login() throws SQLException {
        this.conn = new connectivity();
        initComponents();
      
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        iconic = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        valid = new javax.swing.JLabel();
        error = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkBorderRadius(0);
        kGradientPanel2.setkEndColor(new java.awt.Color(102, 102, 102));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 0, 0));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UNIVERSITY OF");
        kGradientPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        iconic.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        iconic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/erp logo.png"))); // NOI18N
        kGradientPanel2.add(iconic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 180, 210));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Welcome To");
        kGradientPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HOGWARDS");
        kGradientPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ERP");
        kGradientPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("MS PGothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("System");
        kGradientPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/overlay.png"))); // NOI18N
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 107, -1, 450));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png"))); // NOI18N
        minimize.setIconTextGap(14);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        kGradientPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 30, 30));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png"))); // NOI18N
        close.setIconTextGap(14);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        kGradientPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        maximize.setForeground(new java.awt.Color(204, 204, 204));
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png"))); // NOI18N
        maximize.setIconTextGap(14);
        kGradientPanel2.add(maximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 30, 30));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 455));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setText("LOGIN FORM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Password");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Email");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 30));

        Email.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 153, 153)));
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailKeyReleased(evt);
            }
        });
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 259, 31));

        Pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 209, 260, 30));

        kButton1.setBackground(new java.awt.Color(0, 204, 204));
        kButton1.setText("Login");
        kButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        kButton1.setkBackGroundColor(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        kButton1.setkBorderRadius(0);
        kButton1.setkHoverColor(new java.awt.Color(83, 173, 69));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 204, 204));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 153, 153));
        kButton1.setkIndicatorColor(new java.awt.Color(0, 102, 102));
        kButton1.setOpaque(true);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 100, 40));

        jLabel4.setText("Designed & Developed By");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setText("Tech Pirates");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));
        jPanel1.add(valid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, -1, -1));

        error.setEnabled(false);
        error.setVisible(false);
        error.setkEndColor(new java.awt.Color(255, 0, 0));
        error.setkStartColor(new java.awt.Color(255, 0, 0));
        error.setOpaque(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email or Password is Wrong");

        javax.swing.GroupLayout errorLayout = new javax.swing.GroupLayout(error);
        error.setLayout(errorLayout);
        errorLayout.setHorizontalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, errorLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(33, 33, 33))
        );
        errorLayout.setVerticalGroup(
            errorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(errorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 270, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 768, 455);

        setSize(new java.awt.Dimension(768, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

               
    }//GEN-LAST:event_EmailActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String email = Email.getText();
        String password = Pass.getText();
        
        try {
            myres = conn.mystmt.executeQuery("select * from person");
            while(myres.next())
            {
            String dbUserID = myres.getString("UserID");
            String dbemail = myres.getString("Email");
            String dbpass =  myres.getString("Password");
            String dbrole =  myres.getString("Role");
            if(dbemail.equals(email) && dbpass.equals(password))
            {
                System.out.println("Email OR PAssword is Write");
                //finalgif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giiffy.gif")));
                if(dbrole.equals("Admin"))
                {
        
                    System.out.println("Admins Here");
                    
                    this.dispose();
                    Thread.sleep(2000);
                    Main_Box mbox=new Main_Box(dbUserID);
                    mbox.setVisible(true);
                   

                }
                else if(dbrole.equals("Teacher"))
                {
                    System.out.println("Teacher Here");
                    this.dispose();
                    Thread.sleep(2000);
                    Faculity_Main_Box fmbox=new Faculity_Main_Box(dbUserID);
                    fmbox.setVisible(true);
                }
                else
                {
                    System.out.println("Student Here");
                }
            }
            else
            {
                System.out.println("Email OR PAssword is Wrong and wromng");
                error.setVisible(true);
            }
            }
        } catch (SQLException ex) {
            System.out.println("Email OR PAssword is Wrong");
        } catch (InterruptedException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void EmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyReleased
        if(Email.getText().contains("@"))
        {
            valid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_ok_15px.png")));
        }
        else
        {
            valid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_15px.png")));
        }
    }//GEN-LAST:event_EmailKeyReleased

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_yellow.png")));
    }//GEN-LAST:event_minimizeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
       close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png")));
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png")));
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new login().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel close;
    private com.k33ptoo.components.KGradientPanel error;
    private javax.swing.JLabel iconic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel valid;
    // End of variables declaration//GEN-END:variables
}
