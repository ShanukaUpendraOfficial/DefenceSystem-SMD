package view;

import controller.ControlRoom;
import java.awt.Color;
import obs.Observer;

public class Helicopter extends javax.swing.JFrame implements Observer{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Helicopter.class.getName());
    
    private ControlRoom controlroom;
    
    public Helicopter(ControlRoom controlRoom) {
        initComponents();
        setTitle("Helicopter");
        this.controlroom=controlRoom;
        setVisible(true);
        setBounds(960, 0, 960, 540);
        setSize(820,575);
        btnShoot.setEnabled(false);
        btnMissile.setEnabled(false);
        btnLaser.setEnabled(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtArea = new javax.swing.JLabel();
        btnShoot = new javax.swing.JButton();
        btnMissile = new javax.swing.JButton();
        btnLaser = new javax.swing.JButton();
        txtFieldHelicopter = new javax.swing.JTextField();
        btnHelicopterSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHelicopterMessage = new javax.swing.JTextArea();
        spnSoliderCount = new javax.swing.JSpinner();
        spnAmmoCount = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldHelicopter = new javax.swing.JSlider();
        btnHelicopterPosition = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtArea.setText("Area Not Cleared");
        getContentPane().add(txtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 137, 400, 45));

        btnShoot.setText("Shoot");
        getContentPane().add(btnShoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 188, 150, 36));

        btnMissile.setBackground(new java.awt.Color(0, 0, 0));
        btnMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnMissile.setText("Missile Operation");
        btnMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMissileActionPerformed(evt);
            }
        });
        getContentPane().add(btnMissile, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 188, 150, 36));

        btnLaser.setBackground(new java.awt.Color(0, 0, 0));
        btnLaser.setForeground(new java.awt.Color(255, 255, 255));
        btnLaser.setText("Laser Operation");
        btnLaser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaserActionPerformed(evt);
            }
        });
        getContentPane().add(btnLaser, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 230, 150, 36));

        txtFieldHelicopter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldHelicopterActionPerformed(evt);
            }
        });
        getContentPane().add(txtFieldHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 492, 609, 36));

        btnHelicopterSend.setText("Send");
        btnHelicopterSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelicopterSendActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelicopterSend, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 493, 81, 36));

        txtHelicopterMessage.setColumns(20);
        txtHelicopterMessage.setRows(5);
        jScrollPane1.setViewportView(txtHelicopterMessage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 279, 694, 207));
        getContentPane().add(spnSoliderCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 174, -1, -1));
        getContentPane().add(spnAmmoCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 202, -1, -1));

        jLabel2.setText("Ammo Count");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 205, 125, -1));

        jLabel3.setText("Solider Count");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 177, 125, -1));

        sldHelicopter.setMajorTickSpacing(20);
        sldHelicopter.setOrientation(javax.swing.JSlider.VERTICAL);
        sldHelicopter.setPaintLabels(true);
        sldHelicopter.setPaintTicks(true);
        getContentPane().add(sldHelicopter, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 162, 81, 358));

        btnHelicopterPosition.setText("Position");
        btnHelicopterPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelicopterPositionActionPerformed(evt);
            }
        });
        getContentPane().add(btnHelicopterPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(587, 232, -1, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 69));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled design (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 0, -1, 136));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 126, 820, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelicopterSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelicopterSendActionPerformed
        String msg="Helicopter : "+txtFieldHelicopter.getText();
        MainController.sendMessageDefence(msg);
    }//GEN-LAST:event_btnHelicopterSendActionPerformed

    private void btnLaserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLaserActionPerformed

    private void btnMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMissileActionPerformed

    private void btnHelicopterPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelicopterPositionActionPerformed
        if(!(btnHelicopterPosition.isSelected())){
            btnShoot.setEnabled(false);
            btnMissile.setEnabled(false);
            btnLaser.setEnabled(false);
        }
    }//GEN-LAST:event_btnHelicopterPositionActionPerformed

    private void txtFieldHelicopterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldHelicopterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldHelicopterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox btnHelicopterPosition;
    private javax.swing.JButton btnHelicopterSend;
    private javax.swing.JButton btnLaser;
    private javax.swing.JButton btnMissile;
    private javax.swing.JButton btnShoot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sldHelicopter;
    private javax.swing.JSpinner spnAmmoCount;
    private javax.swing.JSpinner spnSoliderCount;
    private javax.swing.JLabel txtArea;
    private javax.swing.JTextField txtFieldHelicopter;
    private javax.swing.JTextArea txtHelicopterMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean areaClear) {
        if (areaClear) {
            txtArea.setOpaque(true);
            txtArea.setText("Area Cleared");
            txtArea.setBackground(Color.green);
        }else{
            txtArea.setOpaque(true);
            txtArea.setText("Area Not Cleared");
            txtArea.setBackground(Color.RED);
        }
    }

    @Override
    public void getMsg(String msg) {
       txtHelicopterMessage.append("Main Controller :  "+msg+"\n");
    }

    @Override
    public void setPosition(int position) {
        if(btnHelicopterPosition.isSelected()){
            if(position>60){
                btnShoot.setEnabled(true);
                btnMissile.setEnabled(true);
                btnLaser.setEnabled(true);
            }
            else if(position>40){
                btnShoot.setEnabled(true);
                btnMissile.setEnabled(true);
            }
            else if(position>20){
                btnShoot.setEnabled(true);
            }
            
            if(position<20){
                btnShoot.setEnabled(false);
                btnMissile.setEnabled(false);
                btnLaser.setEnabled(false);
            }
            else if(position<40){
                btnMissile.setEnabled(false);
                btnLaser.setEnabled(false);
            }
            else if(position<60){
                btnLaser.setEnabled(false);
            }
        }
    }

    @Override
    public void getPrivateMsg(String defence, String msg) {
        if("Helicopter".equals(defence)){
            txtHelicopterMessage.append(msg+"\n");
        }
    }
}
