// TestUserDao.java
package com.Dao;

import com.model.ModelUser;
import java.util.List;

public class TestUserDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Test adding a user
      
        userDao.updateUser(1, "UpdatedUserName", "newpassword456", "newprofile.jpg", 30, "9876543210", 1, 2);

        // Print all users after the update
        
        // Test getting all users
        List<ModelUser> allUsers = userDao.getAllUsers();
        for (ModelUser user : allUsers) {
            System.out.println(user.toString());
        }

        // Test deleting a user
        // Uncomment the following line to test user deletion
        // userDao.deleteUser(1);
    }
}