/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Dao;

import com.model.ModelStudent;
import java.util.List;

/**
 *
 * @author konod
 */
public class StudentDaoTest {
    public static void main(String[] args) {
        // Create an instance of StudentDao
        StudentDao studentDao = new StudentDao();

        // Test addStudent
//        // Test addStudent
//        String major1 = "IT"; // Replace with the actual major code
//        String educationQuality1 = "RU"; // Replace with the actual quality code
//        studentDao.addStudent("John Doe", 2022, 2025, major1, educationQuality1, "1234567890");
//
//        String major2 = "BA"; // Replace with the actual major code
//        String educationQuality2 = "JP"; // Replace with the actual quality code
//        studentDao.addStudent("Jane Doe", 2021, 2024, major2, educationQuality2, "9876543210");
//
//        String major3 = "SSH"; // Replace with the actual major code
//        String educationQuality3 = "HQ"; // Replace with the actual quality code
//        studentDao.addStudent("Bob Smith", 2023, 2026, major3, educationQuality3, "5555555555");
//
//        String major4 = "CE"; // Replace with the actual major code
//        String educationQuality4 = "RU"; // Replace with the actual quality code
//        studentDao.addStudent("Alice Johnson", 2020, 2023, major4, educationQuality4, "1111111111");

        // Test getAllStudents
        System.out.println("All Students:");
        List<ModelStudent> allStudents = studentDao.getAllStudents();
        for (ModelStudent student : allStudents) {
            System.out.println(student);
        }

        // Test getAllMajorAndEducationQuality
        System.out.println("\nStudents with Specific Major and Education Quality:");
      

        // Test updateStudent
        // Note: You should replace the ID with an actual student ID from the database
       

        // Test deleteStudent
        // Note: You should replace the ID with an actual student ID from the database
       
    }
}