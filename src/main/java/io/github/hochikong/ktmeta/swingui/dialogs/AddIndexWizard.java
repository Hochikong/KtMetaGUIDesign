/*
 * Copyright 2020 Hochikong
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.hochikong.ktmeta.swingui.dialogs;

import com.formdev.flatlaf.intellijthemes.FlatSolarizedLightIJTheme;
import java.awt.Image;
import javax.swing.JRootPane;

/**
 *
 * @author ckhoi
 */
public class AddIndexWizard extends javax.swing.JDialog {

    /**
     * Creates new form AddIndexWizard
     */
    public AddIndexWizard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        HideHead();
        this.setLocationRelativeTo(null);
    }
    
    public AddIndexWizard(java.awt.Frame parent, boolean modal, Image icon){
        super(parent, modal);
        initComponents();
        HideHead();
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelIndexName = new javax.swing.JLabel();
        FieldIndexName = new javax.swing.JTextField();
        LabelIndexDesc = new javax.swing.JLabel();
        FieldIndexDesc = new javax.swing.JTextField();
        LabelIndexURL = new javax.swing.JLabel();
        FieldIndexURL = new javax.swing.JTextField();
        BTNIndexTestConn = new javax.swing.JButton();
        ProgressBarTestConn = new javax.swing.JProgressBar();
        BTNCancelAddIndex = new javax.swing.JButton();
        BTNOKAddIndex = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/Dialogs/AddIndexWizard_trans"); // NOI18N
        setTitle(bundle.getString("ADD ELASTICSEARCH INDEX")); // NOI18N
        setUndecorated(true);

        LabelIndexName.setText(bundle.getString("INDEX NAME : ")); // NOI18N

        FieldIndexName.setForeground(new java.awt.Color(204, 204, 204));
        FieldIndexName.setText(bundle.getString("ALIAS OF ELASTICSEARCH INDEX")); // NOI18N
        FieldIndexName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldIndexNameFocusGained(evt);
            }
        });

        LabelIndexDesc.setText(bundle.getString("DESCRIPTION : ")); // NOI18N

        FieldIndexDesc.setForeground(new java.awt.Color(204, 204, 204));
        FieldIndexDesc.setText(bundle.getString("DESCRIPTION OF ELASTICSEARCH INDEX")); // NOI18N
        FieldIndexDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldIndexDescFocusGained(evt);
            }
        });

        LabelIndexURL.setText(bundle.getString("INDEX URL :")); // NOI18N

        FieldIndexURL.setForeground(new java.awt.Color(204, 204, 204));
        FieldIndexURL.setText("http://xxxxx/xxx:9200");
        FieldIndexURL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FieldIndexURLFocusGained(evt);
            }
        });

        BTNIndexTestConn.setText(bundle.getString("TEST CONNECTION")); // NOI18N
        BTNIndexTestConn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIndexTestConnActionPerformed(evt);
            }
        });

        BTNCancelAddIndex.setText(bundle.getString("CANCEL")); // NOI18N
        BTNCancelAddIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelAddIndexActionPerformed(evt);
            }
        });

        BTNOKAddIndex.setText(bundle.getString("OK")); // NOI18N
        BTNOKAddIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNOKAddIndexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNIndexTestConn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(ProgressBarTestConn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                            .addComponent(BTNOKAddIndex)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(BTNCancelAddIndex))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelIndexURL, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelIndexName)
                                .addComponent(LabelIndexDesc))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(FieldIndexURL)
                                .addComponent(FieldIndexDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                .addComponent(FieldIndexName)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIndexName)
                    .addComponent(FieldIndexName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldIndexDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIndexDesc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldIndexURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIndexURL))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTNIndexTestConn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProgressBarTestConn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BTNCancelAddIndex)
                        .addComponent(BTNOKAddIndex)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNIndexTestConnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIndexTestConnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNIndexTestConnActionPerformed

    //</Auto-Generate>
    private void BTNCancelAddIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelAddIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNCancelAddIndexActionPerformed

    private void BTNOKAddIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNOKAddIndexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNOKAddIndexActionPerformed

    private void FieldIndexNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldIndexNameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIndexNameFocusGained

    private void FieldIndexDescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldIndexDescFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIndexDescFocusGained

    private void FieldIndexURLFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FieldIndexURLFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldIndexURLFocusGained
    //</Auto-Generate>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatSolarizedLightIJTheme.install();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddIndexWizard dialog = new AddIndexWizard(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                dialog.BTNCancelAddIndex.requestFocusInWindow();
                dialog.setVisible(true);
            }
        });
    }
    
    //<My-Custom>
    protected void HideHead(){
        // Like IDEA style
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    }
    //</My-Custom>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton BTNCancelAddIndex;
    protected javax.swing.JButton BTNIndexTestConn;
    protected javax.swing.JButton BTNOKAddIndex;
    protected javax.swing.JTextField FieldIndexDesc;
    protected javax.swing.JTextField FieldIndexName;
    protected javax.swing.JTextField FieldIndexURL;
    protected javax.swing.JLabel LabelIndexDesc;
    protected javax.swing.JLabel LabelIndexName;
    protected javax.swing.JLabel LabelIndexURL;
    protected javax.swing.JProgressBar ProgressBarTestConn;
    // End of variables declaration//GEN-END:variables
}
