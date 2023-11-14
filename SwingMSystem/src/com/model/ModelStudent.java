package com.model;


import com.EventInterface.EventActionStudent;
import javax.swing.Icon;
import com.EventInterface.EventActionUser;

public class ModelStudent {

    private Icon icon; // Retained the icon variable
    private String ID; // Corresponds to the ID column in the database
    private String name; // Corresponds to the Name column in the database
    private String className; // Corresponds to the Class column in the database
    private String birthDay; // Corresponds to the birthDay column in the database
    private String address; // Corresponds to the Address column in the database
    private String phone; // Corresponds to the Phone column in the database

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ModelStudent (Icon icon, String ID, String name, String className, String birthDay, String address, String phone) {
        this.icon = icon;
        this.ID = ID;
        this.name = name;
        this.className = className;
        this.birthDay = birthDay;
        this.address = address;
        this.phone = phone;
    }

    public Object[] toRowTable(EventActionStudent event) {
       
        // You can format and return the data as needed for the table
        return new Object[]{new ModelProfile(icon, name), className, birthDay, address, phone, new ModelActionStudent(this, event)};
    }
}
