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
public class AddDatabaseWizard extends javax.swing.JDialog {

    /**
     * Creates new form AddDatabaseWizard
     */
    public AddDatabaseWizard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.supportedDatabaseList = new String[]{"SQLite", "PostgreSQL"};
        initComponents();
        HideHead();
        // centre
        this.setLocationRelativeTo(null);
    }

    public AddDatabaseWizard(java.awt.Frame parent, boolean modal, String[] SupportedDBList) {
        super(parent, modal);
        this.supportedDatabaseList = SupportedDBList;
        initComponents();
        HideHead();
        // centre
        this.setLocationRelativeTo(null);
    }

    public AddDatabaseWizard(java.awt.Frame parent, boolean modal, String[] SupportedDBList, Image icon) {
        super(parent, modal);
        this.supportedDatabaseList = SupportedDBList;
        initComponents();
        HideHead();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNOKAddDB = new javax.swing.JButton();
        BTNCancelAddDB = new javax.swing.JButton();
        LabelName = new javax.swing.JLabel();
        FieldName = new javax.swing.JTextField();
        LabelDescription = new javax.swing.JLabel();
        FieldDescription = new javax.swing.JTextField();
        LabelDBMS = new javax.swing.JLabel();
        ComboBoxAvailableDBMS = new javax.swing.JComboBox<>();
        LabelJDBCURL = new javax.swing.JLabel();
        FieldJDBCURL = new javax.swing.JTextField();
        LabelUsername = new javax.swing.JLabel();
        FieldUsername = new javax.swing.JTextField();
        LabelPassword = new javax.swing.JLabel();
        FieldPassword = new javax.swing.JPasswordField();
        BTNTestConn = new javax.swing.JButton();
        PBarTestConnection = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("i18n/Dialogs/AddDatabaseWizard_trans"); // NOI18N
        setTitle(bundle.getString("ADD DATABASE")); // NOI18N
        setAlwaysOnTop(true);
        setUndecorated(true);

        BTNOKAddDB.setText(bundle.getString("OK")); // NOI18N
        BTNOKAddDB.setFocusable(false);
        BTNOKAddDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNOKAddDBActionPerformed(evt);
            }
        });

        BTNCancelAddDB.setText(bundle.getString("CANCEL")); // NOI18N
        BTNCancelAddDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCancelAddDBActionPerformed(evt);
            }
        });

        LabelName.setText(bundle.getString("NAME : ")); // NOI18N

        FieldName.setForeground(new java.awt.Color(204, 204, 204));
        FieldName.setText(bundle.getString("NAME OF DATABASE")); // NOI18N
        FieldName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FieldNameMouseClicked(evt);
            }
        });

        LabelDescription.setText(bundle.getString("DESCRIPTION : ")); // NOI18N

        FieldDescription.setForeground(new java.awt.Color(204, 204, 204));
        FieldDescription.setText(bundle.getString("DESCRIPTION OF DATABASE")); // NOI18N
        FieldDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FieldDescriptionMouseClicked(evt);
            }
        });

        LabelDBMS.setText(bundle.getString("DBMS : ")); // NOI18N

        ComboBoxAvailableDBMS.setModel(new javax.swing.DefaultComboBoxModel<>(supportedDatabaseList));
        ComboBoxAvailableDBMS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBoxAvailableDBMSItemStateChanged(evt);
            }
        });

        LabelJDBCURL.setText(bundle.getString("JDBC URL : ")); // NOI18N

        FieldJDBCURL.setForeground(new java.awt.Color(204, 204, 204));
        FieldJDBCURL.setText("e.g. , jdbc:postgresql://localhost:5432/mydb");
        FieldJDBCURL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FieldJDBCURLMouseClicked(evt);
            }
        });

        LabelUsername.setText(bundle.getString("USERNAME : ")); // NOI18N

        FieldUsername.setForeground(new java.awt.Color(204, 204, 204));
        FieldUsername.setText(bundle.getString("USERNAME")); // NOI18N
        FieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FieldUsernameMouseClicked(evt);
            }
        });

        LabelPassword.setText(bundle.getString("PASSWORD : ")); // NOI18N

        FieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FieldPasswordMouseClicked(evt);
            }
        });

        BTNTestConn.setText(bundle.getString("TEST CONNECTION")); // NOI18N
        BTNTestConn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNTestConnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNOKAddDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNCancelAddDB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelJDBCURL, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelDBMS))
                                    .addComponent(LabelDescription)
                                    .addComponent(LabelName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FieldName)
                                    .addComponent(FieldDescription)
                                    .addComponent(ComboBoxAvailableDBMS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FieldJDBCURL, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelUsername)
                                    .addComponent(LabelPassword))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FieldUsername)
                                    .addComponent(FieldPassword)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BTNTestConn)
                                .addGap(33, 33, 33)
                                .addComponent(PBarTestConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelName)
                    .addComponent(FieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDescription)
                    .addComponent(FieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDBMS)
                    .addComponent(ComboBoxAvailableDBMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJDBCURL)
                    .addComponent(FieldJDBCURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(FieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNTestConn)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PBarTestConnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNOKAddDB)
                    .addComponent(BTNCancelAddDB))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<Auto-Generate>
    private void BTNOKAddDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNOKAddDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNOKAddDBActionPerformed

    private void BTNCancelAddDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCancelAddDBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNCancelAddDBActionPerformed

    private void FieldNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNameMouseClicked

    private void FieldDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldDescriptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldDescriptionMouseClicked

    private void FieldJDBCURLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldJDBCURLMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldJDBCURLMouseClicked

    private void FieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldUsernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsernameMouseClicked

    private void FieldPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FieldPasswordMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPasswordMouseClicked

    private void BTNTestConnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNTestConnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNTestConnActionPerformed

    private void ComboBoxAvailableDBMSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBoxAvailableDBMSItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAvailableDBMSItemStateChanged
    //</Auto-Generate>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FlatSolarizedLightIJTheme.install();
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddDatabaseWizard dialog = new AddDatabaseWizard(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });

                // must request focus
                dialog.BTNCancelAddDB.requestFocusInWindow();
                dialog.setVisible(true);
            }
        });
    }

    //<My-Custom>
    protected String[] supportedDatabaseList;

    protected void HideHead() {
        // Like IDEA style
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
    }
    //</My-Custom>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton BTNCancelAddDB;
    protected javax.swing.JButton BTNOKAddDB;
    protected javax.swing.JButton BTNTestConn;
    protected javax.swing.JComboBox<String> ComboBoxAvailableDBMS;
    protected javax.swing.JTextField FieldDescription;
    protected javax.swing.JTextField FieldJDBCURL;
    protected javax.swing.JTextField FieldName;
    protected javax.swing.JPasswordField FieldPassword;
    protected javax.swing.JTextField FieldUsername;
    protected javax.swing.JLabel LabelDBMS;
    protected javax.swing.JLabel LabelDescription;
    protected javax.swing.JLabel LabelJDBCURL;
    protected javax.swing.JLabel LabelName;
    protected javax.swing.JLabel LabelPassword;
    protected javax.swing.JLabel LabelUsername;
    protected javax.swing.JProgressBar PBarTestConnection;
    // End of variables declaration//GEN-END:variables
}
