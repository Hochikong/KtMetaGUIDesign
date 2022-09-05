/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.hochikong.ktmeta.testOnly;

import javax.swing.JButton;

/**
 *
 * @author ckhoi
 */
public class MyJButton extends JButton{
    private String uid;

    public MyJButton() {
    }
    
    public MyJButton(String uid){
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }
}
