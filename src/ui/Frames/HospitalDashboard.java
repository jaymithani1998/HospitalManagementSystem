/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Frames;

import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.Main;
import model.entities.Community;
import model.entities.Hospital;
import model.entities.Person;
import ui.AdminDashboard;
import ui.Login;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class HospitalDashboard extends javax.swing.JFrame {

    /**
     * Creates new form HospitalDashboard
     */
    public HospitalDashboard() {
        initComponents();
        populateComboBoxCity();
        populateCommunityComboBox();
        populateTable();
        if (Main.currentUser.getRole().equals("Patient")) {
            btnUpdate.setVisible(false);
            DashboardRightPanel.setVisible(false);
            btnBack.setVisible(false);
        } else {
            logoutButton.setVisible(false);
        }

    }

    private void resetForm() {
        txtHospitalName.setText("");
        comboBoxCommunity.setSelectedIndex(0);
        comboBoxCity.setSelectedIndex(0);
        lblId.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DashboardLeftPanel = new javax.swing.JPanel();
        txtSearchField = new javax.swing.JTextField();
        tableView = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        DashboardRightPanel = new javax.swing.JPanel();
        lblCommunityId = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        lblCityId = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        comboBoxCommunity = new javax.swing.JComboBox<>();
        comboBoxCity = new javax.swing.JComboBox<>();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DashboardLeftPanel.setBackground(new java.awt.Color(0, 153, 153));

        txtSearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchFieldKeyReleased(evt);
            }
        });

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Hospital Name", "City ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewMouseClicked(evt);
            }
        });
        tableView.setViewportView(tblView);

        btnUpdate.setText("Add/Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DashboardLeftPanelLayout = new javax.swing.GroupLayout(DashboardLeftPanel);
        DashboardLeftPanel.setLayout(DashboardLeftPanelLayout);
        DashboardLeftPanelLayout.setHorizontalGroup(
            DashboardLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DashboardLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearchField)
                    .addComponent(tableView, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(DashboardLeftPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addGap(26, 26, 26))
        );
        DashboardLeftPanelLayout.setVerticalGroup(
            DashboardLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableView, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnBack)
                    .addComponent(logoutButton)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        DashboardRightPanel.setBackground(new java.awt.Color(0, 153, 153));

        lblCommunityId.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunityId.setText("Community ID");

        lblHospitalName.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHospitalName.setText("Hospital Name");

        lblCityId.setForeground(new java.awt.Color(255, 255, 255));
        lblCityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityId.setText("City ID");

        txtHospitalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospitalNameActionPerformed(evt);
            }
        });

        comboBoxCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCommunityActionPerformed(evt);
            }
        });

        comboBoxCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCityItemStateChanged(evt);
            }
        });

        lblId.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DashboardRightPanelLayout = new javax.swing.GroupLayout(DashboardRightPanel);
        DashboardRightPanel.setLayout(DashboardRightPanelLayout);
        DashboardRightPanelLayout.setHorizontalGroup(
            DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                            .addComponent(lblCityId)
                            .addGap(18, 18, 18)
                            .addComponent(comboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                            .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblHospitalName)
                                .addComponent(lblCommunityId))
                            .addGap(18, 18, 18)
                            .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        DashboardRightPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxCity, comboBoxCommunity, txtHospitalName});

        DashboardRightPanelLayout.setVerticalGroup(
            DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHospitalName))
                .addGap(21, 21, 21)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityId))
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityId))
                .addContainerGap(339, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DashboardLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashboardRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DashboardRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DashboardLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if(txtHospitalName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fields cannot be blank!");
            }
            else if(!Utility.isOnlyAlphabets(txtHospitalName.getText())){
                    JOptionPane.showMessageDialog(null, "Incorrect Hospital Name format (only alphabets allowed)");
            }
            else{
            Hospital h = new Hospital();
            h.setName(txtHospitalName.getText());
            h.setCommunityId(comboBoxCommunity.getSelectedItem().toString().split(":", 2)[1]);
            h.setCityId(comboBoxCity.getSelectedItem().toString().split(":", 2)[1]);
            if (lblId.getText().isEmpty()) {
                Main.hosDirectory.addHospital(h);
            } else {
                h.setId(lblId.getText());
                Main.hosDirectory.updateHospital(h);
            }

            populateTable();
            resetForm();
        }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtHospitalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospitalNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospitalNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboBoxCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCityItemStateChanged
        populateCommunityComboBox();
    }//GEN-LAST:event_comboBoxCityItemStateChanged

    public void populateComboBoxCity() {
        String[] cityNames = Main.cityDirectory.getCitiesForComboBox();
        DefaultComboBoxModel model = new DefaultComboBoxModel(cityNames);
        comboBoxCity.setModel(model);
    }

    public void populateCommunityComboBox() {
        String cityId = comboBoxCity.getSelectedItem().toString().split(":", 2)[1];
        String[] communityNames = Main.comDircetDirectory.getCommunitiesForComboBox(cityId);
        DefaultComboBoxModel model = new DefaultComboBoxModel(communityNames);
        comboBoxCommunity.setModel(model);
    }

    private void comboBoxCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCommunityActionPerformed

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
        int SelectRowIndex = tblView.getSelectedRow();

        if (SelectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view or update details");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        String id = model.getValueAt(SelectRowIndex, 0).toString();

        HashMap<String, Hospital> directory = Main.hosDirectory.getDirectory();

        Hospital hospital = directory.get(id);
        txtHospitalName.setText(hospital.getName());

        String cityName = Main.cityDirectory.getDirectory().get(hospital.getCityId()).getCityName();
        comboBoxCity.setSelectedItem(cityName + ":" + hospital.getCityId());

        String communityName = Main.comDircetDirectory.getDirectory().get(hospital.getCommunityId()).getName();
        comboBoxCommunity.setSelectedItem(communityName + ":" + hospital.getCommunityId());

        lblId.setText(id);
    }//GEN-LAST:event_tblViewMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void txtSearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel)tblView.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tblView.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchField.getText().trim()));
    }//GEN-LAST:event_txtSearchFieldKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int SelectRowIndex = tblView.getSelectedRow();
        int countRow = tblView.getRowCount();
        if(countRow==1){
            JOptionPane.showMessageDialog(this, "Atleast one hospital should exist in system");
            return;
        }
        if (SelectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view or update details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        String id = model.getValueAt(SelectRowIndex, 0).toString();

        Main.hosDirectory.deleteHospital(id);
        JOptionPane.showMessageDialog(this, "Hospital details deleted");
        resetForm();
        populateTable();
        //lblId.setText(id);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DashboardLeftPanel;
    private javax.swing.JPanel DashboardRightPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblId;
    private javax.swing.JButton logoutButton;
    private javax.swing.JScrollPane tableView;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtSearchField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        HashMap<String, Hospital> hdir = Main.hosDirectory.getDirectory();
        for (String id : hdir.keySet()) {
            Object[] row = new Object[3];
            Hospital h = hdir.get(id);
            row[0] = h.getId();
            row[1] = h.getName();
            row[2] = h.getCommunityId();
            model.addRow(row);
        }
    }
}
