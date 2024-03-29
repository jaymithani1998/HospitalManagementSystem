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
import model.entities.Hospital;
import model.entities.House;
import model.entities.Patient;
import ui.AdminDashboard;
import util.Utility;

/**
 *
 * @author jaymithani
 */
public class HouseDashboard extends javax.swing.JFrame {

    /**
     * Creates new form HouseDashboard
     */
    public HouseDashboard() {
        initComponents();
        populateTable();
        populateComboBoxCity();
        populateCommunityComboBox();

    }

    private void resetForm() {
        txtAptNumber.setText("");
        comboBoxCity.setSelectedIndex(0);
        comboBoxCommunity.setSelectedIndex(0);
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
        btnDelete = new javax.swing.JButton();
        DashboardRightPanel = new javax.swing.JPanel();
        lblCommunityId = new javax.swing.JLabel();
        lblAptNumber = new javax.swing.JLabel();
        lblCityId = new javax.swing.JLabel();
        txtAptNumber = new javax.swing.JTextField();
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
                "ID", "Apartment Number", "Community ID"
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
                .addGap(85, 85, 85)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        DashboardRightPanel.setBackground(new java.awt.Color(0, 153, 153));

        lblCommunityId.setBackground(new java.awt.Color(15, 15, 15));
        lblCommunityId.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunityId.setText("Community ID");

        lblAptNumber.setBackground(new java.awt.Color(15, 15, 15));
        lblAptNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblAptNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAptNumber.setText("Apt Number");

        lblCityId.setBackground(new java.awt.Color(15, 15, 15));
        lblCityId.setForeground(new java.awt.Color(255, 255, 255));
        lblCityId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCityId.setText("City ID");

        txtAptNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAptNumberActionPerformed(evt);
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

        lblId.setBackground(new java.awt.Color(15, 15, 15));
        lblId.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DashboardRightPanelLayout = new javax.swing.GroupLayout(DashboardRightPanel);
        DashboardRightPanel.setLayout(DashboardRightPanelLayout);
        DashboardRightPanelLayout.setHorizontalGroup(
            DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCityId)
                            .addComponent(lblAptNumber)
                            .addComponent(lblCommunityId))
                        .addGap(18, 18, 18)
                        .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAptNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(comboBoxCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxCommunity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        DashboardRightPanelLayout.setVerticalGroup(
            DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardRightPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAptNumber)
                    .addComponent(txtAptNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCityId))
                .addGap(18, 18, 18)
                .addGroup(DashboardRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCommunityId))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DashboardLeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DashboardRightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            
            if(txtAptNumber.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fields cannot be blank!");
            }
            else if(!Utility.isOnlyNumeric(txtAptNumber.getText())){
                JOptionPane.showMessageDialog(null, "Incorrect Apartment Number format (only numbers allowed)");
            }
            else{
            House h = new House();
            h.setAptNumber(Integer.parseInt(txtAptNumber.getText()));
            h.setCommunityId(comboBoxCommunity.getSelectedItem().toString().split(":", 2)[1]);
            h.setCityId(comboBoxCity.getSelectedItem().toString().split(":", 2)[1]);

            if (lblId.getText().isEmpty()) {
                Main.houseDirectory.addHouse(h);
            } else {
                h.setId(lblId.getText());
                Main.houseDirectory.updateHouse(h);
            }

            populateTable();
            resetForm();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new AdminDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAptNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAptNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAptNumberActionPerformed

    private void comboBoxCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCommunityActionPerformed

    private void comboBoxCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCityItemStateChanged
        populateCommunityComboBox();
    }//GEN-LAST:event_comboBoxCityItemStateChanged

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
        int SelectRowIndex = tblView.getSelectedRow();

        if (SelectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view or update details");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        String id = model.getValueAt(SelectRowIndex, 0).toString();

        HashMap<String, House> directory = Main.houseDirectory.getDirectory();

        House house = directory.get(id);
        txtAptNumber.setText(String.valueOf(house.getAptNumber()));

        String cityName = Main.cityDirectory.getDirectory().get(house.getCityId()).getCityName();
        comboBoxCity.setSelectedItem(cityName + ":" + house.getCityId());

        String communityName = Main.comDircetDirectory.getDirectory().get(house.getCommunityId()).getName();
        comboBoxCommunity.setSelectedItem(communityName + ":" + house.getCommunityId());

        lblId.setText(id);
    }//GEN-LAST:event_tblViewMouseClicked

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
            JOptionPane.showMessageDialog(this, "Atleast one house should exist in system");
            return;
        }
        if (SelectRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view or update details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        String id = model.getValueAt(SelectRowIndex, 0).toString();
        Main.houseDirectory.deleteHouse(id);
        JOptionPane.showMessageDialog(this, "House details deleted");
        resetForm();
        populateTable();
        //lblId.setText(id);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(HouseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HouseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HouseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HouseDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HouseDashboard().setVisible(true);
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
    private javax.swing.JLabel lblAptNumber;
    private javax.swing.JLabel lblCityId;
    private javax.swing.JLabel lblCommunityId;
    private javax.swing.JLabel lblId;
    private javax.swing.JScrollPane tableView;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAptNumber;
    private javax.swing.JTextField txtSearchField;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblView.getModel();
        model.setRowCount(0);
        HashMap<String, House> houseDir = Main.houseDirectory.getDirectory();
        for (String id : houseDir.keySet()) {
            Object[] row = new Object[4];
            House h = houseDir.get(id);
            row[0] = h.getId();
            row[1] = h.getAptNumber();
            row[2] = h.getCommunityId();
            row[3] = h.getCityId();
            model.addRow(row);
        }
    }
}
