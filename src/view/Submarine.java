package view;

import controller.ControlRoom;
import java.awt.Color;
import obs.Observer;

public class Submarine extends javax.swing.JFrame implements Observer{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Submarine.class.getName());
    
    private ControlRoom controlroom;
    
    public Submarine(ControlRoom controlRoom) {
        initComponents();
        setVisible(true);
        setTitle("Submarine");
        this.controlroom=controlRoom;
        setBounds(960, 540, 960, 540);  
        setSize(820,575);
        btnSubMissile.setEnabled(false);
        btnSubShoot.setEnabled(false);
        btnTomaMissile.setEnabled(false);
        btnTridentMissile.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubMissile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTomaMissile = new javax.swing.JButton();
        txtFieldSubMessage = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaSubMessage = new javax.swing.JTextArea();
        spnSubSoilder = new javax.swing.JSpinner();
        spnSubAmmo = new javax.swing.JSpinner();
        jSlider1 = new javax.swing.JSlider();
        txtSubArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTridentMissile = new javax.swing.JButton();
        btnSubShoot = new javax.swing.JButton();
        chkPosition = new javax.swing.JCheckBox();
        jSlider2 = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSubMissile.setBackground(new java.awt.Color(0, 0, 0));
        btnSubMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnSubMissile.setText("Missile Operation");
        btnSubMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubMissileActionPerformed(evt);
            }
        });

        jLabel3.setText("Solider Count");

        btnTomaMissile.setBackground(new java.awt.Color(0, 0, 0));
        btnTomaMissile.setForeground(new java.awt.Color(255, 255, 255));
        btnTomaMissile.setText("Tomahawk Missile");
        btnTomaMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomaMissileActionPerformed(evt);
            }
        });

        txtFieldSubMessage.setBackground(new java.awt.Color(204, 204, 204));

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtAreaSubMessage.setColumns(20);
        txtAreaSubMessage.setRows(5);
        jScrollPane1.setViewportView(txtAreaSubMessage);

        jSlider1.setMajorTickSpacing(20);
        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);

        txtSubArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtSubArea.setText("Area Not Cleared");

        jLabel2.setText("Ammo Count");

        btnTridentMissile.setText("Trident-2 Missile");
        btnTridentMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTridentMissileActionPerformed(evt);
            }
        });

        btnSubShoot.setText("Shoot");

        chkPosition.setText("Position");
        chkPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPositionActionPerformed(evt);
            }
        });

        jSlider2.setMajorTickSpacing(20);
        jSlider2.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider2.setPaintLabels(true);
        jSlider2.setPaintTicks(true);

        jLabel4.setText("Energy");

        jLabel5.setText("Oxigen");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled design (2).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnSubShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTomaMissile, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnTridentMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSubMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSubAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnSubSoilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(chkPosition, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFieldSubMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSubArea, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSubShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTomaMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTridentMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnSubSoilder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnSubAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chkPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFieldSubMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubMissileActionPerformed

    private void btnTomaMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomaMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTomaMissileActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String msg="Submarine : "+txtFieldSubMessage.getText();
        MainController.sendMessageDefence(msg);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnTridentMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTridentMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTridentMissileActionPerformed

    private void chkPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPositionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubMissile;
    private javax.swing.JButton btnSubShoot;
    private javax.swing.JButton btnTomaMissile;
    private javax.swing.JButton btnTridentMissile;
    private javax.swing.JCheckBox chkPosition;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSpinner spnSubAmmo;
    private javax.swing.JSpinner spnSubSoilder;
    private javax.swing.JTextArea txtAreaSubMessage;
    private javax.swing.JTextField txtFieldSubMessage;
    private javax.swing.JLabel txtSubArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean areaClear) {
       if (areaClear) {
           txtSubArea.setOpaque(true);
           txtSubArea.setText("Area Cleared");
           txtSubArea.setBackground(Color.green);
        }else{
           txtSubArea.setOpaque(true);
           txtSubArea.setText("Area Not Cleared");
           txtSubArea.setBackground(Color.red);
        }}

    @Override
    public void getMsg(String msg) {
        txtAreaSubMessage.append("Main Controller :  "+msg+"\n");
    }

    @Override
    public void setPosition(int position) {
        if(chkPosition.isSelected()){
        if(position>80){
                btnSubShoot.setEnabled(true);
                btnSubMissile.setEnabled(true);
                btnTomaMissile.setEnabled(true);
                btnTridentMissile.setEnabled(true);
            }
            else if(position>60){
                btnSubShoot.setEnabled(true);
                btnSubMissile.setEnabled(true);
                btnTomaMissile.setEnabled(true);
            }
            else if(position>40){
                btnSubShoot.setEnabled(true);
                btnSubMissile.setEnabled(true);
            }else if(position>20){
                btnSubShoot.setEnabled(true);
            }
            
            if(position<20){
                btnSubShoot.setEnabled(false);
                btnSubMissile.setEnabled(false);
                btnTomaMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
            }
            else if(position<40){
                btnSubMissile.setEnabled(false);
                btnTomaMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
            }
            else if(position<60){
                btnTomaMissile.setEnabled(false);
                btnTridentMissile.setEnabled(false);
            }else if(position<80){
                btnTridentMissile.setEnabled(false);
            }
        }
    }

    @Override
    public void getPrivateMsg(String defence, String msg) {
        if("Submarine".equals(defence)){
            txtAreaSubMessage.append(msg+"\n");
        }
    }

}
