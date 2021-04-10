/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.hochikong.ktmeta.testOnly;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import io.github.hochikong.ktmeta.testOnly.submenus.SubMenu;
import io.github.hochikong.ktmeta.testOnly.submenus.ToolsConfig;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenuItem;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.RootPaneContainer;

/**
 *
 * @author ckhoi
 */
public class BasicForm extends javax.swing.JFrame {

    /**
     * Creates new form BasicForm
     */
    public BasicForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.mapper = new ObjectMapper(new YAMLFactory());
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        File f = new File("config.yml");
        System.out.println(f.getAbsolutePath());

        try {
            menusCfg = mapper.readValue(new File(f.getAbsolutePath()), ToolsConfig.class);
        } catch (IOException ex) {
            Logger.getLogger(BasicForm.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (menusCfg != null) {
            List<SubMenu> menus = menusCfg.getTools();
            for (SubMenu menu : menus) {
                JMenuItem m = new JMenuItem();
                m.setText(menu.getMenuName());
                menuList.add(m);

                objectList.put(menu.getMenuName(), menu.getMenuClass());
                
                m.addActionListener((ActionEvent e) -> {
                    for (JMenuItem mx : menuList) {
                        if (e.getSource() == mx) {
                            try {
                                try {
                                    newObject = (JFrame) Class.forName(menu.getMenuClass()).newInstance();
                                    newObject.setVisible(true);
                                } catch (InstantiationException | IllegalAccessException ex) {
                                    Logger.getLogger(BasicForm.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(BasicForm.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                });
                
                MenuTools.add(m);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBarMain = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        MenuEdit = new javax.swing.JMenu();
        MenuTools = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuFile.setText("File");

        jMenuItem1.setText("jMenuItem1");
        MenuFile.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        MenuFile.add(jMenuItem2);

        MenuBarMain.add(MenuFile);

        MenuEdit.setText("Edit");
        MenuBarMain.add(MenuEdit);

        MenuTools.setText("Tools");
        MenuBarMain.add(MenuTools);

        setJMenuBar(MenuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 352, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatLightFlatIJTheme.install();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicForm().setVisible(true);
            }
        });
    }

    protected ObjectMapper mapper;
    protected ToolsConfig menusCfg;
    protected HashMap<String, String> objectList = new HashMap<>();
    protected List<JMenuItem> menuList = new ArrayList<>();
    protected JFrame newObject;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JMenuBar MenuBarMain;
    protected javax.swing.JMenu MenuEdit;
    protected javax.swing.JMenu MenuFile;
    protected javax.swing.JMenu MenuTools;
    protected javax.swing.JMenuItem jMenuItem1;
    protected javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}