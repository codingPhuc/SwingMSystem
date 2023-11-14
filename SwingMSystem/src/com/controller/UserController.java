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
        ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg")), 0, "Jonh", "username1", "password1", "01-01-1990", "1234567890", 300, true));
ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), 1, "Dara", "username2", "password2", "02-02-1991", "9876543210", 300, true));
ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), 2, "Bora", "username3", "password3", "03-03-1992", "5555555555", 300, true));
ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), 3, "Alice", "alice123", "password123", "04-04-1993", "5555555555", 300, true));
ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), 4, "Bob", "bob456", "password456", "05-05-1994", "5555555555", 300, true));
ListUser.add(new ModelUser(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), 5, "Eve", "eve789", "password789", "06-06-1995", "5555555555", 300, true));

    }
   public void deleteUser(int userID) {
   Iterator<ModelUser> iterator = ListUser.iterator();
    while (iterator.hasNext()) {
        ModelUser user = iterator.next();
        if (user.getID() == userID) {
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

     
     
     
}
