/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControlRoom;
import java.awt.Color;
import obs.Observer;

public class Tank extends javax.swing.JFrame implements Observer{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tank.class.getName());
    
    private ControlRoom controlroom;
    
    public Tank(ControlRoom controlRoom) {
        initComponents();
        setVisible(true);
        setTitle("Tank");
        this.controlroom=controlRoom;
        setBounds(0, 540, 960, 540); 
        setSize(820,575);
        btnTankLaser.setEnabled(false);
        btnTankMissile.setEnabled(false);
        btnTankShoot.setEnabled(false);
        btnTankRotate.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnTankSolider = new javax.swing.JSpinner();
        spnTankAmmo = new javax.swing.JSpinner();
        txtTankArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTankShoot = new javax.swing.JButton();
        btnTankMissile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTankLaser = new javax.swing.JButton();
        txtFieldTank = new javax.swing.JTextField();
        btnTankSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTankMessage = new javax.swing.JTextArea();
        sldTank = new javax.swing.JSlider();
        btnTankRotate = new javax.swing.JButton();
        btnTankPosition = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTankArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTankArea.setText("Area Not Cleared");

        jLabel2.setText("Ammo Count");

        btnTankShoot.setBackground(new java.awt.Color(0, 0, 0));
        btnTankShoot.setForeground(new java.awt.Color(255, 255, 255));
        btnTankShoot.setText("Shoot");

        btnTankMissile.setText("Missile Operation");
        btnTankMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankMissileActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Solider Count");

        btnTankLaser.setText("Redar Operation");
        btnTankLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankLaserActionPerformed(evt);
            }
        });

        txtFieldTank.setBackground(new java.awt.Color(204, 204, 204));
        txtFieldTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldTankActionPerformed(evt);
            }
        });

        btnTankSend.setText("Send");
        btnTankSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankSendActionPerformed(evt);
            }
        });

        txtTankMessage.setColumns(20);
        txtTankMessage.setRows(5);
        jScrollPane1.setViewportView(txtTankMessage);

        sldTank.setMajorTickSpacing(20);
        sldTank.setOrientation(javax.swing.JSlider.VERTICAL);
        sldTank.setPaintLabels(true);
        sldTank.setPaintTicks(true);
        sldTank.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnTankRotate.setBackground(new java.awt.Color(0, 0, 0));
        btnTankRotate.setForeground(new java.awt.Color(255, 255, 255));
        btnTankRotate.setText("Rotate Operation");
        btnTankRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankRotateActionPerformed(evt);
            }
        });

        btnTankPosition.setText("Position");
        btnTankPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankPositionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled design (3).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFieldTank)
                                .addGap(18, 18, 18)
                                .addComponent(btnTankSend, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTankShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTankLaser, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTankRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTankMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnTankSolider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnTankPosition, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)))
                .addComponent(sldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnTankSolider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTankPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTankShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTankMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTankLaser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTankRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTankSend, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTankMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankMissileActionPerformed

    private void btnTankLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankLaserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankLaserActionPerformed

    private void btnTankSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankSendActionPerformed
        String msg="Tank : "+txtFieldTank.getText();
        MainController.sendMessageDefence(msg);
    }//GEN-LAST:event_btnTankSendActionPerformed

    private void btnTankRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankRotateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankRotateActionPerformed

    private void btnTankPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankPositionActionPerformed

    private void txtFieldTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldTankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldTankActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTankLaser;
    private javax.swing.JButton btnTankMissile;
    private javax.swing.JCheckBox btnTankPosition;
    private javax.swing.JButton btnTankRotate;
    private javax.swing.JButton btnTankSend;
    private javax.swing.JButton btnTankShoot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sldTank;
    private javax.swing.JSpinner spnTankAmmo;
    private javax.swing.JSpinner spnTankSolider;
    private javax.swing.JTextField txtFieldTank;
    private javax.swing.JLabel txtTankArea;
    private javax.swing.JTextArea txtTankMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean areaClear) {
        if (areaClear) {
            txtTankArea.setOpaque(true);
            txtTankArea.setText("Area Cleared");
            txtTankArea.setBackground(Color.green);
        }else{
            txtTankArea.setOpaque(true);
            txtTankArea.setText("Area Not Cleared");
            txtTankArea.setBackground(Color.red);
        }}

    @Override
    public void getMsg(String msg) {
        txtTankMessage.append("Main Controller :  "+msg+"\n");
    }

    @Override
    public void setPosition(int position) {
       if(btnTankPosition.isSelected()){
            if(position>80){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankLaser.setEnabled(true);
                btnTankRotate.setEnabled(true);
            }
            else if(position>60){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankLaser.setEnabled(true);
            }
            else if(position>40){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
            }
            else if(position>20){
                btnTankShoot.setEnabled(true);
            }
            
            if(position<20){
                btnTankShoot.setEnabled(false);
                btnTankMissile.setEnabled(false);
                btnTankLaser.setEnabled(false);
                btnTankRotate.setEnabled(false);
            }
            else if(position<40){
                btnTankMissile.setEnabled(false);
                btnTankLaser.setEnabled(false);
                btnTankRotate.setEnabled(false);
            }
            else if(position<60){
                btnTankLaser.setEnabled(false);
                btnTankRotate.setEnabled(false);
            }
            else if(position<80){
                btnTankRotate.setEnabled(false);
            }
        } 
    }

    @Override
    public void getPrivateMsg(String defence, String msg) {
        if("Tank".equals(defence)){
            txtTankMessage.append(msg+"\n");
        }
    }
}
