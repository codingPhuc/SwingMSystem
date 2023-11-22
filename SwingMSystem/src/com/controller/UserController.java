/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controller;

import com.model.ModelStudent;
import com.model.ModelUser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import java.util.Iterator;

/**
 *
 * @author konod
 */
public class UserController {
    List<ModelUser>  ListUser = new  ArrayList<ModelUser>();
    
    
    public UserController()
    {

        ListUser.add( new ModelUser(1,"pokemon", "Dara", "/com/raven/icon/profile1.jpg", 31, "9876543210", -1, 1));
        ListUser.add( new ModelUser(2,"poke", "jacop", "/com/raven/icon/profile1.jpg", 31, "9876543210", -1, 1));

    }
   public void deleteUser(int userID) {
   Iterator<ModelUser> iterator = ListUser.iterator();
    while (iterator.hasNext()) {
        ModelUser user = iterator.next();
        if (user.getUserID() == userID) {
            iterator.remove();
            break; // Assuming there's only one matching user with the given ID
        }
    }
}

    public List<ModelUser> getUsersByStatus(int status) {
    List<ModelUser> usersWithStatus = new ArrayList<>();
    for (ModelUser user : ListUser) {
        if (user.getStatus() == status) {
            usersWithStatus.add(user);
        }
    }
    return usersWithStatus;
}

    
    
    public List<ModelUser> getUsers() {
    return ListUser;
}

     public void addUser() {

    ListUser.add(new ModelUser("/com/raven/icon/profile1.jpg", 6, "Eve", "eve789", "password789", "06-06-1995", "5555555555", 1, true));
}
     
     
}
