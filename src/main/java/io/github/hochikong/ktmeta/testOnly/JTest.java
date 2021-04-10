/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.hochikong.ktmeta.testOnly;

/**
 *
 * @author ckhoi
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTest extends JFrame
{
  public static void main(String[] args)
  {
    JTest t = new JTest();
  }

  Container pane;

  public JTest()
  {
    setSize(500,500);
    setTitle("JTest");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pane = getContentPane();
    pane.setLayout(new GridLayout(1,2));
    JButton old = new JButton("old");
    old.addActionListener(new OldButton());
    pane.add(old);
    JScrollPane scroll = new JScrollPane(new JTextArea(50,20));
    pane.add(scroll);

    setVisible(true);
  }

  private class OldButton implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      pane.setLayout(new GridLayout(1,2));
      JButton old = new JButton("new");
      old.addActionListener(new NewButton());
      pane.add(old);
      JScrollPane scroll = new JScrollPane(new JTextArea(50,20));
      pane.add(scroll);
      pane.validate();
    }
  }

  private class NewButton implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {

      pane.setLayout(new GridLayout(1,2));
      JButton old = new JButton("old");
      old.addActionListener(new OldButton());
      pane.add(old);
      JScrollPane scroll = new JScrollPane(new JTextArea(50,20));
      pane.add(scroll);
      pane.validate();
    }
  }  
}
