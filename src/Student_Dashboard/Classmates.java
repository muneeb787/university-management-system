/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Student_Dashboard;

import Faculity_Dashboard.*;
import DatabaseConnectivity.connectivity;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Muneeb Ahmad
 */
public final class Classmates extends javax.swing.JPanel {

    ResultSet myres = null;
    connectivity con = null;
    String STUDENT_ID = null;
    String Sub_Code = null;
    String Sub_Name = null;
    String Sem_No = null;
    String Dept_Code = null;
    String Dept_Name = null;
    String Sub_Type = null;

    /**
     * Creates new form Departments
     */
    public Classmates() throws SQLException {
        initComponents();
        con = new connectivity();
        jTable1.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableModel tMOdel = (DefaultTableModel) jTable1.getModel();
        tMOdel.setRowCount(0);
        System.out.println("dsfadfasdfsadfasd");
        fetchUserData();
    }

    Classmates(String Student_id) throws SQLException {
        initComponents();
        System.out.println("Clicking 1");
        STUDENT_ID = Student_id;
        System.out.println("Clicking 2");
        con = new connectivity();
        System.out.println("Clicking 3");
        jTable1.getTableHeader().setFont(new Font("segoe UI", Font.BOLD, 12));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
        jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
        DefaultTableModel tMOdel = (DefaultTableModel) jTable1.getModel();
        tMOdel.setRowCount(0);
        System.out.println("dsfadfasdfsadfasd");
        fetchUserData();
        System.out.println("Clicking 4");
//settable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        Subjects = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(574, 539));
        setRequestFocusEnabled(false);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        kGradientPanel2.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel2.setkStartColor(new java.awt.Color(51, 51, 51));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));
        kGradientPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CLASSMATES");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(51, 51, 51));
        jTable1.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr #", "Student ID", "Name", "Semester", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setFillsViewportHeight(true);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(51, 51, 51));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(32, 136, 203));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        kGradientPanel4.setkEndColor(new java.awt.Color(51, 51, 51));
        kGradientPanel4.setkStartColor(new java.awt.Color(51, 51, 51));
        kGradientPanel4.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Select Subject");

        Subjects.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        Subjects.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SubjectsItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addGap(653, 653, 653))
        );

        jScrollPane1.setViewportView(kGradientPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SubjectsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SubjectsItemStateChanged

    }//GEN-LAST:event_SubjectsItemStateChanged

 
    public void fetchUserData()
    {
        try {
            myres = con.mystmt.executeQuery("select * from student");
            int sr = 0;
            while (myres.next()) {
                if (myres.getString("STUDENT_ID").equals(STUDENT_ID)) {
                   
                    Sem_No = myres.getString("SEMESTER");
                    Dept_Code =  myres.getString("DEPT_CODE");
                }

            }
            settable();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public final void settable() {
        System.out.println("SetTable Called");
        try {
            myres = con.mystmt.executeQuery("select * from department where DEPT_CODE = '"+Dept_Code+"'");
            if(myres.next())
            {
                Dept_Name = myres.getString("DEPARTMENT_NAME");
            }
            myres = con.mystmt.executeQuery("select * from student join person on student.USERID = person.USERID where DEPT_CODE = '"+Dept_Code+"' and SEMESTER = '"+Sem_No+"'");
            int sr = 0;
            String Stu_ID=null;
                    String Stu_Name=null;
                            String Stu_Sem=null ;
            while (myres.next()) {
                sr++;
                if (!myres.getString("STUDENT_ID").equals(STUDENT_ID)) {

                    Stu_ID = myres.getString("STUDENT_ID");
                    Stu_Name = myres.getString("NAME");
                    //String Stu_Dept = myres.getString("STUDENT_ID");
                    Stu_Sem = myres.getString("SEMESTER");

                }
                String resultdata[] = {String.valueOf(sr),Stu_ID, Stu_Name, Stu_Sem, Dept_Name};
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        model.addRow(resultdata);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> Subjects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    // End of variables declaration//GEN-END:variables
}