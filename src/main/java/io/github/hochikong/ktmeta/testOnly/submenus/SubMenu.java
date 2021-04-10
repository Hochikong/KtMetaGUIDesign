/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.hochikong.ktmeta.testOnly.submenus;

import java.util.Objects;

/**
 *
 * @author ckhoi
 */
public class SubMenu {
    String MenuName;
    String MenuClass;

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public String getMenuClass() {
        return MenuClass;
    }

    public void setMenuClass(String MenuClass) {
        this.MenuClass = MenuClass;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.MenuName);
        hash = 19 * hash + Objects.hashCode(this.MenuClass);
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
        final SubMenu other = (SubMenu) obj;
        if (!Objects.equals(this.MenuName, other.MenuName)) {
            return false;
        }
        if (!Objects.equals(this.MenuClass, other.MenuClass)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SubMenu{" + "MenuName=" + MenuName + ", MenuClass=" + MenuClass + '}';
    }
}
