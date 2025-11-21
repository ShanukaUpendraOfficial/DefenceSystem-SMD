package view;

import controller.ControlRoom;
import obs.Observer;

public class MainController extends javax.swing.JFrame implements Observer{
    
    //private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainController.class.getName());
    
    private ControlRoom controlroom;
     
    //new MainController(controlRoom)
    public MainController(ControlRoom controlRoom) {
        this.controlroom=controlRoom;
        initComponents();
        setTitle("Main Controller");
        setVisible(true);
        setBounds(0, 0, 960, 540); 
        setSize(820,575);
        //cmbSelectDefence.setEnabled(chkSendPrivate.isSelected());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbSelectDefence = new javax.swing.JComboBox<>();
        btnCollectInfo = new javax.swing.JButton();
        chkAreaClear = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldMainController = new javax.swing.JSlider();
        chkSendPrivate = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSendMain = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMainRecieve = new javax.swing.JTextArea();
        lblSoilderCount = new javax.swing.JLabel();
        lblFuelCount = new javax.swing.JLabel();
        lblAmmoCount = new javax.swing.JLabel();
        txtSendMsg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbSelectDefence.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Tank", "Helicopter", "Submarine" }));
        cmbSelectDefence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectDefenceActionPerformed(evt);
            }
        });

        btnCollectInfo.setText("Collect Informations");
        btnCollectInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCollectInfoActionPerformed(evt);
            }
        });

        chkAreaClear.setText("Area Clear");
        chkAreaClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAreaClearActionPerformed(evt);
            }
        });

        jLabel1.setText("Soldier Amount");

        jLabel2.setText("Fuel Amount");

        jLabel3.setText("Ammo Amount");

        sldMainController.setMajorTickSpacing(20);
        sldMainController.setPaintLabels(true);
        sldMainController.setPaintTicks(true);
        sldMainController.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldMainControllerStateChanged(evt);
            }
        });

        chkSendPrivate.setText("Send Private");
        chkSendPrivate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSendPrivateActionPerformed(evt);
            }
        });

        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtSendMain.setColumns(20);
        txtSendMain.setRows(5);
        jScrollPane2.setViewportView(txtSendMain);

        txtMainRecieve.setColumns(20);
        txtMainRecieve.setRows(5);
        jScrollPane3.setViewportView(txtMainRecieve);

        txtSendMsg.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSendMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSendMsgActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Untitled design.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sldMainController, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(chkSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFuelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoilderCount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnCollectInfo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chkAreaClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSelectDefence, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCollectInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSoilderCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFuelCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAmmoCount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkAreaClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sldMainController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkSendPrivate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCollectInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCollectInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCollectInfoActionPerformed

    private void chkAreaClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAreaClearActionPerformed
       boolean areaClear = chkAreaClear.isSelected();
       controlroom.setArea(areaClear);
       
    }//GEN-LAST:event_chkAreaClearActionPerformed

    private void cmbSelectDefenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectDefenceActionPerformed
    
    }//GEN-LAST:event_cmbSelectDefenceActionPerformed

    private void chkSendPrivateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSendPrivateActionPerformed
        
    }//GEN-LAST:event_chkSendPrivateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String podi=txtSendMsg.getText();
        
        if(chkSendPrivate.isSelected()){
            String name = cmbSelectDefence.getSelectedItem().toString();
            controlroom.sendMessagePrivate(name,"Main Controller : "+podi);
        }else{
            controlroom.sendMessage(podi);
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSendMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendMsgActionPerformed
        
    }//GEN-LAST:event_txtSendMsgActionPerformed

    private void sldMainControllerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldMainControllerStateChanged
       int value=sldMainController.getValue();
       controlroom.setValue(value);
    }//GEN-LAST:event_sldMainControllerStateChanged
    public void updateInbox(){
        txtSendMain.setText("");
    }
    
    public static void sendMessageDefence(String msg){
        try{
            javax.swing.text.Document doc = txtSendMain.getDocument();
            doc.insertString(doc.getLength(), msg + "\n", null);
            txtSendMain.setCaretPosition(doc.getLength());
        }catch (javax.swing.text.BadLocationException e) {
        }
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCollectInfo;
    private javax.swing.JCheckBox chkAreaClear;
    private javax.swing.JCheckBox chkSendPrivate;
    private javax.swing.JComboBox<String> cmbSelectDefence;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAmmoCount;
    private javax.swing.JLabel lblFuelCount;
    private javax.swing.JLabel lblSoilderCount;
    private javax.swing.JSlider sldMainController;
    private javax.swing.JTextArea txtMainRecieve;
    public static javax.swing.JTextArea txtSendMain;
    private javax.swing.JTextField txtSendMsg;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean areaClear) {
        
    }

    @Override
    public void getMsg(String msg) {
        
    }

    @Override
    public void setPosition(int position) {
        
    }

    @Override
    public void getPrivateMsg(String defence, String msg) {
        
    }
}
