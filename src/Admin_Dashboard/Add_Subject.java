/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin_Dashboard;

import DatabaseConnectivity.connectivity;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muneeb Ahmad
 */
public class Add_Subject extends javax.swing.JFrame {

    ResultSet myres = null;
    ResultSet myres1 = null;
    connectivity con;
    String Dept = null;
    int sem = 0;
    String SubCode;
    String DeptCode = null;
    private connectivity conn;

    /**
     * Creates new form Add_Department
     */
    public Add_Subject() throws SQLException {
        initComponents();
        this.con = new connectivity();
        kButton2.setVisible(false);

    }

    public Add_Subject(String abc1, String numberOnly) throws SQLException {
        this.con = new connectivity();
        initComponents();
        Dept = abc1;
        sem = Integer.parseInt(numberOnly);
        setSubCode();
        kButton2.setVisible(false);

    }

    Add_Subject(String Sub_Code, String Sub_Name, String Sub_Type, String Sub_marks) {
        initComponents();
        this.conn = new connectivity();
        jTextField1.setText(Sub_Code.replaceAll("\\s", ""));
        jTextField1.setEditable(false);
        jTextField2.setText(Sub_Name);
        jTextField3.setText(Sub_marks);
        jComboBox1.setSelectedItem(Sub_Type);
        jLabel1.setText("Update Subject");
        kButton1.setText("Update Subject");
        kButton2.setVisible(true);
        SubCode = Sub_Code;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        kButton1 = new com.k33ptoo.components.KButton();
        jTextField3 = new javax.swing.JTextField();
        Dept_err = new javax.swing.JLabel();
        Dept_err1 = new javax.swing.JLabel();
        valid1 = new javax.swing.JLabel();
        valid2 = new javax.swing.JLabel();
        kButton2 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setOpaque(false);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD NEW SUBJECT");

        maximize.setForeground(new java.awt.Color(204, 204, 204));
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png"))); // NOI18N
        maximize.setIconTextGap(14);
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeMouseExited(evt);
            }
        });

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

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimize)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Subject Code");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Auto Generated");
        jTextField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Subject Name");

        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jTextField2.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField2.setOpaque(true);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject Type");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Marks");

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Core", "Optional" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        kButton1.setText("Add Subject");
        kButton1.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        kButton1.setkEndColor(new java.awt.Color(0, 204, 0));
        kButton1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton1.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        jTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField3.setOpaque(true);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        Dept_err.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err.setText("[Mandatory]");

        Dept_err1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err1.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err1.setText("[Mandatory]");

        kButton2.setText("Delete Subject");
        kButton2.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        kButton2.setkEndColor(new java.awt.Color(255, 0, 51));
        kButton2.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton2.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valid1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dept_err1))
                    .addComponent(jLabel4)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valid2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dept_err))
                    .addComponent(jTextField2)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox1, 0, 315, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Dept_err))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(Dept_err1))
                            .addComponent(valid1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(valid2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(371, 515));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void setSubCode() {

        try {
            myres1 = con.mystmt.executeQuery("select * from department where DEPARTMENT_NAME='" + Dept + "'");
            while (myres1.next()) {
                DeptCode = myres1.getString("DEPT_CODE");
            }
            myres = con.mystmt.executeQuery("select * from subject where SEMESTER_NO ='" + sem + "' and DEPT_CODE='" + DeptCode + "'");
            int sr = 0;
            while (myres.next()) {
                sr++;
            }
            System.out.println("Rows are: " + sr);
            int code = 100 + sr + 1;
            myres1 = con.mystmt.executeQuery("select * from department where DEPARTMENT_NAME='" + Dept + "'");
            while (myres1.next()) {
                DeptCode = myres1.getString("DEPT_CODE");
            }
            SubCode = DeptCode + "-" + sem + "-" + code;
            jTextField1.setText(SubCode);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        if (jComboBox1.getSelectedItem().equals("Select") || jTextField2.getText().equals(null) || jTextField3.getText().equals(null)) {
            System.out.println(jComboBox1.getSelectedItem() + " " + jTextField2.getText() + " " + jTextField3.getText());
            JOptionPane.showMessageDialog(null, "Fill All Data Please!");
        } else {
            int result = 0;
            String SubName = jTextField2.getText();
            Object SubType = jComboBox1.getSelectedItem();
            String Marks = jTextField3.getText();

            try {

                String query = "update subject set SUB_NAME='" + SubName + "', SUBJECT_TYPE='" + SubType + "', TOTAL_MARKS='" + Marks + "' where SUB_CODE='" + SubCode + "'";
                PreparedStatement pr = con.myconn.prepareStatement(query);
                result = pr.executeUpdate();
                System.out.println("addStudentTheoryMarks --> Update : "+result);
                if (result == 0) {
                    query = "insert into subject values(?,?,?,?,?,?)";
                    pr = con.myconn.prepareStatement(query);
                    pr.setString(2, SubName);
                    pr.setString(1, SubCode);
                    pr.setString(3, DeptCode);
                    pr.setInt(4, sem);
                    pr.setString(5, (String) SubType);
                    pr.setInt(6, Integer.parseInt(Marks));

                    pr.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Subject Added Successfully");
                    this.dispose();
                    Subjects sub = new Subjects();
                    sub.fetchDept();
                } else {
                    JOptionPane.showMessageDialog(null, "Subject Update Successfully");
                    this.dispose();
                    Subjects sub = new Subjects();
                    sub.fetchDept();
                }

            } catch (SQLException ex) {
                Logger.getLogger(Assigning_subject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "SomeThing Went Wrong!");
                this.dispose();
                this.setVisible(true);
            } catch (NullPointerException ex) {
                Logger.getLogger(Add_student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Fill All Data Please!!!");
                this.dispose();
                this.setVisible(true);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Add_student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Enter valid Data!");
                this.dispose();
                this.setVisible(true);
            }
        }


    }//GEN-LAST:event_kButton1ActionPerformed

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        int state = this.getExtendedState();

        if (state == 0) {
//            this.setExtendedState(Frame.MAXIMIZED_BOTH);
        } else {
            // this.setExtendedState(Frame.NORMAL);
        }
    }//GEN-LAST:event_maximizeMouseClicked

    private void maximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseEntered
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_blue.png")));
    }//GEN-LAST:event_maximizeMouseEntered

    private void maximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseExited
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png")));
    }//GEN-LAST:event_maximizeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_yellow.png")));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png")));
    }//GEN-LAST:event_minimizeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_white.png")));
    }//GEN-LAST:event_closeMouseExited

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        if (jTextField2.getText().matches("[a-zA-Z_\\s]+")) {
            kButton1.setEnabled(true);
            kButton1.setkHoverEndColor(new java.awt.Color(0, 204, 0));
            kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 0));

            valid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_ok_15px.png")));
        } else {
            kButton1.setEnabled(false);
            kButton1.setkHoverEndColor(new java.awt.Color(204, 0, 0));
            kButton1.setkHoverStartColor(new java.awt.Color(204, 0, 0));
            valid2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_15px.png")));
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        if (jTextField3.getText().matches("[0-9]+")) {
            kButton1.setEnabled(true);
            kButton1.setkHoverEndColor(new java.awt.Color(0, 204, 0));
            kButton1.setkHoverStartColor(new java.awt.Color(0, 204, 0));

            valid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_ok_15px.png")));
        } else {
            kButton1.setEnabled(false);
            kButton1.setkHoverEndColor(new java.awt.Color(204, 0, 0));
            kButton1.setkHoverStartColor(new java.awt.Color(204, 0, 0));
            valid1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_15px.png")));
        }
    }//GEN-LAST:event_jTextField3KeyReleased

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed

        try {
            String query = "delete from subject where SUB_CODE='" + SubCode + "'";
            PreparedStatement pr = conn.myconn.prepareStatement(query);
            pr.executeUpdate();
            JOptionPane.showMessageDialog(null, "Subject Deleted Successfully");
            this.dispose();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Something Went Wrong");
        }
    }//GEN-LAST:event_kButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.err.println("Error: " + e.getMessage());
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Add_Subject().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Add_Subject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dept_err;
    private javax.swing.JLabel Dept_err1;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel valid1;
    private javax.swing.JLabel valid2;
    // End of variables declaration//GEN-END:variables
}