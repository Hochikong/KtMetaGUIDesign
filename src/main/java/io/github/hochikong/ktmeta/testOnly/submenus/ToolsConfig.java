/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.hochikong.ktmeta.testOnly.submenus;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author ckhoi
 */
public class ToolsConfig {
    List<SubMenu> Tools;

    public List<SubMenu> getTools() {
        return Tools;
    }

    public void setTools(List<SubMenu> Tools) {
        this.Tools = Tools;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.Tools);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ToolsConfig other = (ToolsConfig) obj;
        if (!Objects.equals(this.Tools, other.Tools)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ToolsConfig{" + "tools=" + Tools + '}';
    }
    
    
}
