package com.model;

import javax.swing.Icon;
import com.EventInterface.EventActionUser;

public class ModelUser {

    private Icon icon;
    private int ID;
    private String name;
    private String user;
    private String pass;
    private String birthDay;
    private String phone;
    private int status;
    private boolean isOnline;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String setUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public ModelUser(Icon icon, int ID, String name, String user, String pass, String birthDay, String phone, int status, boolean isOnline) {
        this.icon = icon;
        this.ID = ID;
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.birthDay = birthDay;
        this.phone = phone;
        this.status = status;
        this.isOnline = isOnline;
    }

    public Object[] toRowTable(EventActionUser event) {
        // You can format and return the data as needed for the table
        return new Object[]{new ModelProfile(icon), name, birthDay, phone, status, isOnline, new ModelActionUser(this, event)};
    }
}
