package com.Dao;

import com.model.ModelLoginHistory;

import java.sql.Timestamp;
import java.util.List;



public class LoginHistoryDaoTest {

    public static void main(String[] args) {
        testLoginHistoryOperations();
    }

    public static void testLoginHistoryOperations() {
        LoginHistoryDao loginHistoryDao = new LoginHistoryDao();

        // Adding a new login history
        int testUserID = 22; // Assuming this user ID exists in your UserManagement table
        Timestamp testTimeLogin = new Timestamp(System.currentTimeMillis());
        loginHistoryDao.addLoginHistory(testUserID, testTimeLogin);

        // Retrieving login history by user ID
        List<ModelLoginHistory> loginHistoryList = loginHistoryDao.getLoginHistoryByUserID(testUserID);
        

        // Displaying login history details
        System.out.println("Login History for User ID " + testUserID + ":");
        for (ModelLoginHistory loginHistory : loginHistoryList) {
            System.out.println("LoginHistoryID: " + loginHistory.getLoginHistoryID());
            System.out.println("UserID: " + loginHistory.getUserID());
            System.out.println("TimeLogin: " + loginHistory.getTimeLogin());
            System.out.println();
        }

        // Retrieving all login history records
//        List<ModelLoginHistory> allLoginHistoryList = loginHistoryDao.getAllLoginHistory();
//        
//
//        // Deleting the added login history (use the actual LoginHistoryID from the retrieved list)
//        if (!loginHistoryList.isEmpty()) {
//            int loginHistoryIDToDelete = loginHistoryList.get(0).getLoginHistoryID();
//            loginHistoryDao.deleteLoginHistory(loginHistoryIDToDelete);
//            System.out.println("Login history deleted successfully.");
//        }
    }
}
