/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CreatePanels;

/**
 *
 * @author jaymithani
 */
public class CreateCity extends javax.swing.JPanel {

    /**
     * Creates new form CreateCity
     */
    public CreateCity() {
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

        PanelCreateCity = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        txtCityName = new javax.swing.JTextField();

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("City");

        txtCityName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCreateCityLayout = new javax.swing.GroupLayout(PanelCreateCity);
        PanelCreateCity.setLayout(PanelCreateCityLayout);
        PanelCreateCityLayout.setHorizontalGroup(
            PanelCreateCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateCityLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        PanelCreateCityLayout.setVerticalGroup(
            PanelCreateCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCreateCityLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(PanelCreateCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(427, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCreateCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelCreateCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCityNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCreateCity;
    private javax.swing.JLabel lblCity;
    private javax.swing.JTextField txtCityName;
    // End of variables declaration//GEN-END:variables
}
