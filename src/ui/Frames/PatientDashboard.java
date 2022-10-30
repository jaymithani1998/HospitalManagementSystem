/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Frames;

import main.Main;
import model.entities.Patient;

/**
 *
 * @author jaymithani
 */
public class PatientDashboard extends javax.swing.JFrame {

    /**
     * Creates new form PatientDashboard
     */
    public PatientDashboard() {
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

        DashboardLeftPanel1 = new javax.swing.JPanel();
        txtSearchField1 = new javax.swing.JTextField();
        tableView1 = new javax.swing.JScrollPane();
        tblView1 = new javax.swing.JTable();
        btnUpdate1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        DashboardRightPanel1 = new javax.swing.JPanel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblCommunityId = new javax.swing.JLabel();
        txtCommunityId = new javax.swing.JTextField();
        lblCityId = new javax.swing.JLabel();
        txtCityId = new javax.swing.JTextField();
        lblHouseId = new javax.swing.JLabel();
        txtHouseId = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DashboardLeftPanel1.setBackground(new java.awt.Color(255, 255, 204));

        tblView1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Patient Name", "Age"
            }
        ));
        tableView1.setViewportView(tblView1);

        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        btnBack1.setText("Back");

        javax.swing.GroupLayout DashboardLeftPanel1Layout = new javax.swing.GroupLayout(DashboardLeftPanel1);
        DashboardLeftPanel1.setLayout(DashboardLeftPanel1Layout);
        DashboardLeftPanel1Layout.setHorizontalGroup(
            DashboardLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLeftPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchField1)
                    .addComponent(tableView1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(DashboardLeftPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnUpdate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack1)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        DashboardLeftPanel1Layout.setVerticalGroup(
            DashboardLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLeftPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableView1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLeftPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate1)
                    .addComponent(btnBack1))
                .addContainerGap())
        );

        DashboardRightPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age");

        lblCommunityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunityId.setText("Community ID");

        txtCommunityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommunityIdActionPerformed(evt);
            }
        });

        lblCityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityId.setText("City ID");

        txtCityId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityIdActionPerformed(evt);
            }
        });

        lblHouseId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHouseId.setText("House Id");

        txtHouseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHouseIdActionPerformed(evt);
            }
        });

        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("Username");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Doctor Name");

        javax.swing.GroupLayout DashboardRightPanel1Layout = new javax.swing.GroupLayout(DashboardRightPanel1);
        DashboardRightPanel1.setLayout(DashboardRightPanel1Layout);
        DashboardRightPanel1Layout.setHorizontalGroup(
            DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardRightPanel1Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                        .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                            .addComponent(lblHouseId)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                                .addComponent(lblCityId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge)
                                    .addComponent(lblCommunityId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(54, 54, 54))
        );

        DashboardRightPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCityId, lblCommunityId, lblHouseId, lblName, lblPassword, lblUserName});

        DashboardRightPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtPersonName, txtUserName});

        DashboardRightPanel1Layout.setVerticalGroup(
            DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunityId)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCityId)
                    .addComponent(txtCityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseId)
                    .addComponent(txtHouseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblPassword))
                    .addGroup(DashboardRightPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(DashboardRightPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardLeftPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashboardRightPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DashboardRightPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardLeftPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        Patient p = new Patient();
        p.setAge(Integer.parseInt(txtAge.getText()));
        p.setCommunityId(txtCommunityId.getText());
        p.setCityId(txtCityId.getText());
        p.setHouseId(txtHouseId.getText());
        p.setName(txtPersonName.getText());
        p.setUserName(txtUserName.getText());
        p.setPassword(txtPassword.getText());
        p.setRole("Patient");
        Main.patDirectory.addPatient(p);
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtCommunityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommunityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommunityIdActionPerformed

    private void txtCityIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityIdActionPerformed

    private void txtHouseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHouseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHouseIdActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardLeftPanel1;
    private javax.swing.JPanel DashboardRightPanel1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblHouseId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JScrollPane tableView1;
    private javax.swing.JTable tblView1;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCityId;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtHouseId;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtSearchField1;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}