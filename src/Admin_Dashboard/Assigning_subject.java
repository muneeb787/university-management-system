/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin_Dashboard;

import DatabaseConnectivity.connectivity;
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
public class Assigning_subject extends javax.swing.JFrame {

    ResultSet myres = null;
    ResultSet myres1 = null;
    connectivity con;
    String Dept = null;
    int sem = 0;
    String DeptCode = null;
    String SubjectCode = null;
    String DeptName = null;
    String faculity_ID = null;

    /**
     * Creates new form Add_Department
     */
    public Assigning_subject() throws SQLException {
        this.con = null;
        initComponents();
        this.con = new connectivity();
        fetchDept();
        System.out.println("asdf");
    }

    Assigning_subject(String fac_ID) throws SQLException {
        this.con = null;
        initComponents();
        this.con = new connectivity();
        faculity_ID = fac_ID;
        fetchDept();
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
        Dept_err = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Subjects = new javax.swing.JComboBox<>();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel11 = new javax.swing.JLabel();
        DeptNaming = new javax.swing.JComboBox<>();
        Fac_name = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        Semester = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Dept_err1 = new javax.swing.JLabel();
        Dept_err2 = new javax.swing.JLabel();
        Dept_err3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setForeground(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel1.setOpaque(false);

        Dept_err.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err.setText("[Mandatory]");

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Assign Subject");

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
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maximize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minimize))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject");

        Subjects.setBackground(new java.awt.Color(51, 51, 51));
        Subjects.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Subjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        Subjects.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Subjects.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SubjectsItemStateChanged(evt);
            }
        });

        kButton1.setText("Assign");
        kButton1.setkBackGroundColor(new java.awt.Color(204, 204, 204));
        kButton1.setkEndColor(new java.awt.Color(204, 204, 204));
        kButton1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(102, 102, 102));
        kButton1.setkStartColor(new java.awt.Color(51, 51, 51));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Department");

        DeptNaming.setBackground(new java.awt.Color(51, 51, 51));
        DeptNaming.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DeptNaming.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        DeptNaming.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        DeptNaming.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DeptNamingItemStateChanged(evt);
            }
        });
        DeptNaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptNamingActionPerformed(evt);
            }
        });

        Fac_name.setBackground(new java.awt.Color(51, 51, 51));
        Fac_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fac_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        Fac_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Fac_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fac_nameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Faculity Name ");

        Semester.setBackground(new java.awt.Color(51, 51, 51));
        Semester.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Semester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        Semester.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Semester.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SemesterItemStateChanged(evt);
            }
        });
        Semester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemesterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Semester");

        Dept_err1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err1.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err1.setText("[Mandatory]");

        Dept_err2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err2.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err2.setText("[Mandatory]");

        Dept_err3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Dept_err3.setForeground(new java.awt.Color(255, 0, 51));
        Dept_err3.setText("[Mandatory]");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dept_err2))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(Dept_err))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(Dept_err1))
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dept_err3)))
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(DeptNaming, javax.swing.GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
                            .addComponent(Fac_name, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 107, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Dept_err))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeptNaming, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Dept_err1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fac_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dept_err2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Semester, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Dept_err3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(383, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void fetchDept() throws SQLException {

        try {
            myres = con.mystmt.executeQuery("select * from department");
            if (myres.getRow() <= 0) {
                int sr = 0;
                System.out.println("Fetching...");
                while (myres.next()) {
                    DeptNaming.addItem(myres.getString("DEPARTMENT_NAME"));
                    System.out.println(myres.getString("DEPARTMENT_NAME"));
                }
            } else {
                System.out.println("No Record Found");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed

        if (DeptNaming.getSelectedItem().equals("Select") || Fac_name.getSelectedItem().equals("Select") || Semester.getSelectedItem().equals("Select") || Subjects.getSelectedItem().equals("Select")) {
            JOptionPane.showMessageDialog(null, "Fill All Data Please!");
        } else {
            String Semester1 = (String) Semester.getSelectedItem();
            String numberOnly = Semester1.replaceAll("[^0-9]", "");

            System.out.println("Dept Code is: " + DeptCode);
            System.out.println("Course Code is: " + SubjectCode);
            System.out.println("Sem is: " + numberOnly);
            System.out.println("Faculity ID is: " + faculity_ID);

            try {

                String query = "Insert into assignedsubjects values (?,?,?)";
                PreparedStatement pr = con.myconn.prepareStatement(query);
                pr.setString(1, DeptCode);
                pr.setString(2, faculity_ID);
                pr.setString(3, SubjectCode);
                pr.executeUpdate();
                JOptionPane.showMessageDialog(null, "Subject Assigned Successfully");
                this.dispose();

            } catch (SQLException ex) {
                Logger.getLogger(Assigning_subject.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "SomeThing Went Wrong!");

            } catch (NullPointerException ex) {
                Logger.getLogger(Add_student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Fill All Data Please!");

            } catch (IllegalArgumentException ex) {
                Logger.getLogger(Add_student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Enter valid Data!");

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

    private void DeptNamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptNamingActionPerformed
        if (DeptNaming.getSelectedItem().equals("Select")) {
            String value[] = {"Select"};
            Semester.setModel(new javax.swing.DefaultComboBoxModel(value));
        } else {
            String value[] = {"Select", "Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
            Semester.setModel(new javax.swing.DefaultComboBoxModel(value));
        }
    }//GEN-LAST:event_DeptNamingActionPerformed

    private void Fac_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fac_nameActionPerformed
        String Facname = (String) Fac_name.getSelectedItem();
        try {

            myres = con.mystmt.executeQuery("select * from staff join person on staff.USERID=person.USERID where NAME = '" + Facname + "'");
            while (myres.next()) {
                faculity_ID = myres.getString("STAFF_ID");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Fac_nameActionPerformed

    private void DeptNamingItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DeptNamingItemStateChanged
        Fac_name.removeAllItems();
        Fac_name.addItem("Select");
        String DeptName = (String) DeptNaming.getSelectedItem();
        try {
            myres1 = con.mystmt.executeQuery("select * from department where DEPARTMENT_NAME = '" + DeptName + "' ");
            while (myres1.next()) {
                DeptCode = myres1.getString("DEPT_CODE");
            }
            myres = con.mystmt.executeQuery("select * from staff join person on staff.USERID=person.USERID where DEPT_CODE = '" + DeptCode + "'");
            System.out.println(myres.next());

            while (myres.next()) {
                Fac_name.addItem(myres.getString("NAME"));
                System.out.println(myres.getString("NAME"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DeptNamingItemStateChanged

    private void SubjectsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SubjectsItemStateChanged
        String SubName = (String) Subjects.getSelectedItem();
        try {

            myres = con.mystmt.executeQuery("select * from subject where SUB_NAME = '" + SubName + "'");
            while (myres.next()) {
                SubjectCode = myres.getString("SUB_CODE");
                System.out.println(myres.getString("SUB_CODE"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SubjectsItemStateChanged

    private void SemesterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SemesterItemStateChanged
        Subjects.removeAllItems();
        Subjects.addItem("Select");
        String Semester1 = (String) Semester.getSelectedItem();
        String numberOnly = Semester1.replaceAll("[^0-9]", "");
        System.out.println("Semester is : " + numberOnly);
        try {
            myres = con.mystmt.executeQuery("select * from subject where DEPT_CODE = '" + DeptCode + "' and SEMESTER_NO='" + numberOnly + "'");

            while (myres.next()) {
                Subjects.addItem(myres.getString("SUB_NAME"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SemesterItemStateChanged

    private void SemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemesterActionPerformed

    }//GEN-LAST:event_SemesterActionPerformed

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
            java.util.logging.Logger.getLogger(Assigning_subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assigning_subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assigning_subject.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assigning_subject.class
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
                    new Assigning_subject().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Assigning_subject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DeptNaming;
    private javax.swing.JLabel Dept_err;
    private javax.swing.JLabel Dept_err1;
    private javax.swing.JLabel Dept_err2;
    private javax.swing.JLabel Dept_err3;
    private javax.swing.JComboBox<String> Fac_name;
    private javax.swing.JComboBox<String> Semester;
    private javax.swing.JComboBox<String> Subjects;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
